package programasUtd;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int respuesta = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa un número:");
		respuesta = leer.nextInt();
		if (respuesta%2==0)
		System.out.println("Es par");
		else
			System.out.println("Es impar");
	}

}
