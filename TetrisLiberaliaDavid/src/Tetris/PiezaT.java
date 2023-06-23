package Tetris;

import java.lang.reflect.Array;

public class PiezaT extends PiezaPadre{
	
	private int [][] posicion1= {
			{0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 1, 1, 1, 0},
			{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0}
			};
	
	private int [][] posicion2= {
			{0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 0, 1, 1, 0},
			{0, 0, 1, 0, 0},
			{0, 0, 0, 0, 0}
			};
	
	private int [][] posicion3= {
			{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0},
			{0, 1, 1, 1, 0},
			{0, 0, 1, 0, 0},
			{0, 0, 0, 0, 0}
			};
	
	private int [][] posicion4= {
			{0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 0, 0, 0, 0}
			};
	
	
	public PiezaT(String color, int posicion, int[][] currentForm) {
		super(color, posicion, currentForm);
		int rotaciones [][][]={this.posicion1, this.posicion2, this.posicion3, this.posicion4};
		super.setRotaciones(rotaciones);
		currentForm = this.posicion1;
			
		
	}


	public int[][] getPosicion1() {
		return posicion1;
	}



	public void setPosicion1(int[][] posicion1) {
		this.posicion1 = posicion1;
	}



	public int[][] getPosicion2() {
		return posicion2;
	}



	public void setPosicion2(int[][] posicion2) {
		this.posicion2 = posicion2;
	}



	public int[][] getPosicion3() {
		return posicion3;
	}



	public void setPosicion3(int[][] posicion3) {
		this.posicion3 = posicion3;
	}



	public int[][] getPosicion4() {
		return posicion4;
	}



	public void setPosicion4(int[][] posicion4) {
		this.posicion4 = posicion4;
	}

	
}
