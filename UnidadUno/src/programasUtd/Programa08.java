package programasUtd;
import java.util.Scanner;
public class Programa08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dias = new Scanner(System.in);
		System.out.println("Ingrese el número de día: ");
		int numero = 0;
		while ( numero>7 || numero<1){
			numero = dias.nextInt();
			switch(numero){
			case 1:
				System.out.println("Domingo");
			break;
			case 2:
				System.out.println("Lunes");
				break;
			case 3:
				System.out.println("Martes");
				break;
			case 4:
				System.out.println("Miércoles");
				break;
			case 5:
				System.out.println("Jueves");
				break;
			case 6:
				System.out.println("Viernes");
				break;
			case 7:
				System.out.println("Sábado");
				break;
				default:
					System.out.println("Ingresa otro número (1-7)");
			}
			
		}
	}
}

