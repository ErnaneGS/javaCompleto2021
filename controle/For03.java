package controle;

public class For03 {
	
	//exemplificamos um laço dentro do outro, é importante
	//sabermos que toda vanriável declarada dentro de um for
	//(bloco) ela ficará restrita a somente aquele bloco
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d - %d]", i ,j);
			}
			System.out.println();
		}
	}
}
