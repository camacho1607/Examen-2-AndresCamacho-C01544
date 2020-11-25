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
        System.out.println("Agregando notas para "+nuevoEstudiante.getNombre());
        nuevaNota.agregar(nota);
        nuevoEstudiante.setNotas(nuevaNota);
        nuevoEstudiante.promedio();
        if(esVacia())
        {
            inicio=nuevoEstudiante;
        }
        else
        {
            Estudiante auxiliar = inicio;
            Estudiante auxiliar2 = auxiliar.getSiguiente();
            if(auxiliar2==null&&tamano==1)
            {
            	if(auxiliar.getNombre().charAt(0)>nuevoEstudiante.getNombre().charAt(0))
            	{
            		auxiliar2=auxiliar;
            		nuevoEstudiante.setSiguiente(auxiliar2);
            		inicio=nuevoEstudiante;
            	}
            	else
            	{
            		auxiliar2=nuevoEstudiante;
            		auxiliar.setSiguiente(auxiliar2);
            	}
            }
            else
            {
            	while(auxiliar.getSiguiente()!=null)
            	{
            		if(auxiliar.getNombre().charAt(0)<=nuevoEstudiante.getNombre().charAt(0)&&auxiliar2.getNombre().charAt(0)>=nuevoEstudiante.getNombre().charAt(0))
            		{
            			nuevoEstudiante.setSiguiente(auxiliar2);
            			auxiliar2=nuevoEstudiante;
            			auxiliar.setSiguiente(auxiliar2);
            		}
            		else
            		{
            			if(auxiliar2.getSiguiente()==null)
            			{
            				auxiliar.setSiguiente(nuevoEstudiante);
            			}
            			else
            			{
            				auxiliar=auxiliar.getSiguiente();
            			}
            		}
            	
            	
            }
        }
            
            
        }
        tamano++;
    }
    public void imprimirLista()
    {
        if(!esVacia())
        {
            Estudiante auxiliar = inicio;
            
            while(auxiliar.getSiguiente() != null)
            {
                System.out.println(auxiliar.toString());
                auxiliar = auxiliar.getSiguiente();
            }
            
            System.out.println(auxiliar.toString());
        }
    }
}
