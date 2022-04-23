package classesMetodos;

public class Data {
	int dia = 01;
	int mes = 01;
	int ano = 1970;
	
	//construtor padr�o
	Data(){
		
	}
	
	//construtor especial
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	/*
	String obterDataFormatada() {
		String diaStr = Integer.toString(dia);
		String mesStr = Integer.toString(mes);
		String anoStr = Integer.toString(ano);
		return diaStr.concat("/"+mesStr).concat("/"+anoStr);
	}*/
	
	//a fun��o acima poderia ser escrita da seguinte forma
	String obterDataFormatada() {
		return String.format("%d / %d / %d", dia, mes, ano);
	}
	
}
