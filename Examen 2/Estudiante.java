
public class Estudiante 
{
	private String nombre;
	private String carne;
	private ListaNotas notas;
	private int promedio;
	private String estudianteString;
	private Estudiante siguiente;
	Estudiante()
	{
		nombre="";
		carne="";
		notas=new ListaNotas();
		siguiente=null;
		
	}
	public void promedio()
	{
		for(int posicion=0;posicion<notas.getTamano()+1;posicion++)
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public int getPromedio() {
		return promedio;
	}
	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}
	public Estudiante getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Estudiante siguiente) {
		this.siguiente = siguiente;
	}
	public ListaNotas getNotas() {
		return notas;
	}
	public void setNotas(ListaNotas notas) {
		this.notas = notas;
	}
}
