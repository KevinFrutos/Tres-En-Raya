
public class Juego {

	public static void main(String[] args) {
		
		Tablero dibujaTablero = new Tablero();
		
		Movimiento jugadorX = new Movimiento();
		
		jugadorX.ficha = 'X';
		
		Movimiento jugadorO = new Movimiento();
		
		jugadorO.ficha = 'O';
		
		int i = 1;
		
		while(dibujaTablero.ganar != true && i < 10) {
			if(i % 2 == 0) {
				jugadorX.movimiento();
				
				dibujaTablero.verificarMovimiento(jugadorX.ficha, jugadorX.x, jugadorX.y);
			}else {
				jugadorO.movimiento();
				
				dibujaTablero.verificarMovimiento(jugadorO.ficha, jugadorO.x, jugadorO.y);
			}
			i++;
		}
		
		if(dibujaTablero.ganar != true) {
			System.out.println("Empate!");
		}
		
		
		
	}

}
