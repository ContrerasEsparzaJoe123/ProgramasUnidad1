package paquete01;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.print("ingresa tu nombre: ");
		String nombre;
		nombre = leer.nextLine();
		System.out.println("Hola " + nombre);
	}

}
