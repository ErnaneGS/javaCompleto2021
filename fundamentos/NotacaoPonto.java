package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		double a = 2.33;
		String s = "Bom dia! X";
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String y = "Bom dia! X"
				.replace("x", "Gui")
				.concat("!!!");		
		//Tipos ptimitivos não possuem notação pontos (int a = 3)XXXX
	}

}
 