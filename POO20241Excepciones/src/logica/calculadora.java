package logica;

public class calculadora {
	private int valor1,valor2;	
	
	public int getvalor1() {
		return valor1;
	}
	public void setNumero(int valor1) {
		this.valor1 = valor1;
	}
	
	public int getvalor2() {
		return valor2;
	}
	public void setNumero2(int valor2) {
		this.valor2 = valor2;
	}
	
	public calculadora(int valor1,int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public int suma() {
		return valor1+valor2;
	}
	public int resta() {
		return valor1-valor2;
	}
	public int multiplicacion() {
		return valor1*valor2;
	}
	
	public double dividir () throws Exception{
		if (valor2==0) {
			throw new Exception("No se puede dividir ");
		}else {
			double res = valor1/valor2;
			return res;
		}
	}
	public long factorial() throws Exception{
		long aux=1;
		
		try {
		    if (aux > Long.MAX_VALUE) {
		        throw new Exception("Expresión demasiado grande para un tipo long");
		    }else if(valor1<0) {
			
			throw new Exception("El numero es un numero negativo");
		}else {
		for (int i=1; i<=valor1; i++) {
			aux*=i;
		}
		return aux;
		
	     }} catch (Exception e) {
		    System.out.println(e.getMessage());
		}
	}

	
	
	
	
	
	
	
}
