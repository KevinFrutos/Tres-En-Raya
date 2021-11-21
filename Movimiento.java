import java.util.Scanner;

public class Movimiento {

	char ficha;
	int x;
	int y;
	
	public void movimiento() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(ficha + " Introduce la posicion X: ");
		x = scan.nextInt();
		
		System.out.println(ficha + " Introduce la posicion Y: ");
		y = scan.nextInt();
	}

}