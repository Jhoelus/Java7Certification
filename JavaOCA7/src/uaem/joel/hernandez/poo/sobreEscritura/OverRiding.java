package uaem.joel.hernandez.poo.sobreEscritura;

public class OverRiding {
	public static void main(String[] args) {
		
	}
}

class Padre{
	
	protected void metodoPapa(){
		System.out.println("Metodo Papa");
	}
}

class Hija extends Padre{
	@Override
	public void metodoPapa() {
		// TODO Auto-generated method stub
		super.metodoPapa();
	}
	protected void metodoHijo(){
		
		super.metodoPapa();
		System.out.println("Metodo Hijo");
	}
}