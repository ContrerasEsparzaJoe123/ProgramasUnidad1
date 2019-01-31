package programa10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer= new Scanner(System.in);
		DecimalFormat forma = new DecimalFormat("### ### ###");
		
		
		double pro1= 0 ,pro2 =0 , pro3=0;
		System.out.println("Bienvenido");
		System.out.println("Que producto va a llevar");
		System.out.println("ingrese el primer producto");
		
		pro1 = leer.nextDouble();
		
		System.out.println("Ingrese el segundo producto");
		
		pro2 = leer.nextDouble();
		
		System.out.println("Ingrese el tercer producto");
		
		pro3 = leer.nextDouble();
		 
		double total = pro1+pro2+pro3;
		if (total>=1500)  {
			total = total *1.11;
		}
		else{
			total = total *1.10;
		}
		System.out.println("El total seria: $"+total);
		System.out.println("Gracias por su compra");
	}

}
