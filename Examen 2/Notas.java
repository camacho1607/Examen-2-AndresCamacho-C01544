
public class Notas 
{
	private int notas;
	private Notas siguiente;
	Notas()
	{
		notas=0;
		siguiente=null;
	}
	public int getNotas() {
		return notas;
	}
	public void setNotas(int notas) {
		this.notas = notas;
	}
	public Notas getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Notas siguiente) {
		this.siguiente = siguiente;
	}
	
}
