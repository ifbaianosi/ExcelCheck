package br.edu.ifbaiano.napsi.excelcheck.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;

import jxl.read.biff.BiffException;
import br.edu.ifbaiano.napsi.excelcheck.utils.Main;
import br.edu.ifbaiano.napsi.excelcheck.view.aplicacao;

public class aplicacaoControl extends aplicacao implements ActionListener{

	JFileChooser fc = new JFileChooser();
	Main xls = new Main();
	
	public aplicacaoControl() {
		super();
		setResizable(false);
		setVisible(true);
		addEventos();
		fc = new JFileChooser();
	}

	public void addEventos(){
		btnNAPSI.addActionListener(this);
		btnSRA.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSRA){
			int returnVal = fc.showOpenDialog(aplicacaoControl.this);
			 
            if (returnVal == JFileChooser.APPROVE_OPTION) {
               File file = fc.getSelectedFile();
               try {
				HashMap<String, Integer> colinha = xls.carregarXlsSra(file);
				 diretorioSRA.setText(file.getAbsolutePath());
	             lblNomeArquivo.setText(file.getName());	               
	             lblLinhaSra.setText(colinha.get("linhas").toString());
	             lblColunaSra.setText(colinha.get("colunas").toString());
	             String vet[] = new String [colinha.get("colunas")];
	             vet = xls.obterColunasSra();

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
                File file = fc.getSelectedFile();
               
                
            } 
			
			
		}
		
	}
	

}
