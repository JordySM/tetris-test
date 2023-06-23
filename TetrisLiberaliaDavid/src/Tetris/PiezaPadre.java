package Tetris;

import java.lang.reflect.Array;

public class PiezaPadre {

	private String color;
	/*
	 * Esta booleana siempre empezara en false, se controlaria en la clase tablero
	 * que las posiciones 0 de las matrices no choquen, como si no existieran, y al
	 * chocar un numero 1 con otro numero 1 o con el suelo, la booleana pasaria a
	 * ser true y la pieza se frenaria en esa posicion
	 */
	private boolean isCurrent;
	private int posicion;
	private int[][][] rotaciones;
	private int[][] currentForm;

	private int currentFormIndex;

	public PiezaPadre(String color, int posicion, int[][] currentForm) {
		super();
		this.color = color;
		this.isCurrent = true;
		this.posicion = posicion;
		this.currentForm = currentForm;
		this.currentFormIndex = 0;
	}

	public void rotate() {

		int i = this.currentFormIndex;
		int length = this.rotaciones.length;

		i++;

		if (i > length) {
			i = 0;
		}
	}

	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public int[][] getCurrentForm() {
		return currentForm;
	}

	public void setCurrentForm(int[][] currentForm) {
		this.currentForm = currentForm;
	}

	public int getCurrentFormIndex() {
		return currentFormIndex;
	}

	public void setCurrentFormIndex(int currentFormIndex) {
		this.currentFormIndex = currentFormIndex;
	}

	public int[][][] getRotaciones() {
		return rotaciones;
	}

	public void setRotaciones(int[][][] rotaciones) {
		this.rotaciones = rotaciones;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

}
