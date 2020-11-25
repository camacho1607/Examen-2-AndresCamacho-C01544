
public class ListaNotas 
{
	Notas inicio;
	int tamano;
	ListaNotas()
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
    public void agregar(int nota)
    {
        Notas nuevoNotas = new Notas();
        nuevoNotas.setNotas(nota);
        
        if(esVacia())
        {
            inicio = nuevoNotas;
        }
        else
        {
            Notas auxiliar = inicio;
            
            while(auxiliar.getSiguiente() != null)
            {
                auxiliar = auxiliar.getSiguiente();
            }
            
            auxiliar.setSiguiente(nuevoNotas);
        }
        
        tamano++;
    }
    public Integer buscarPosicion(int posicionFinal)
    {
    	Notas auxiliar= inicio;
    	if(posicionFinal>1)
    	{
    		for(int pos=0;pos<posicionFinal;)
    		{
    			auxiliar=auxiliar.getSiguiente();
    		}
    	}
    	return auxiliar.getNotas();
    }
}
