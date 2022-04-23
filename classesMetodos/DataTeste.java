package classesMetodos;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//construtor padrão
		Data data01 = new Data();

		//construtor especial
		Data data02 = new Data(8, 01, 1999);

		
		//iremos substituir as linhas abaixo pelo método obterDataFormatada
		//System.out.printf("Data 01: %d/%d/%d\n08", data01.dia, data01.mes, data01.ano);
		//System.out.printf("Data 02: %d/%d/%d", data02.dia, data02.mes, data02.ano);
		System.out.println(data01.obterDataFormatada());
		System.out.println(data02.obterDataFormatada());
		
		entrada.close();

	}

}
