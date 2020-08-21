package modeloEsc;

public class Procesos 
{
	public Procesos() 
	{
		
	}
	
	
	float MayorPagoEstud ( Estudiante [] estudiante) 
	{
		float mayorNumero = 0;
		for ( int i = 0; i < estudiante.length ; i++) 
			{
			  mayorNumero = estudiante[i].pago;
			  if(mayorNumero >= estudiante[i].pago) 
				{
				  mayorNumero = mayorNumero;
				}
			}
		return mayorNumero;
	}
	
	
	float obtenerPromedioEStud (Estudiante [] estudiante) 
	{
		float promedio = 0;
		
		for(int i = 0 ; i < estudiante.length ; i++)
		{
			promedio = promedio + estudiante[i].pago;
		}
		
		promedio = promedio / estudiante.length;
		return promedio;
		
	}
	
	float obtenerDifPromMay ( float promedio , float mayorNumero) 
	{
		float diferencia = 0;
		if(mayorNumero > promedio) 
		{
			diferencia =  mayorNumero - promedio ;
		}
		else if(promedio > mayorNumero) 
		{
			diferencia = promedio - mayorNumero;
		}
		return diferencia;
	}	
	
}
