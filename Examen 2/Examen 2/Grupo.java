public class Grupo 
{
	Estudiante inicio;
	int tamano;
	Grupo()
    {
        inicio = null;
        tamano = 0;
    }

    public boolean esVacia()
    {
        return inicio == null;
    }
    
    public int getTamano()
    {
        return tamano;
    }
    public void agregar(String nombre,String carne,int nota)
    {
    	Estudiante nuevoEstudiante= new Estudiante();
    	ListaNotas nuevaNota= new ListaNotas();
    	nuevoEstudiante.setCarne(carne);
    	nuevoEstudiante.setNombre(nombre);
    	nuevaNota.agregar(nota);
    	nuevoEstudiante.setNotas(nuevaNota);
    	if(esVacia())
    	{
    		inicio=nuevoEstudiante;
    	}
    	else
    	{
            Estudiante auxiliar = inicio;
            
            while(auxiliar.getSiguiente() != null)
            {
                auxiliar = auxiliar.getSiguiente();
            }
            
            auxiliar.setSiguiente(nuevoEstudiante);
    	}
    	tamano++;
    }
}
