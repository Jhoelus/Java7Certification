package sentenciasDeControl;

public class SwitchTest {
	public static void main(String[] args) {
		byte byteT = 1;
		short shortT = 2;
		int intT = 3;
		char charT = 99;
		String str = "Hola";
		
		/**
		 * No son validos
		 */
		
		double doubleT = 2;
		float floatT = 3;
		long longT = 4;
		boolean boleanT = true;
		
		switch(str.toLowerCase()){
		case "1":
		case "2":
		default:
			System.out.println("Nada");
		}
		
	}
}
