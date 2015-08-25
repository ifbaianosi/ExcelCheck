package br.edu.ifbaiano.napsi.excelcheck.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class aplicacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel_logoIF = null;
	private JPanel jPanel_topo = null;
	private JPanel jPanel_conteudo = null;
	private JPanel jPanel_rodape = null;
	private JPanel jPanel_titulo = null;
	private JPanel jPanel10 = null;
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
	private JLabel jLabel28 = null;
	private JLabel jLabel29 = null;
	private JLabel jLabel30 = null;
	private JLabel jLabel_imgMEC = null;	
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JPanel panel;
	private JLabel lblColoqueAPlanilha;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	protected JComboBox comboBoxNapsi;
	protected JButton btnComparar;
	protected JLabel lblNomeSra;
	protected JLabel lblColunaSra;
	protected JLabel lblLinhaSra;
	protected JLabel lblNomeNapsi;
	protected JLabel lblColunasNapsi;
	protected JLabel lblLinhaNapsi;
	protected JTextField diretorioSRA;
	protected JButton btnSRA;
	protected JComboBox comboBoxSra;
	protected JTextField diretorioNapsi;
	protected JButton btnNAPSI;
	
	
	
	
	
	
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
			jLabel27.setText(" ");
			jLabel26 = new JLabel();
			jLabel26.setText(" ");
			jPanel_conteudo = new JPanel();
			jPanel_conteudo.setBackground(Color.WHITE);
			jPanel_conteudo.setLayout(new BorderLayout(0, 0));
			jPanel_conteudo.add(jLabel26);
			jPanel_conteudo.add(jLabel27);
			jPanel_conteudo.add(getPanel(), BorderLayout.CENTER);
			jPanel_conteudo.add(getJPanel_titulo(), BorderLayout.NORTH);
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
			gridBagConstraints5.fill = GridBagConstraints.BOTH;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.insets = new Insets(2, 0, 0, 0);
			gridBagConstraints5.gridy = 1;
			jPanel_rodape = new JPanel();
			GridBagLayout gbl_jPanel_rodape = new GridBagLayout();
			gbl_jPanel_rodape.rowWeights = new double[]{0.0, 1.0};
			jPanel_rodape.setLayout(gbl_jPanel_rodape);
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
			gridBagConstraints6.anchor = GridBagConstraints.SOUTH;
			gridBagConstraints6.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.weightx = 1.0;
			gridBagConstraints6.gridy = 0;
			jLabel4 = new JLabel();
			jLabel4.setText("Compara\u00E7\u00E3o de Planilhas");
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel4.setBackground(new Color(51, 153, 0));
			jLabel4.setOpaque(true);
			jLabel4.setForeground(Color.white);
			jPanel_titulo = new JPanel();
			GridBagLayout gbl_jPanel_titulo = new GridBagLayout();
			gbl_jPanel_titulo.rowWeights = new double[]{1.0};
			gbl_jPanel_titulo.rowHeights = new int[]{26};
			jPanel_titulo.setLayout(gbl_jPanel_titulo);
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
			gridBagConstraints53.gridheight = 5;
			gridBagConstraints53.gridy = 0;
			GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
			gridBagConstraints31.gridx = 1;
			gridBagConstraints31.anchor = GridBagConstraints.EAST;
			gridBagConstraints31.weightx = 0.0;
			gridBagConstraints31.insets = new Insets(0, 0, 4, 4);
			gridBagConstraints31.gridy = 4;
			jLabel21 = new JLabel();
			jLabel21.setText("Ramal.: 13");
			jLabel21.setFont(new Font("Dialog", Font.PLAIN, 8));
			GridBagConstraints gridBagConstraints30 = new GridBagConstraints();
			gridBagConstraints30.gridx = 1;
			gridBagConstraints30.anchor = GridBagConstraints.EAST;
			gridBagConstraints30.weightx = 0.0;
			gridBagConstraints30.insets = new Insets(0, 0, 0, 4);
			gridBagConstraints30.gridy = 3;
			jLabel20 = new JLabel();
			jLabel20.setText("Núcleo de Apoio a Gestão de Pessoas");
			jLabel20.setFont(new Font("Dialog", Font.PLAIN, 8));
			GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
			gridBagConstraints27.gridx = 1;
			gridBagConstraints27.anchor = GridBagConstraints.EAST;
			gridBagConstraints27.weightx = 0.0;
			gridBagConstraints27.insets = new Insets(4, 0, 0, 4);
			gridBagConstraints27.gridy = 1;
			jLabel17 = new JLabel();
			jLabel17.setText("NAGP");
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
			jPanel5.setLayout(new GridBagLayout());
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
	 * This method initializes jPanel_toolBars	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_toolBars() {
		if (jPanel_toolBars == null) {
			GridBagConstraints gridBagConstraints48 = new GridBagConstraints();
			gridBagConstraints48.gridx = 0;
			gridBagConstraints48.weightx = 1.0;
			gridBagConstraints48.insets = new Insets(2, 0, 0, 5);
			gridBagConstraints48.gridy = 0;
			GridBagConstraints gridBagConstraints47 = new GridBagConstraints();
			gridBagConstraints47.gridx = 2;
			gridBagConstraints47.insets = new Insets(5, 0, 0, 0);
			gridBagConstraints47.weightx = 1.0;
			gridBagConstraints47.gridy = 0;
			jPanel_toolBars = new JPanel();
			jPanel_toolBars.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			jPanel_toolBars.setLayout(new GridBagLayout());
			jPanel_toolBars.setBackground(Color.white);
			
			JLabel lblObsOBoto = new JLabel("Obs: O bot\u00E3o \"Comparar\" ir\u00E1 criar um novo arquivo com a interse\u00E7\u00E3o dos dados.");
			GridBagConstraints gbc_lblObsOBoto = new GridBagConstraints();
			gbc_lblObsOBoto.insets = new Insets(0, 0, 0, 5);
			gbc_lblObsOBoto.gridx = 1;
			gbc_lblObsOBoto.gridy = 0;
			jPanel_toolBars.add(lblObsOBoto, gbc_lblObsOBoto);
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
			jButton_ajuda.setVisible(true);
		}
		return jButton_ajuda;
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
		this.setSize(637, 664);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/edu/ifbaiano/napsi/excelcheck/img/LogoIF.jpg")));
		this.setContentPane(getJContentPane());
		this.setTitle("Excel Check");
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
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel();
			label_3.setText("IF Baiano \u2013 Campus Santa In\u00EAs");
			label_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel();
			label_4.setText("BR 420 (Rodovia Santa In\u00EAs \u2013 Uba\u00EDra), Zona Rural, Bahia");
			label_4.setFont(new Font("Dialog", Font.PLAIN, 10));
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel();
			label_5.setText("Tel.: (73) 3536-1210");
			label_5.setFont(new Font("Dialog", Font.PLAIN, 10));
		}
		return label_5;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{20, 99, 127, 284, 54, 0, 0};
			gbl_panel.rowHeights = new int[]{30, 25, 30, 25, 25, 25, 25, 25, 25, 30, 25, 25, 25, 25, 25, 40, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			GridBagConstraints gbc_lblColoqueAPlanilha = new GridBagConstraints();
			gbc_lblColoqueAPlanilha.anchor = GridBagConstraints.NORTHWEST;
			gbc_lblColoqueAPlanilha.insets = new Insets(0, 0, 5, 5);
			gbc_lblColoqueAPlanilha.gridwidth = 3;
			gbc_lblColoqueAPlanilha.gridx = 1;
			gbc_lblColoqueAPlanilha.gridy = 1;
			panel.add(getLblColoqueAPlanilha(), gbc_lblColoqueAPlanilha);
			GridBagConstraints gbc_diretorioSRA = new GridBagConstraints();
			gbc_diretorioSRA.fill = GridBagConstraints.HORIZONTAL;
			gbc_diretorioSRA.insets = new Insets(0, 0, 5, 5);
			gbc_diretorioSRA.gridwidth = 3;
			gbc_diretorioSRA.gridx = 1;
			gbc_diretorioSRA.gridy = 2;
			panel.add(getDiretorioSRA(), gbc_diretorioSRA);
			GridBagConstraints gbc_btnSRA = new GridBagConstraints();
			gbc_btnSRA.fill = GridBagConstraints.VERTICAL;
			gbc_btnSRA.insets = new Insets(0, 0, 5, 5);
			gbc_btnSRA.gridx = 4;
			gbc_btnSRA.gridy = 2;
			panel.add(getBtnSRA(), gbc_btnSRA);
			GridBagConstraints gbc_label_1 = new GridBagConstraints();
			gbc_label_1.anchor = GridBagConstraints.NORTH;
			gbc_label_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_label_1.insets = new Insets(0, 0, 5, 5);
			gbc_label_1.gridx = 1;
			gbc_label_1.gridy = 3;
			panel.add(getLabel_1(), gbc_label_1);
			GridBagConstraints gbc_lblNomeSra = new GridBagConstraints();
			gbc_lblNomeSra.fill = GridBagConstraints.BOTH;
			gbc_lblNomeSra.insets = new Insets(0, 0, 5, 5);
			gbc_lblNomeSra.gridwidth = 3;
			gbc_lblNomeSra.gridx = 2;
			gbc_lblNomeSra.gridy = 3;
			panel.add(getLblNomeSra(), gbc_lblNomeSra);
			GridBagConstraints gbc_label_2 = new GridBagConstraints();
			gbc_label_2.anchor = GridBagConstraints.NORTHWEST;
			gbc_label_2.insets = new Insets(0, 0, 5, 5);
			gbc_label_2.gridx = 1;
			gbc_label_2.gridy = 4;
			panel.add(getLabel_2(), gbc_label_2);
			GridBagConstraints gbc_lblColunaSra = new GridBagConstraints();
			gbc_lblColunaSra.anchor = GridBagConstraints.WEST;
			gbc_lblColunaSra.fill = GridBagConstraints.VERTICAL;
			gbc_lblColunaSra.insets = new Insets(0, 0, 5, 5);
			gbc_lblColunaSra.gridwidth = 2;
			gbc_lblColunaSra.gridx = 2;
			gbc_lblColunaSra.gridy = 4;
			panel.add(getLblColunaSra(), gbc_lblColunaSra);
			GridBagConstraints gbc_label_6 = new GridBagConstraints();
			gbc_label_6.anchor = GridBagConstraints.NORTHWEST;
			gbc_label_6.insets = new Insets(0, 0, 5, 5);
			gbc_label_6.gridx = 1;
			gbc_label_6.gridy = 5;
			panel.add(getLabel_6(), gbc_label_6);
			GridBagConstraints gbc_lblLinhaSra = new GridBagConstraints();
			gbc_lblLinhaSra.anchor = GridBagConstraints.WEST;
			gbc_lblLinhaSra.fill = GridBagConstraints.VERTICAL;
			gbc_lblLinhaSra.insets = new Insets(0, 0, 5, 5);
			gbc_lblLinhaSra.gridwidth = 2;
			gbc_lblLinhaSra.gridx = 2;
			gbc_lblLinhaSra.gridy = 5;
			panel.add(getLblLinhaSra(), gbc_lblLinhaSra);
			GridBagConstraints gbc_label_7 = new GridBagConstraints();
			gbc_label_7.anchor = GridBagConstraints.NORTH;
			gbc_label_7.fill = GridBagConstraints.HORIZONTAL;
			gbc_label_7.insets = new Insets(0, 0, 5, 5);
			gbc_label_7.gridwidth = 3;
			gbc_label_7.gridx = 1;
			gbc_label_7.gridy = 6;
			panel.add(getLabel_7(), gbc_label_7);
			GridBagConstraints gbc_comboBoxSra = new GridBagConstraints();
			gbc_comboBoxSra.fill = GridBagConstraints.BOTH;
			gbc_comboBoxSra.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxSra.gridwidth = 2;
			gbc_comboBoxSra.gridx = 1;
			gbc_comboBoxSra.gridy = 7;
			panel.add(getComboBoxSra(), gbc_comboBoxSra);
			GridBagConstraints gbc_label_8 = new GridBagConstraints();
			gbc_label_8.anchor = GridBagConstraints.NORTHWEST;
			gbc_label_8.insets = new Insets(0, 0, 5, 5);
			gbc_label_8.gridwidth = 3;
			gbc_label_8.gridx = 1;
			gbc_label_8.gridy = 8;
			panel.add(getLabel_8(), gbc_label_8);
			GridBagConstraints gbc_diretorioNapsi = new GridBagConstraints();
			gbc_diretorioNapsi.fill = GridBagConstraints.HORIZONTAL;
			gbc_diretorioNapsi.insets = new Insets(0, 0, 5, 5);
			gbc_diretorioNapsi.gridwidth = 3;
			gbc_diretorioNapsi.gridx = 1;
			gbc_diretorioNapsi.gridy = 9;
			panel.add(getDiretorioNapsi(), gbc_diretorioNapsi);
			GridBagConstraints gbc_btnNAPSI = new GridBagConstraints();
			gbc_btnNAPSI.fill = GridBagConstraints.VERTICAL;
			gbc_btnNAPSI.insets = new Insets(0, 0, 5, 5);
			gbc_btnNAPSI.gridx = 4;
			gbc_btnNAPSI.gridy = 9;
			panel.add(getBtnNAPSI(), gbc_btnNAPSI);
			GridBagConstraints gbc_label_9 = new GridBagConstraints();
			gbc_label_9.anchor = GridBagConstraints.NORTH;
			gbc_label_9.fill = GridBagConstraints.HORIZONTAL;
			gbc_label_9.insets = new Insets(0, 0, 5, 5);
			gbc_label_9.gridx = 1;
			gbc_label_9.gridy = 10;
			panel.add(getLabel_9(), gbc_label_9);
			GridBagConstraints gbc_lblNomeNapsi = new GridBagConstraints();
			gbc_lblNomeNapsi.fill = GridBagConstraints.BOTH;
			gbc_lblNomeNapsi.insets = new Insets(0, 0, 5, 5);
			gbc_lblNomeNapsi.gridwidth = 3;
			gbc_lblNomeNapsi.gridx = 2;
			gbc_lblNomeNapsi.gridy = 10;
			panel.add(getLblNomeNapsi(), gbc_lblNomeNapsi);
			GridBagConstraints gbc_label_10 = new GridBagConstraints();
			gbc_label_10.anchor = GridBagConstraints.NORTHWEST;
			gbc_label_10.insets = new Insets(0, 0, 5, 5);
			gbc_label_10.gridx = 1;
			gbc_label_10.gridy = 11;
			panel.add(getLabel_10(), gbc_label_10);
			GridBagConstraints gbc_lblColunasNapsi = new GridBagConstraints();
			gbc_lblColunasNapsi.anchor = GridBagConstraints.WEST;
			gbc_lblColunasNapsi.fill = GridBagConstraints.VERTICAL;
			gbc_lblColunasNapsi.insets = new Insets(0, 0, 5, 5);
			gbc_lblColunasNapsi.gridwidth = 2;
			gbc_lblColunasNapsi.gridx = 2;
			gbc_lblColunasNapsi.gridy = 11;
			panel.add(getLblColunasNapsi(), gbc_lblColunasNapsi);
			GridBagConstraints gbc_label_11 = new GridBagConstraints();
			gbc_label_11.anchor = GridBagConstraints.NORTHWEST;
			gbc_label_11.insets = new Insets(0, 0, 5, 5);
			gbc_label_11.gridx = 1;
			gbc_label_11.gridy = 12;
			panel.add(getLabel_11(), gbc_label_11);
			GridBagConstraints gbc_lblLinhaNapsi = new GridBagConstraints();
			gbc_lblLinhaNapsi.anchor = GridBagConstraints.WEST;
			gbc_lblLinhaNapsi.fill = GridBagConstraints.VERTICAL;
			gbc_lblLinhaNapsi.insets = new Insets(0, 0, 5, 5);
			gbc_lblLinhaNapsi.gridwidth = 2;
			gbc_lblLinhaNapsi.gridx = 2;
			gbc_lblLinhaNapsi.gridy = 12;
			panel.add(getLblLinhaNapsi(), gbc_lblLinhaNapsi);
			GridBagConstraints gbc_label_12 = new GridBagConstraints();
			gbc_label_12.anchor = GridBagConstraints.NORTH;
			gbc_label_12.fill = GridBagConstraints.HORIZONTAL;
			gbc_label_12.insets = new Insets(0, 0, 5, 5);
			gbc_label_12.gridwidth = 3;
			gbc_label_12.gridx = 1;
			gbc_label_12.gridy = 13;
			panel.add(getLabel_12(), gbc_label_12);
			GridBagConstraints gbc_comboBoxNapsi = new GridBagConstraints();
			gbc_comboBoxNapsi.fill = GridBagConstraints.BOTH;
			gbc_comboBoxNapsi.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxNapsi.gridwidth = 2;
			gbc_comboBoxNapsi.gridx = 1;
			gbc_comboBoxNapsi.gridy = 14;
			panel.add(getComboBoxNapsi(), gbc_comboBoxNapsi);
			GridBagConstraints gbc_btnComparar = new GridBagConstraints();
			gbc_btnComparar.anchor = GridBagConstraints.SOUTHWEST;
			gbc_btnComparar.insets = new Insets(0, 0, 0, 5);
			gbc_btnComparar.gridx = 3;
			gbc_btnComparar.gridy = 15;
			panel.add(getBtnComparar(), gbc_btnComparar);
		}
		return panel;
	}
	private JLabel getLblColoqueAPlanilha() {
		if (lblColoqueAPlanilha == null) {
			lblColoqueAPlanilha = new JLabel("Coloque a planilha dos alunos matriculados (SRA):");
		}
		return lblColoqueAPlanilha;
	}
	private JTextField getDiretorioSRA() {
		if (diretorioSRA == null) {
			diretorioSRA = new JTextField();
			diretorioSRA.setEnabled(false);
			diretorioSRA.setColumns(10);
		}
		return diretorioSRA;
	}
	private JButton getBtnSRA() {
		if (btnSRA == null) {
			btnSRA = new JButton("");
			btnSRA.setIcon(new ImageIcon(aplicacao.class.getResource("/br/edu/ifbaiano/napsi/excelcheck/img/folder_green.png")));
		}
		return btnSRA;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Nome do arquivo:");
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Colunas:");
		}
		return label_2;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("Linhas:");
		}
		return label_6;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("Informe qual coluna ser\u00E1 usada para compara\u00E7\u00E3o:");
		}
		return label_7;
	}
	private JComboBox getComboBoxSra() {
		if (comboBoxSra == null) {
			comboBoxSra = new JComboBox();
		}
		return comboBoxSra;
	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("Coloque a planilha com os candidatos ao benef\u00EDcio (NAPSI):");
		}
		return label_8;
	}
	private JTextField getDiretorioNapsi() {
		if (diretorioNapsi == null) {
			diretorioNapsi = new JTextField();
			diretorioNapsi.setEnabled(false);
			diretorioNapsi.setColumns(10);
		}
		return diretorioNapsi;
	}
	private JButton getBtnNAPSI() {
		if (btnNAPSI == null) {
			btnNAPSI = new JButton("");
			btnNAPSI.setIcon(new ImageIcon(aplicacao.class.getResource("/br/edu/ifbaiano/napsi/excelcheck/img/folder_green.png")));
		}
		return btnNAPSI;
	}
	private JLabel getLabel_9() {
		if (label_9 == null) {
			label_9 = new JLabel("Nome do arquivo:");
		}
		return label_9;
	}
	private JLabel getLabel_10() {
		if (label_10 == null) {
			label_10 = new JLabel("Colunas:");
		}
		return label_10;
	}
	private JLabel getLabel_11() {
		if (label_11 == null) {
			label_11 = new JLabel("Linhas:");
		}
		return label_11;
	}
	private JLabel getLabel_12() {
		if (label_12 == null) {
			label_12 = new JLabel("Informe qual coluna ser\u00E1 usada para compara\u00E7\u00E3o:");
		}
		return label_12;
	}
	private JComboBox getComboBoxNapsi() {
		if (comboBoxNapsi == null) {
			comboBoxNapsi = new JComboBox();
		}
		return comboBoxNapsi;
	}
	private JButton getBtnComparar() {
		if (btnComparar == null) {
			btnComparar = new JButton("Comparar");
		}
		return btnComparar;
	}
	private JLabel getLblNomeSra() {
		if (lblNomeSra == null) {
			lblNomeSra = new JLabel("");
			lblNomeSra.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return lblNomeSra;
	}
	private JLabel getLblColunaSra() {
		if (lblColunaSra == null) {
			lblColunaSra = new JLabel("");
			lblColunaSra.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return lblColunaSra;
	}
	private JLabel getLblLinhaSra() {
		if (lblLinhaSra == null) {
			lblLinhaSra = new JLabel("");
			lblLinhaSra.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return lblLinhaSra;
	}
	private JLabel getLblNomeNapsi() {
		if (lblNomeNapsi == null) {
			lblNomeNapsi = new JLabel("");
			lblNomeNapsi.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return lblNomeNapsi;
	}
	private JLabel getLblColunasNapsi() {
		if (lblColunasNapsi == null) {
			lblColunasNapsi = new JLabel("");
			lblColunasNapsi.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return lblColunasNapsi;
	}
	private JLabel getLblLinhaNapsi() {
		if (lblLinhaNapsi == null) {
			lblLinhaNapsi = new JLabel("");
			lblLinhaNapsi.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return lblLinhaNapsi;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
