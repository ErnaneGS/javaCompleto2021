package controle;

public class For03 {
	
	//exemplificamos um la�o dentro do outro, � importante
	//sabermos que toda vanri�vel declarada dentro de um for
	//(bloco) ela ficar� restrita a somente aquele bloco
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d - %d]", i ,j);
			}
			System.out.println();
		}
	}
}
