
public class Tablero {
	
	char[][] tablero = {
			{'-','-','-'},
			{'-','-','-'},
			{'-','-','-'}
	};
	
	boolean ganar = false;
	
	Tablero(){
		for (int i = 0; i < tablero.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j]);
			}
		}
		System.out.println(" ");
	}
	
	public void verificarMovimiento(char ficha, int x, int y) {
		if(tablero[x][y] != 'O' && tablero[x][y] != 'X') {
			this.actualizarMovimiento(ficha, x, y);
			if(tablero[0][0] == 'O' && tablero[0][1] == 'O'  && tablero[0][2] == 'O' 
					|| tablero[0][0] == 'X' && tablero[0][1] == 'X'  && tablero[0][2] == 'X') {
				System.out.println("El jugador " + tablero[0][0] + " ha ganado!");
				ganar = true;
			}else if(tablero[1][0] == 'O' && tablero[1][1] == 'O'  && tablero[1][2] == 'O' 
					|| tablero[1][0] == 'X' && tablero[1][1] == 'X'  && tablero[1][2] == 'X') {
				System.out.println("El jugador " + tablero[1][0] + " ha ganado!");
				ganar = true;
			}else if(tablero[2][0] == 'O' && tablero[2][1] == 'O'  && tablero[2][2] == 'O' 
					|| tablero[2][0] == 'X' && tablero[2][1] == 'X'  && tablero[2][2] == 'X') {
				System.out.println("El jugador " + tablero[2][0] + " ha ganado!");
				ganar = true;
			}else if(tablero[0][0] == 'O' && tablero[1][0] == 'O'  && tablero[2][0] == 'O' 
					|| tablero[0][0] == 'X' && tablero[1][0] == 'X'  && tablero[2][0] == 'X') {
				System.out.println("El jugador " + tablero[0][0] + " ha ganado!");
				ganar = true;
			}else if(tablero[0][1] == 'O' && tablero[1][1] == 'O'  && tablero[2][1] == 'O' 
					|| tablero[0][1] == 'X' && tablero[1][1] == 'X'  && tablero[2][1] == 'X') {
				System.out.println("El jugador " + tablero[0][1] + " ha ganado!");
				ganar = true;
			}else if(tablero[0][2] == 'O' && tablero[1][2] == 'O'  && tablero[2][2] == 'O' 
					|| tablero[0][2] == 'X' && tablero[1][2] == 'X'  && tablero[2][2] == 'X') {
				System.out.println("El jugador " + tablero[0][2] + " ha ganado!");
				ganar = true;
			}else if(tablero[0][0] == 'O' && tablero[1][1] == 'O'  && tablero[2][2] == 'O' 
					|| tablero[0][0] == 'X' && tablero[1][1] == 'X'  && tablero[2][2] == 'X') {
				System.out.println("El jugador " + tablero[0][0] + " ha ganado!");
				ganar = true;
			}else if(tablero[0][2] == 'O' && tablero[1][1] == 'O'  && tablero[2][0] == 'O' 
					|| tablero[0][2] == 'X' && tablero[1][1] == 'X'  && tablero[2][0] == 'X') {
				System.out.println("El jugador " + tablero[0][2] + " ha ganado!");
				ganar = true;
			}
		}
	}
	
	public void actualizarMovimiento(char ficha, int x, int y) {
		tablero[x][y] = ficha;
		for (int i = 0; i < tablero.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j]);
			}
		}
		System.out.println(" ");
	}




}
