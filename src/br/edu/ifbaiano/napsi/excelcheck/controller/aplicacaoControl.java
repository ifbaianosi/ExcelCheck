package br.edu.ifbaiano.napsi.excelcheck.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import br.edu.ifbaiano.napsi.excelcheck.view.JfileChooser;
import br.edu.ifbaiano.napsi.excelcheck.view.aplicacao;

public class aplicacaoControl extends aplicacao implements ActionListener{

	JFileChooser fc = new JFileChooser();
	
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
                //This is where a real application would open the file.
                
            } else {
                
            }
            
		}else if(e.getSource()==btnNAPSI){
			int returnVal = fc.showOpenDialog(aplicacaoControl.this);
			 
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                //This is where a real application would open the file.
                
            } else {
                
            }
			
			
		}
		
	}
	

}
