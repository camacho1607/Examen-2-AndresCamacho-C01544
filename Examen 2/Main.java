
public class Main {

	public static void main(String[] args) 
	{
		Grupo grupo= new Grupo();
		grupo.agregar("Zoe", "1", 95);
		grupo.agregar("Bruno", "2", 100);
		grupo.agregar("Aaron", "3", 80);
		grupo.agregar("Sebas", "4", 50);
		grupo.agregar("Lucy", "5", 60);
		grupo.agregar("Rachel", "6", 70);
		
		grupo.imprimirMenores(70);
		
		
	}

}
