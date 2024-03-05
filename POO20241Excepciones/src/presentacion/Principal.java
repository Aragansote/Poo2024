package presentacion;

import logica.calculadora;

public class Principal {

	public static void main(String[] args) {
		try {
		calculadora c = new calculadora(3,4);
		
		System.out.println(c.suma());
		System.out.println(c.resta());
		System.out.println(c.multiplicacion());
		System.out.println(c.dividir());
		System.out.println(c.factorial());
		}catch (Exception e) {
			 System.err.println("Se ha producido un error: " + e.getMessage());
	         e.printStackTrace();
		}
			
}
}
