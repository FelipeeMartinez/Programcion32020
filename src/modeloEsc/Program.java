package modeloEsc;

public class Program 
{
  public static void main (String [] args) 
  {
	  	Estudiante arrest [] = new Estudiante[2];
	  	
	  	Procesos proc = new Procesos();
	  
	  	arrest[0] = new Estudiante();
		arrest[0].nombre = "Daniel";
		arrest[0].pago = 2000;
		
		arrest[1] = new Estudiante();
		arrest[1].nombre = "Maria";
		arrest[1].pago = 5000;
		
	
	System.out.print("Mayor pago: "+ proc.MayorPagoEstud(arrest) + "      ");
	System.out.print("Promedio: " + proc.obtenerPromedioEStud(arrest) + "      ");
	
	System.out.print("La diferencia entre el promedio y el mayor pago es de: " + 
	proc.obtenerDifPromMay(proc.MayorPagoEstud(arrest), proc.obtenerPromedioEStud(arrest)));
	
	
  }
}
