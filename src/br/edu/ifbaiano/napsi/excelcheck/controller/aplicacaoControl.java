package br.edu.ifbaiano.napsi.excelcheck.controller;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import br.edu.ifbaiano.napsi.excelcheck.utils.Main;
import br.edu.ifbaiano.napsi.excelcheck.view.JfileChooser;
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
		fc = new JFileChooser();
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
				JOptionPane.showMessageDialog(this, "Escolha o diretório onde o arquivo com a interseção dos dados será salvo.");
				int returnVal = fc.showSaveDialog(aplicacaoControl.this);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File teste = fc.getSelectedFile();
					xls.setOutputFile(teste.getAbsolutePath());
					xls.setColunaComparacaoSRA(comboBoxSra.getSelectedIndex());
					xls.setColunaComparacaoPsicoSocial(comboBoxNapsi.getSelectedIndex());
					xls.insere(fileSra, fileNapsi);
					JOptionPane.showMessageDialog(this, "Arquivo criado");
					Desktop.getDesktop().open(new File (teste.getAbsolutePath()).getAbsoluteFile());	
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
