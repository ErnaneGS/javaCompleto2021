package controle;
public class Continue {
//o continue ira interromper a execução daquela linha 
//porém o código continua a ser executado
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
	}
}
