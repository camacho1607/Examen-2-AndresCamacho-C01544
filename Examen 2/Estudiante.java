
public class Estudiante 
{
	String nombre;
	String carne;
	ListaNotas notas;
	int promedio;
	String estudianteString;
	Estudiante siguiente;
	Estudiante()
	{
		nombre="";
		carne="";
		notas=new ListaNotas();
		siguiente=null;
		promedio=0;
		
	}
	public void promedio()
	{
		for(int posicion=0;posicion<notas.getTamano();posicion++)
		{
			promedio+=notas.buscarPosicion(posicion);
		}
		promedio/=notas.getTamano();
	}
	public String toString()
	{
		estudianteString= nombre+'|'+carne+'|'+promedio;
		return estudianteString;
	}
}
