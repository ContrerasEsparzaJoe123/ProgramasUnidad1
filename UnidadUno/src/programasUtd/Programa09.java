package programasUtd;
import java.util.Scanner;
public class Programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-Men� principal-");
		System.out.println("1.-Pulgadas a cent�metros");
		System.out.println("2.-Pies a cent�metros");
		System.out.println("3.-Pies a pulgadas");
		int opcion;
		double v1,v2,v3;
		Scanner leer = new Scanner (System.in);
		opcion = leer.nextInt();
		switch (opcion){
		case 1:
			System.out.println("Ingresa el valor en pulgadas:");
			v1 = leer.nextDouble();
			v1 = v1*2.54;
			System.out.println("El resultado en cent�metros es:"+v1);
			break;
		case 2:
			System.out.println("Ingresa el valor en pies");
			v2 = leer.nextDouble();
			v2 = v2*30.48;
			System.out.println("El resultado en cent�metros es:"+v2);
			break;
		case 3:
			System.out.println("Ingresa el valor en pies:");
			v3 = leer.nextDouble();
			v3 = v3*12;
			System.out.println("El resultado en pulgadas es:"+v3);
			break;
			default:
				System.out.println("Ingresa un valor v�lido (1-3);");
			
		}
	}

}
