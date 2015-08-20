package br.edu.ifbaiano.napsi.excelcheck.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.event.KeyEvent;
import javax.swing.border.MatteBorder;

public class aplicacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel_logoIF = null;
	private JPanel jPanel_topo = null;
	private JPanel jPanel_conteudo = null;
	private JPanel jPanel_rodape = null;
	private JPanel jPanel_titulo = null;
	private JLabel jLabel4 = null;
	private JPanel jPanel5 = null;
	private JLabel jLabel16 = null;
	private JLabel jLabel18 = null;
	private JLabel jLabel19 = null;
	private JLabel jLabel17 = null;
	private JLabel jLabel20 = null;
	private JLabel jLabel21 = null;
	private JPanel jPanel_toolBars = null;
	private JButton jButton_fechar = null;
	private JButton jButton_ajuda = null;
	private JLabel jLabel26 = null;
	private JLabel jLabel27 = null;
	private JPanel jPanel10 = null;
	private JLabel jLabel28 = null;
	private JLabel jLabel29 = null;
	private JLabel jLabel30 = null;
	private JLabel jLabel_imgMEC = null;
	private JTextField textField;
	private JTextField textField_1;
	public JButton btnNAPSI;
	public JButton btnSRA;
	private JLabel lblNomeDoArquivo_1;
	private JLabel label;
	private JLabel lblColunas_1;
	private JLabel lblLinhas_1;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JLabel lblAPlanilhaInforma;
	private JTextField textField_3;
	private JButton btnComparar;
	
	
	
	
	
	
	/**
	 * This method initializes jLabel_logoIF	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabel_logoIF() {
		if (jLabel_logoIF == null) {
			jLabel_logoIF = new JLabel();
			jLabel_logoIF.setText("");
			jLabel_logoIF.setBackground(Color.white);
			jLabel_logoIF.setOpaque(true);
			jLabel_logoIF.setIcon(new ImageIcon(aplicacao.class.getResource("/br/edu/ifbaiano/napsi/excelcheck/img/if-baiano.jpg")));
		}
		return jLabel_logoIF;
	}

	/**
	 * This method initializes jPanel_topo	
	 * 	
	 * @return javax.swing.JPanel	
	 */	
	private JPanel getJPanel_topo() {
		if (jPanel_topo == null) {
			GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
			gridBagConstraints24.gridx = 2;
			gridBagConstraints24.anchor = GridBagConstraints.EAST;
			gridBagConstraints24.insets = new Insets(8, 0, 0, 9);
			gridBagConstraints24.fill = GridBagConstraints.NONE;
			gridBagConstraints24.gridy = 0;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 3;
			gridBagConstraints4.anchor = GridBagConstraints.WEST;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints4.gridy = 0;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
			gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.gridy = 0;
			jPanel_topo = new JPanel();
			jPanel_topo.setLayout(new GridBagLayout());
			jPanel_topo.setBackground(Color.white);
			jPanel_topo.add(getJLabel_logoIF(), gridBagConstraints);
			jPanel_topo.add(getJLabel_imgMEC(), gridBagConstraints24);
		}
		return jPanel_topo;
	}

	/**
	 * This method initializes jPanel_conteudo	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_conteudo() {
		if (jPanel_conteudo == null) {
			jLabel27 = new JLabel();
			jLabel27.setBounds(631, 26, 3, 346);
			jLabel27.setText(" ");
			jLabel26 = new JLabel();
			jLabel26.setBounds(0, 26, 3, 346);
			jLabel26.setText(" ");
			jPanel_conteudo = new JPanel();
			jPanel_conteudo.setBackground(Color.WHITE);
			jPanel_conteudo.setLayout(null);
			jPanel_conteudo.add(getJPanel_titulo());
			jPanel_conteudo.add(jLabel26);
			jPanel_conteudo.add(jLabel27);
			
			JLabel lblColoqueAPlanilha = new JLabel("Coloque a planilha dos alunos cadastrados(SRA):");
			lblColoqueAPlanilha.setBounds(10, 37, 293, 14);
			jPanel_conteudo.add(lblColoqueAPlanilha);
			
			textField = new JTextField();
			textField.setBounds(10, 62, 540, 20);
			jPanel_conteudo.add(textField);
			textField.setColumns(10);
			
			btnSRA = new JButton("");
			btnSRA.setBounds(560, 61, 58, 23);
			jPanel_conteudo.add(btnSRA);
			
			JLabel lblNomeDoArquivo = new JLabel("Nome do arquivo:");
			lblNomeDoArquivo.setBounds(10, 93, 99, 14);
			jPanel_conteudo.add(lblNomeDoArquivo);
			
			JLabel lblNewLabel = new JLabel(".");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel.setBounds(122, 93, 502, 14);
			jPanel_conteudo.add(lblNewLabel);
			
			JLabel lblColunas = new JLabel("Colunas:");
			lblColunas.setBounds(10, 117, 46, 14);
			jPanel_conteudo.add(lblColunas);
			
			JLabel lblNewLabel_1 = new JLabel(".");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_1.setBounds(122, 118, 161, 14);
			jPanel_conteudo.add(lblNewLabel_1);
			
			JLabel lblLinhas = new JLabel("Linhas:");
			lblLinhas.setBounds(10, 142, 46, 14);
			jPanel_conteudo.add(lblLinhas);
			
			JLabel lblNewLabel_2 = new JLabel(".");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_2.setBounds(122, 142, 161, 14);
			jPanel_conteudo.add(lblNewLabel_2);
			
			JLabel lblColoqueAPlanilha_1 = new JLabel("Coloque a planilha com os candidatos ao benef\u00EDcio(NAPSI):");
			lblColoqueAPlanilha_1.setBounds(10, 234, 293, 14);
			jPanel_conteudo.add(lblColoqueAPlanilha_1);
			
			textField_1 = new JTextField();
			textField_1.setBounds(10, 256, 540, 20);
			jPanel_conteudo.add(textField_1);
			textField_1.setColumns(10);
			jPanel_conteudo.add(getBtnNAPSI());
			jPanel_conteudo.add(getLblNomeDoArquivo_1());
			jPanel_conteudo.add(getLabel());
			jPanel_conteudo.add(getLblColunas_1());
			jPanel_conteudo.add(getLblLinhas_1());
			jPanel_conteudo.add(getLabel_1());
			jPanel_conteudo.add(getLabel_2());
			jPanel_conteudo.add(getLblNewLabel_3());
			jPanel_conteudo.add(getTextField_2());
			jPanel_conteudo.add(getLblAPlanilhaInforma());
			jPanel_conteudo.add(getTextField_3());
			jPanel_conteudo.add(getBtnComparar());
		}
		return jPanel_conteudo;
	}

	/**
	 * This method initializes jPanel_rodape	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_rodape() {
		if (jPanel_rodape == null) {
			GridBagConstraints gridBagConstraints49 = new GridBagConstraints();
			gridBagConstraints49.gridx = 0;
			gridBagConstraints49.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints49.gridy = 0;
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 0;
			gridBagConstraints5.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.insets = new Insets(2, 0, 0, 0);
			gridBagConstraints5.gridy = 1;
			jPanel_rodape = new JPanel();
			jPanel_rodape.setLayout(new GridBagLayout());
			jPanel_rodape.setBackground(new Color(255, 51, 51));
			jPanel_rodape.add(getJPanel5(), gridBagConstraints5);
			jPanel_rodape.add(getJPanel_toolBars(), gridBagConstraints49);
		}
		return jPanel_rodape;
	}

	/**
	 * This method initializes jPanel_titulo	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_titulo() {
		if (jPanel_titulo == null) {
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints6.anchor = GridBagConstraints.NORTH;
			gridBagConstraints6.weightx = 1.0;
			gridBagConstraints6.insets = new Insets(2, 0, 0, 0);
			gridBagConstraints6.gridy = 0;
			jLabel4 = new JLabel();
			jLabel4.setText("Compara\u00E7\u00E3o de Planilhas");
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel4.setBackground(new Color(51, 153, 0));
			jLabel4.setOpaque(true);
			jLabel4.setForeground(Color.white);
			jPanel_titulo = new JPanel();
			jPanel_titulo.setBounds(0, 0, 634, 26);
			jPanel_titulo.setLayout(new GridBagLayout());
			jPanel_titulo.setBackground(new Color(255, 51, 51));
			jPanel_titulo.add(jLabel4, gridBagConstraints6);
		}
		return jPanel_titulo;
	}

	/**
	 * This method initializes jPanel5	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			GridBagConstraints gridBagConstraints53 = new GridBagConstraints();
			gridBagConstraints53.gridx = 0;
			gridBagConstraints53.anchor = GridBagConstraints.WEST;
			gridBagConstraints53.gridwidth = 1;
			gridBagConstraints53.gridheight = 5;
			gridBagConstraints53.gridy = 0;
			GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
			gridBagConstraints31.gridx = 1;
			gridBagConstraints31.anchor = GridBagConstraints.EAST;
			gridBagConstraints31.weightx = 0.0;
			gridBagConstraints31.insets = new Insets(0, 0, 4, 4);
			gridBagConstraints31.gridy = 4;
			jLabel21 = new JLabel();
			jLabel21.setText("Ramal: 15");
			jLabel21.setFont(new Font("Dialog", Font.PLAIN, 8));
			GridBagConstraints gridBagConstraints30 = new GridBagConstraints();
			gridBagConstraints30.fill = GridBagConstraints.BOTH;
			gridBagConstraints30.gridx = 1;
			gridBagConstraints30.weightx = 0.0;
			gridBagConstraints30.insets = new Insets(0, 0, 0, 4);
			gridBagConstraints30.gridy = 3;
			jLabel20 = new JLabel();
			jLabel20.setText("N\u00FAcleo de Apoio e Pedag\u00F3gico e Psicosocial");
			jLabel20.setFont(new Font("Dialog", Font.PLAIN, 8));
			GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
			gridBagConstraints27.gridx = 1;
			gridBagConstraints27.anchor = GridBagConstraints.EAST;
			gridBagConstraints27.weightx = 0.0;
			gridBagConstraints27.insets = new Insets(4, 0, 0, 4);
			gridBagConstraints27.gridy = 1;
			jLabel17 = new JLabel();
			jLabel17.setText("NAPSI");
			GridBagConstraints gridBagConstraints29 = new GridBagConstraints();
			gridBagConstraints29.gridx = 0;
			gridBagConstraints29.anchor = GridBagConstraints.EAST;
			gridBagConstraints29.insets = new Insets(4, 4, 0, 10);
			gridBagConstraints29.weightx = 1.0;
			gridBagConstraints29.gridy = 1;
			jLabel19 = new JLabel();
			jLabel19.setText("NGTI");
			GridBagConstraints gridBagConstraints28 = new GridBagConstraints();
			gridBagConstraints28.gridx = 0;
			gridBagConstraints28.anchor = GridBagConstraints.EAST;
			gridBagConstraints28.insets = new Insets(0, 4, 4, 10);
			gridBagConstraints28.weightx = 1.0;
			gridBagConstraints28.gridy = 4;
			jLabel18 = new JLabel();
			jLabel18.setText("Ramal.: 32");
			jLabel18.setFont(new Font("Dialog", Font.PLAIN, 8));
			GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
			gridBagConstraints26.gridx = 0;
			gridBagConstraints26.anchor = GridBagConstraints.EAST;
			gridBagConstraints26.insets = new Insets(0, 4, 0, 10);
			gridBagConstraints26.weightx = 1.0;
			gridBagConstraints26.gridy = 3;
			jLabel16 = new JLabel();
			jLabel16.setText("Núcleo de Gestão em Tecnologia da Informação");
			jLabel16.setFont(new Font("Dialog", Font.PLAIN, 8));
			jPanel5 = new JPanel();
			GridBagLayout gbl_jPanel5 = new GridBagLayout();
			gbl_jPanel5.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0};
			gbl_jPanel5.columnWeights = new double[]{0.0, 1.0};
			jPanel5.setLayout(gbl_jPanel5);
			jPanel5.setFont(new Font("Dialog", Font.PLAIN, 10));
			jPanel5.setBackground(new Color(204, 255, 204));
			jPanel5.add(jLabel16, gridBagConstraints26);
			jPanel5.add(jLabel18, gridBagConstraints28);
			jPanel5.add(jLabel19, gridBagConstraints29);
			jPanel5.add(jLabel17, gridBagConstraints27);
			jPanel5.add(jLabel20, gridBagConstraints30);
			jPanel5.add(jLabel21, gridBagConstraints31);
			jPanel5.add(getJPanel10(), gridBagConstraints53);
		}
		return jPanel5;
	}




 

	/**
	 * This method initializes jPanel_toolBars	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_toolBars() {
		if (jPanel_toolBars == null) {
			GridBagConstraints gridBagConstraints48 = new GridBagConstraints();
			gridBagConstraints48.gridx = 0;
			gridBagConstraints48.weightx = 1.0;
			gridBagConstraints48.anchor = GridBagConstraints.WEST;
			gridBagConstraints48.insets = new Insets(2, 0, 5, 5);
			gridBagConstraints48.gridy = 0;
			GridBagConstraints gridBagConstraints47 = new GridBagConstraints();
			gridBagConstraints47.gridx = 1;
			gridBagConstraints47.insets = new Insets(5, 0, 5, 5);
			gridBagConstraints47.weightx = 1.0;
			gridBagConstraints47.anchor = GridBagConstraints.EAST;
			gridBagConstraints47.gridy = 0;
			jPanel_toolBars = new JPanel();
			jPanel_toolBars.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			jPanel_toolBars.setLayout(new GridBagLayout());
			jPanel_toolBars.setBackground(Color.white);
			jPanel_toolBars.add(getJButton_fechar(), gridBagConstraints47);
			jPanel_toolBars.add(getJButton_ajuda(), gridBagConstraints48);
		}
		return jPanel_toolBars;
	}

	/**
	 * This method initializes jButton_fechar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButton_fechar() {
		if (jButton_fechar == null) {
			jButton_fechar = new JButton();
			jButton_fechar.setText("Sair");
			jButton_fechar.setMnemonic(KeyEvent.VK_UNDEFINED);
			jButton_fechar.setIcon(new ImageIcon(aplicacao.class.getResource("/br/edu/ifbaiano/napsi/excelcheck/img/nav_sair.png")));
			jButton_fechar.setToolTipText("Fechar [Esc]");
			jButton_fechar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
				}
			});
		}
		return jButton_fechar;
	}

	/**
	 * This method initializes jButton_ajuda	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_ajuda() {
		if (jButton_ajuda == null) {
			jButton_ajuda = new JButton();
			jButton_ajuda.setText("Ajuda");
			jButton_ajuda.setVisible(false);
		}
		return jButton_ajuda;
	}

	/**
	 * This method initializes jPanel10	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel10() {
		if (jPanel10 == null) {
			GridBagConstraints gridBagConstraints52 = new GridBagConstraints();
			gridBagConstraints52.gridx = 0;
			gridBagConstraints52.anchor = GridBagConstraints.WEST;
			gridBagConstraints52.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints52.insets = new Insets(0, 4, 4, 0);
			gridBagConstraints52.gridy = 2;
			jLabel30 = new JLabel();
			jLabel30.setText("Tel.: (73) 3536-1210");
			jLabel30.setFont(new Font("Dialog", Font.PLAIN, 10));
			GridBagConstraints gridBagConstraints51 = new GridBagConstraints();
			gridBagConstraints51.gridx = 0;
			gridBagConstraints51.anchor = GridBagConstraints.WEST;
			gridBagConstraints51.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints51.insets = new Insets(0, 4, 0, 0);
			gridBagConstraints51.gridy = 1;
			jLabel29 = new JLabel();
			jLabel29.setText("BR 420 (Rodovia Santa Inês – Ubaíra), Zona Rural, Bahia");
			jLabel29.setFont(new Font("Dialog", Font.PLAIN, 10));
			GridBagConstraints gridBagConstraints50 = new GridBagConstraints();
			gridBagConstraints50.gridx = 0;
			gridBagConstraints50.anchor = GridBagConstraints.WEST;
			gridBagConstraints50.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints50.insets = new Insets(4, 4, 0, 0);
			gridBagConstraints50.gridy = 0;
			jLabel28 = new JLabel();
			jLabel28.setText("IF Baiano – Campus Santa Inês");
			jLabel28.setFont(new Font("Dialog", Font.PLAIN, 10));
			jPanel10 = new JPanel();
			jPanel10.setLayout(new GridBagLayout());
			jPanel10.setBackground(new Color(204, 255, 204));
			jPanel10.add(jLabel28, gridBagConstraints50);
			jPanel10.add(jLabel29, gridBagConstraints51);
			jPanel10.add(jLabel30, gridBagConstraints52);
		}
		return jPanel10;
	}

	

	/**
	 * This method initializes jLabel_imgMEC	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabel_imgMEC() {
		if (jLabel_imgMEC == null) {
			jLabel_imgMEC = new JLabel();
			jLabel_imgMEC.setText("");
			jLabel_imgMEC.setIcon(new ImageIcon(aplicacao.class.getResource("/br/edu/ifbaiano/napsi/excelcheck/img/ministerio_da_educacao_90x30.jpg")));
			
			/**
			 * só executa apartir da versão 1.3 do java
			 */
			/*File logo;
			try {
				logo = new File(getClass().getResource("/br/edu/ifbaiano/calculadora/img/1268245122.jpg").toURI());
				BufferedImage imgMEC = ImageIO.read(logo); 
				
				Image imagemMenor = imgMEC.getScaledInstance(90, 30, Image.SCALE_SMOOTH);
				jLabel_imgMEC.setIcon(new ImageIcon(imagemMenor));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		return jLabel_imgMEC;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				aplicacao thisClass = new aplicacao();
				thisClass.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public aplicacao() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(650, 687);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/edu/ifbaiano/napsi/excelcheck/img/LogoIF.jpg")));
		this.setContentPane(getJContentPane());
		this.setTitle("Calculadora");
		this.setLocationRelativeTo(null);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			e.setStackTrace(null);
		}
		
		defaultBotton();
		
	}

	private void defaultBotton() {
		/**
		 *  botao padrao da tela  
		 */
		/*this.getRootPane().setDefaultButton(getJButton());
		UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);*/
		
		/**
		 *  evento da tecla Esc 
		 *  fecha a janela  
		 */
		getJButton_fechar().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ESCAPE"), "actionName");
		getJButton_fechar().getActionMap().put("actionName",new AbstractAction("actionName") 
			{
				public void actionPerformed(ActionEvent evt) {
					dispose();
				}
			}
		);
	}

	
	
	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJPanel_topo(), BorderLayout.NORTH);
			jContentPane.add(getJPanel_rodape(), BorderLayout.SOUTH);
			jContentPane.add(getJPanel_conteudo(), BorderLayout.CENTER);
		}
		return jContentPane;
	}	
	private JButton getBtnNAPSI() {
		if (btnNAPSI == null) {
			btnNAPSI = new JButton("");
			btnNAPSI.setBounds(563, 255, 58, 23);
		}
		return btnNAPSI;
	}
	private JLabel getLblNomeDoArquivo_1() {
		if (lblNomeDoArquivo_1 == null) {
			lblNomeDoArquivo_1 = new JLabel("Nome do arquivo:");
			lblNomeDoArquivo_1.setBounds(10, 287, 99, 14);
		}
		return lblNomeDoArquivo_1;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel(".");
			label.setFont(new Font("Tahoma", Font.BOLD, 11));
			label.setBounds(122, 287, 502, 14);
		}
		return label;
	}
	private JLabel getLblColunas_1() {
		if (lblColunas_1 == null) {
			lblColunas_1 = new JLabel("Colunas:");
			lblColunas_1.setBounds(10, 312, 46, 14);
		}
		return lblColunas_1;
	}
	private JLabel getLblLinhas_1() {
		if (lblLinhas_1 == null) {
			lblLinhas_1 = new JLabel("Linhas:");
			lblLinhas_1.setBounds(10, 337, 46, 14);
		}
		return lblLinhas_1;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel(".");
			label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			label_1.setBounds(122, 312, 161, 14);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel(".");
			label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			label_2.setBounds(122, 337, 161, 14);
		}
		return label_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("A planilha informada possue x colunas. Informe qual ser\u00E1 usada para compara\u00E7\u00E3o:");
			lblNewLabel_3.setBounds(10, 167, 415, 14);
		}
		return lblNewLabel_3;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(10, 189, 86, 20);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JLabel getLblAPlanilhaInforma() {
		if (lblAPlanilhaInforma == null) {
			lblAPlanilhaInforma = new JLabel("A planilha informada possue x colunas. Informe qual ser\u00E1 usada para compara\u00E7\u00E3o:");
			lblAPlanilhaInforma.setBounds(10, 362, 415, 14);
		}
		return lblAPlanilhaInforma;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(10, 387, 86, 20);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JButton getBtnComparar() {
		if (btnComparar == null) {
			btnComparar = new JButton("Comparar");
			btnComparar.setBounds(266, 436, 89, 23);
		}
		return btnComparar;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
