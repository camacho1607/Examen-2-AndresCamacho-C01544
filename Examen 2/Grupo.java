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
            
            while(auxiliar.getSiguiente() != null&&auxiliar2.getSiguiente() != null)
            {
                if(auxiliar.getNombre().charAt(0)<=nuevoEstudiante.getNombre().charAt(0)&&auxiliar2.getNombre().charAt(0)>=nuevoEstudiante.getNombre().charAt(0))
                {
                    nuevoEstudiante.setSiguiente(auxiliar2);
                    auxiliar.setSiguiente(nuevoEstudiante);
                }
                else
                {
                    auxiliar = auxiliar2;
                    auxiliar2=auxiliar2.getSiguiente();
                }
                        
            }
            
            if(auxiliar.getSiguiente() == null||auxiliar2.getSiguiente() == null)
            {
                    if(tamano==1)
                    {
                        if(auxiliar.getNombre().charAt(0)>=nuevoEstudiante.getNombre().charAt(0))
                        {
                            auxiliar2=auxiliar;
                            auxiliar=nuevoEstudiante;
                            auxiliar.setSiguiente(auxiliar2);
                        }
                        else
                        {
                            auxiliar2=nuevoEstudiante;
                        }
                    }
                    else
                    {
                        if(auxiliar.getSiguiente() == null)
                        {
                            auxiliar.setSiguiente(nuevoEstudiante);
                        }
                        else if(auxiliar2.getSiguiente() == null)
                        {
                            auxiliar2.setSiguiente(nuevoEstudiante);
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
            int posicion = 0;
            
            while(auxiliar.getSiguiente() != null)
            {
                System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre() + " Promedio: "+ auxiliar.getPromedio() );
                auxiliar = auxiliar.getSiguiente();
                posicion++;
            }
            
            System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre() + " Promedio: "+ auxiliar.getPromedio());
        }
    }
}
