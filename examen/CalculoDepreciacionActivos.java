package examen ;

import java.util.Scanner;

public class CalculoDepreciacionActivos {

	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {	
	}

	private double depreciacion;
	    private double costo;
	    private double valorRecupera;
	    private int vidaUtil;

	    public void leerDatos(double costo, double valorRecupera,
          int vidaUtil){
this.costo = costo;
this.valorRecupera = valorRecupera;
this.vidaUtil = vidaUtil;
this.depreciacion=0;

}
public double calcularDepre(){
depreciacion = (costo-valorRecupera)/vidaUtil;
return depreciacion;
}

public void imprimirDepre(){
System.out.println("Depreciacion: "+depreciacion);
}

 public CalculoDepreciacionActivos () {
  auto auto1= new auto();
  auto1.leerDatos();
  auto1.calcularDepre();
  auto1.imprimirDepre();
}
}




