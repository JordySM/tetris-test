package packageDefault;

public class PiezaHijoZ extends PiezaPadre {

	// Tendrá 4 valores 1,2,3,4 se seteará a 0 en el main
	private int rotarPieza;

	public int getSiguientePieza() {
		return rotarPieza;
	}

	public void setSiguientePieza(int siguientePieza) {
		this.rotarPieza = siguientePieza;
	}

	public PiezaHijoZ(String color, int[][] fondo, int[] posicion, boolean fin, int siguientePieza) {
		super(color, fondo, posicion, fin);
		this.rotarPieza = siguientePieza;

		color = "#FF0000";

		// posición por defecto, solo contiene 2 rotaciones
		posicion1(posicion, fondo);

	}

	// Dependiendo de la rotación de la pieza se modifica la matriz
	// La posicion 1 será la posición por defecto
	public void posicion1(int[] posicion, int[][] fondo) {

		posicion[0] = 1;
		posicion[1] = 0;
		posicion[2] = 0;
		posicion[3] = 0;

		// Se crea la estructura en forma de Z
		fondo[1][1] = 1;
		fondo[1][2] = 1;
		fondo[2][2] = 1;
		fondo[2][3] = 1;

		// Indicamos que el resto de valores se sette a 0
		for (int i = 0; i < fondo.length; i++) {
			for (int j = 0; j < fondo[i].length; j++) {
				if (fondo[i][j] != 1) {
					fondo[i][j] = 0;
				}
			}
		}

	}

	public void posicion2(int[] posicion, int[][] fondo) {

		posicion[0] = 0;
		posicion[1] = 1;
		posicion[2] = 0;
		posicion[3] = 0;

		// Se crea la estructura en forma de Z
		fondo[1][2] = 1;
		fondo[2][1] = 1;
		fondo[2][2] = 1;
		fondo[3][1] = 1;

		// Indicamos que el resto de valores se sette a 0
		for (int i = 0; i < fondo.length; i++) {
			for (int j = 0; j < fondo[i].length; j++) {
				if (fondo[i][j] != 1) {
					fondo[i][j] = 0;
				}
			}
		}
	}

}
