package unidadUno;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in) ;
		
		System.out.println("Ingresa tu calificacion");
		Byte calificacion;
		calificacion = leer.nextByte();
		
		if (calificacion>=80)
			System.out.println("Aprobado");
		else
			System.out.println("Reprobado");
	}

}
