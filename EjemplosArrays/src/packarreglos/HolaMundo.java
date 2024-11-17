package packarreglos;
import java.util.*;

public class HolaMundo 
{

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Hola Mundo!!");
		
		System.out.println("Desea agregar otro texto? (s/n)");
		String op = reader.nextLine();
		
		if (op.equals("s"))
		{
			System.out.println("Ingrese el texto que desea agregar");
			String frase = reader.nextLine();
			
			System.out.println();
			System.out.println("\n" + frase);
		}
		else if (op.equals("n"))
		{
			System.out.println(" ");
		}
		else
		{
			System.out.println("Opcion no valida");
		}
		reader.close();
	}

}
