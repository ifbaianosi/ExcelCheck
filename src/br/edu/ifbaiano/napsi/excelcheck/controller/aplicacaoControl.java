package br.edu.ifbaiano.napsi.excelcheck.controller;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javafx.stage.FileChooser;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import br.edu.ifbaiano.napsi.excelcheck.utils.Main;
import br.edu.ifbaiano.napsi.excelcheck.view.aplicacao;

public class aplicacaoControl extends aplicacao implements ActionListener{

	JFileChooser fc = new JFileChooser();
	Main xls = new Main();
	File fileSra = new File("");
	File fileNapsi = new File("");

	public aplicacaoControl() {
		super();
		//setResizable(false);
		setVisible(true);
		addEventos();
		fc.setFileFilter(new FileNameExtensionFilter("Arquivo Excel (.xls)","xls"));
		fc.setAcceptAllFileFilterUsed(false);
	}

	public void addEventos(){
		btnNAPSI.addActionListener(this);
		btnSRA.addActionListener(this);
		btnComparar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSRA){
			int returnVal = fc.showOpenDialog(aplicacaoControl.this);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				fileSra = fc.getSelectedFile();
				try {
					HashMap<String, Integer> colinha = xls.carregarXlsSra(fileSra);
					diretorioSRA.setText(fileSra.getAbsolutePath());
					lblNomeSra.setText(fileSra.getName());	               
					lblLinhaSra.setText(colinha.get("linhas").toString());
					lblColunaSra.setText(colinha.get("colunas").toString());
					String vet[] = new String [colinha.get("colunas")];
					vet = xls.obterColunasSra();
					comboBoxSra.removeAllItems();
					for(int i=0; i<colinha.get("colunas"); i++){
						comboBoxSra.addItem(vet[i]);            	 
					}
					if(comboBoxNapsi.getItemCount()!=0){
					for(int i=0; i<vet.length; i++){

						if(vet[i].equals(comboBoxNapsi.getSelectedItem().toString())){
							comboBoxSra.setSelectedItem(comboBoxNapsi.getSelectedItem().toString()); 
						}
					}
					}

				} catch (BiffException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}                        

			}

		}else if(e.getSource()==btnNAPSI){
			int returnVal = fc.showOpenDialog(aplicacaoControl.this);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				fileNapsi = fc.getSelectedFile();
				try {
					HashMap<String, Integer> colinha = xls.carregarXlsNapsi(fileNapsi);
					diretorioNapsi.setText(fileNapsi.getAbsolutePath());
					lblNomeNapsi.setText(fileNapsi.getName());	               
					lblLinhaNapsi.setText(colinha.get("linhas").toString());
					lblColunasNapsi.setText(colinha.get("colunas").toString());
					String vet[] = new String [colinha.get("colunas")];
					vet = xls.obterColunasNapsi();
					comboBoxNapsi.removeAllItems();
					for(int i=0; i<colinha.get("colunas"); i++){
						comboBoxNapsi.addItem(vet[i]);
					}
					if(comboBoxSra.getItemCount()!=0){
					for(int i=0; i<vet.length; i++){

						if(vet[i].equals(comboBoxSra.getSelectedItem().toString())){
							comboBoxNapsi.setSelectedItem(comboBoxSra.getSelectedItem().toString()); 
						}
					}
					}

				} catch (BiffException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}            


			} 


		}else if(e.getSource()==btnComparar){
			try {

				if(diretorioSRA.getText().isEmpty() && diretorioNapsi.getText().isEmpty()==false){
					JOptionPane.showMessageDialog(this, "Favor informar a planilha dos alunos matriculados (SRA)");
					btnSRA.grabFocus();

				}else if(diretorioSRA.getText().isEmpty()==false && diretorioNapsi.getText().isEmpty()){
					JOptionPane.showMessageDialog(this, "Favor informar a planilha com os canditados ao benefício (NAPSI)");
					btnNAPSI.grabFocus();

				}else if(diretorioSRA.getText().isEmpty() && diretorioNapsi.getText().isEmpty() ){
					JOptionPane.showMessageDialog(this, "Favor informar as planilhas antes de iniciar a comparação.");
					btnSRA.grabFocus();

				}else{
					
					int returnVal = fc.showSaveDialog(aplicacaoControl.this);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						File compara = fc.getSelectedFile();
						
						if(compara.getName().endsWith(".xls")==false){
							File nome = new File(getName());
						
						}
						System.out.println(compara.getName());
						xls.setOutputFile(compara.getAbsolutePath());
						xls.setColunaComparacaoSRA(comboBoxSra.getSelectedIndex());
						xls.setColunaComparacaoPsicoSocial(comboBoxNapsi.getSelectedIndex());
						xls.insere(fileSra, fileNapsi);
						JOptionPane.showMessageDialog(this, "O Arquivo foi criado com sucesso!");
						Desktop.getDesktop().open(new File (compara.getAbsolutePath()).getAbsoluteFile());	
					}
				}


			} catch (WriteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (BiffException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}


}
