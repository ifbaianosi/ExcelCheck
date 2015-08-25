package br.edu.ifbaiano.napsi.excelcheck.utils;
 
  
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import jxl.CellView;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class Main { 
	
	Workbook workbookSRA;
	Workbook workbookPsicoSocial;
	Sheet sheetSRA;
	Sheet sheetPsico;
	int qtdLinhasSRA;
	int qtdLinhasPsico;
	private int nColunaComparacaoSRA; // para pesquisar o aluno nas planilhas do SRA
	private int nColunaComparacaoPsicoSocial; // para pesquisar o aluno nas planilhas do Psico-Social
	
	// criar novo arquivo
	private WritableCellFormat times;
	private WritableCellFormat timesBoldUnderline;
	private List<String> conteudoLinhas;
	String colunas [];
	private String inputArquivo;
	
	// Exemplo de Como criar uma planilha com JXL no Java
	public void setOutputFile(String inputArquivo) {
		this.inputArquivo = inputArquivo;
	}
	
	public void setColunaComparacaoSRA (int nColuna){
		this.nColunaComparacaoSRA = nColuna;
	}
	
	public void setColunaComparacaoPsicoSocial (int nColuna){
		this.nColunaComparacaoPsicoSocial = nColuna;
	}
	
	
	public HashMap<String, Integer> carregarXlsSra (File sra) throws BiffException, IOException{
		  //carregar a planilha extraída do SRA  
	      workbookSRA = Workbook.getWorkbook(sra.getAbsoluteFile());
	      
	      /* pega a primeira planilha dentro do arquivo XLS do SRA*/  
		  sheetSRA = workbookSRA.getSheet(0);
		  
		  qtdLinhasSRA = sheetSRA.getRows();
		  int qtdColuna = sheetSRA.getColumns();
		  
		  HashMap<String, Integer> colinha = new HashMap<String, Integer>();
		  colinha.put("linhas", qtdLinhasSRA);
		  colinha.put("colunas", qtdColuna);
		  
		  return colinha;
		}
	
	public HashMap<String, Integer> carregarXlsNapsi (File napsi) throws BiffException, IOException{
		  //carregar a planilha extraída do SRA  
	      workbookPsicoSocial = Workbook.getWorkbook(napsi.getAbsoluteFile());
	      
	      /* pega a primeira planilha dentro do arquivo XLS do SRA*/  
		  sheetPsico = workbookPsicoSocial.getSheet(0);
		  
		  qtdLinhasPsico = sheetPsico.getRows();
		  int qtdColuna = sheetPsico.getColumns();
		  
		  HashMap<String, Integer> colinha = new HashMap<String, Integer>();
		  colinha.put("linhas", qtdLinhasPsico);
		  colinha.put("colunas", qtdColuna);
		  
		  return colinha;
		}
	
	
	public void carregarXLS (File sra, File napsi) throws BiffException, IOException{
	  //carregar a planilha extraida do SRA  
      workbookSRA = Workbook.getWorkbook(sra.getAbsoluteFile());
      
      //carregar a planilha extraida do Nucleo psico social 
      workbookPsicoSocial = Workbook.getWorkbook(napsi.getAbsoluteFile());
      
      /* pega a primeira planilha dentro do arquivo XLS do SRA*/  
	  sheetSRA = workbookSRA.getSheet(0);
	  
	  /* pega a primeira planilha dentro do arquivo XLS do SRA*/  
	  sheetPsico = workbookPsicoSocial.getSheet(0);
	  
	  qtdLinhasSRA = sheetSRA.getRows();
	  qtdLinhasPsico = sheetPsico.getRows();
	}
	
	
	/*
	 * Criar novo arquivo excel com a interceção dos alunos
	 * 
	 */
	
	// Método responsável por fazer a escrita, a inserção dos dados na planilha
	public void insere(File fileSra, File fileNapsi) throws IOException, WriteException, BiffException {
		// Cria um novo arquivo
		File arquivo = new File(inputArquivo);
		WorkbookSettings wbSettings = new WorkbookSettings();
		 
		wbSettings.setLocale(new Locale("pt", "BR"));
		 
		WritableWorkbook workbook = Workbook.createWorkbook(arquivo, wbSettings);
		// Define um nome para a planilha
		workbook.createSheet("Plan1", 0);
		WritableSheet excelSheet = workbook.getSheet(0);
		carregarXLS(fileSra, fileNapsi);//ler os arquivos excel
		criaLabel(excelSheet);
		comprararPlanilhas(excelSheet);
		 
		workbook.write();
		workbook.close();
	}
	
	public String [] obterColunasSra (){
		int qtdColunas = sheetSRA.getColumns();
		colunas = new String [qtdColunas];
		for (int i = 0; i < qtdColunas; i++) {
			colunas [i] = sheetSRA.getCell(i, 0).getContents();
		}
		return colunas;
	}
	
	public String [] obterColunasNapsi (){
		int qtdColunas = sheetPsico.getColumns();
		colunas = new String [qtdColunas];
		for (int i = 0; i < qtdColunas; i++) {
			colunas [i] = sheetPsico.getCell(i, 0).getContents();
		}
		return colunas;
	}
	
	public String [] obterColunas (){
		int qtdColunas = sheetPsico.getColumns();
		colunas = new String [qtdColunas];
		for (int i = 0; i < qtdColunas; i++) {
			colunas [i] = sheetPsico.getCell(i, 0).getContents();
			//System.out.print(colunas[i] +" | ");
		}
		return colunas;
	}
	
	// Método responsável pela definição das labels
	private void criaLabel(WritableSheet sheet) throws WriteException {
		// Cria o tipo de fonte como TIMES e tamanho
		WritableFont times10pt = new WritableFont(WritableFont.TIMES, 10);
		 
		// Define o formato da célula
		times = new WritableCellFormat(times10pt);
		 
		// Efetua a quebra automática das células
		times.setWrap(false);
		 
		// Cria a fonte em negrito com underlines
		WritableFont times10ptBoldUnderline = new WritableFont(
		WritableFont.ARIAL, 10, WritableFont.BOLD, false);
		//UnderlineStyle.SINGLE);
		timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
		 
		// Efetua a quebra automática das células
		timesBoldUnderline.setWrap(false);
		 
		CellView cv = new CellView();
		cv.setFormat(times);
		cv.setFormat(timesBoldUnderline);
		cv.setAutosize(true);
		 
		String colunas [] = obterColunas();
		
		for (int i = 0; i < colunas.length; i++){
			addCabecalho(sheet, i, 0, colunas[i]);
		}/*
		
		// Escreve os cabeçalhos
		addCabecalho(sheet, 0, 0, "Coluna 1");
		addCabecalho(sheet, 1, 0, "Coluna 2");
		addCabecalho(sheet, 2, 0, "Coluna 3");*/
	}
	// Adiciona cabecalho
	private void addCabecalho(WritableSheet planilha, int coluna, int linha, String s)
	throws RowsExceededException, WriteException {
		Label label;
		label = new Label(coluna, linha, s, timesBoldUnderline);
		planilha.addCell(label);
	}
		
	private void addconteudoLinhas(WritableSheet planilha, int coluna, int linha,
		String conteudo) throws WriteException, RowsExceededException {
		
		Label label;
		label = new Label(coluna, linha, conteudo, times);
		planilha.addCell(label);
	}
	
	public void comprararPlanilhas (WritableSheet sheet) throws BiffException, IOException, RowsExceededException, WriteException{
			
		conteudoLinhas = new ArrayList<String>();
		int linha = 0;
		int match = 0;
		for (int i = 1; i < qtdLinhasPsico; i++){
        	for (int j = 1; j < qtdLinhasSRA; j++) {
        		if (sheetPsico.getCell(nColunaComparacaoSRA,i).getContents().equalsIgnoreCase(sheetSRA.getCell(nColunaComparacaoPsicoSocial,j).getContents())){
        			match++;
        			for (int c = 1; c < colunas.length; c++) {
        				conteudoLinhas.add(sheetPsico.getCell(c,i).getContents());
        				addconteudoLinhas(sheet, c, match, conteudoLinhas.get(linha).toString());
        				addconteudoLinhas(sheet, 0, match, match+"");
        				linha++;
        			}
        			//System.out.println(""+sheetPsico.getCell(nColunaComparacaoSRA,i).getContents());
        		}
        	}        	
        }
		
		obterColunas();
		fecharArquivos();
	}
	
	public void fecharArquivos (){
		workbookSRA.close();
		workbookPsicoSocial.close();
	}
          
    /** Creates a new instance of Main */  
/*    public static void main(String[] args ) {  
    	
    	Main m = new Main();
    	m.setOutputFile("xls/novoarquivo.xls");
    	int n = Integer.parseInt(JOptionPane.showInputDialog(null, "PLANILHA 1.: informar numero da coluna para comparação; "));
    	m.setColunaComparacaoSRA(n-1);
    	
    	int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "PLANILHA 2.: informar numero da coluna para comparação; "));
    	m.setColunaComparacaoPsicoSocial(n2-1);
    	try {
			m.insere();
			
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }  */   
}  