import java.util.Scanner;
public class ListaNotas 
{
	Notas inicio;
	int tamano;
	Scanner scan= new Scanner(System.in);
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
        System.out.println("Desea agregar mas notas?(1.Si 0.No)");
        if(scan.nextInt()==1)
        {
        	System.out.println("Ingrese la nota del estudiante.");
        	agregar(scan.nextInt());
        }
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
