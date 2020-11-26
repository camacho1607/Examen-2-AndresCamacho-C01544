public class Grupo 
{
    Estudiante inicio;
    Estudiante raiz;
    int tamano;
    String recorrido="";
    Grupo()
    {
        inicio = null;
        tamano = 0;
        raiz = null;
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
        nuevoEstudiante.promedio(nuevoEstudiante.getNotas());
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
            		if(auxiliar.getNombre().charAt(0)>=nuevoEstudiante.getNombre().charAt(0))
            		{
            			auxiliar2=auxiliar;
            			nuevoEstudiante.setSiguiente(auxiliar);
            			inicio=nuevoEstudiante;
            			break;
            		}
            		else if(auxiliar.getNombre().charAt(0)<=nuevoEstudiante.getNombre().charAt(0)&&auxiliar2.getNombre().charAt(0)>=nuevoEstudiante.getNombre().charAt(0))
            		{
            			nuevoEstudiante.setSiguiente(auxiliar2);
            			auxiliar2=nuevoEstudiante;
            			auxiliar.setSiguiente(auxiliar2);
            			break;
            		}
            		else
            		{
            			if(auxiliar2.getSiguiente()==null)
            			{
            				auxiliar2.setSiguiente(nuevoEstudiante);
            				
            			}
            			else
            			{
            				auxiliar=auxiliar.getSiguiente();
            				auxiliar2=auxiliar2.getSiguiente();
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
    public void armarArbol()
    {
    	Estudiante auxiliar=inicio;
    	if(!esVacia())
    	{
    		while(auxiliar.getSiguiente() != null)
    		{
    			agregarHijo(auxiliar);
    			auxiliar=auxiliar.getSiguiente();
    		}
    		agregarHijo(auxiliar);
    	}
    }
    private Estudiante agregarArbol(Estudiante actual, Estudiante nuevo)
    {
        if(actual == null)
        {
            return new Estudiante();
        }
        else if( nuevo.getPromedio() < actual.getPromedio())
        {
            actual.setHijoIzquierdo(agregarArbol(actual.getHijoIzquierdo(), nuevo));
        }
        else if( nuevo.getPromedio() > actual.getPromedio() )
        {
            actual.setHijoDerecho(agregarArbol(actual.getHijoDerecho(), nuevo));
        }
        else
        {
            return actual;
        }
        
        return actual;
    }
    public void agregarHijo(Estudiante nuevo)
    {
        raiz = agregarArbol(raiz, nuevo);
    }
    public void imprimirMenores(float promedio)
    {
    	System.out.println(imprimirMenoresRecursivo(raiz,promedio));
    }
    public String imprimirMenoresRecursivo(Estudiante actual, float promedio)
    {
    	if(actual!=null)
    		{
    			if(actual.getPromedio()<promedio)
		    	{
		    		recorrido+=actual.toString()+"/n";
		    		imprimirMenoresRecursivo(actual.getHijoIzquierdo(),promedio);
		    		imprimirMenoresRecursivo(actual.getHijoDerecho(),promedio);
		    	}
    			else if(actual.getPromedio()>=promedio)
    			{
    				imprimirMenoresRecursivo(actual.getHijoIzquierdo(),promedio);
    			}
    		}
    	return recorrido;
    }
    public Estudiante getRaiz()
    {
        return raiz;
    }
}
