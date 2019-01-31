package ProgramaDiezB;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa10B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		DecimalFormat formateador = new DecimalFormat("###,###,###");
		
		byte numero =0, i =0;
		int suma =0;
		
		
		do{
			System.out.println("Ingrese el numero");
			numero = leer.nextByte();
			if(numero<=0 && numero>=76)
				suma+=numero;
			}while(numero<=76);
			System.out.println("la suma es:" +suma+ "el promedio es:" +formateador.format(suma/i));
			
		
	}

}
