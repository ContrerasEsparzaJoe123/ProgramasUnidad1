package programasUtd;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner grados = new Scanner (System.in);
		float Centigrados;
		float Fahrenheit;
		System.out.println("Ingresa los grados Fahrenheit: ");
		Fahrenheit = grados.nextFloat();
		Centigrados = (Fahrenheit-32)*5/9;
		System.out.println(Fahrenheit + "°F" + " es igual a " + Centigrados + "°C");
	}

}
