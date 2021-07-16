import java.util.Scanner;

public class Nombre {

	public static void main(String[] args) {
		System.out.println("Inicio el programa");
		System.out.println("Escribe tu nombre");
		String nombre;
		Scanner sn = new Scanner (System.in); 
		nombre= sn.nextLine();
		System.out.println("Tu nombre es "+nombre);
	}

}
