package controle;
public class Continue {
//o continue ira interromper a execu��o daquela linha 
//por�m o c�digo continua a ser executado
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
	}
}
