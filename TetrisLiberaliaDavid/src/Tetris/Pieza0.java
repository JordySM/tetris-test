package Tetris;

import java.lang.reflect.Array;

public class Pieza0 extends PiezaPadre{

	private int [][] posicion1= {
			{0, 0, 0, 0, 0},
			{0, 1, 1, 0, 0},
			{0, 1, 1, 0, 0},
			{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0}
			};

	public Pieza0(String color, int posicion, int[][] currentForm) {
		super(color, posicion, currentForm);
		int rotaciones [][][]={this.posicion1};
		super.setRotaciones(rotaciones);
		currentForm = this.posicion1;
			
		
	}

	public int[][] getPosicion1() {
		return posicion1;
	}

	public void setPosicion1(int[][] posicion1) {
		this.posicion1 = posicion1;
	}

	
}
