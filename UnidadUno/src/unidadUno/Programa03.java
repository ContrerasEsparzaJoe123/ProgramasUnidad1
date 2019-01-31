package unidadUno;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		byte edad;
		float estatura;
		
		Scanner leer = new Scanner(System.in) ;
		
		System.out.print("Ingresa tu nombre");;
		nombre= leer.nextLine();
		System.out.print("Ingresa tu edad");
		edad = leer.nextByte();
		System.out.print("Ingresa tu estatura");
		estatura = leer.nextFloat();
		
		System.out.println("Tu nombre es:"+ nombre);
		System.out.println("Tu edad es :"+ edad);
		System.out.println("Tu estatura es:"+ estatura);
	}

}
