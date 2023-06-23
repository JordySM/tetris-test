package packageDefault;

public class PiezaPadre {
	
	
	private String color;
	
	private int[][] fondo = {
		    {0, 0, 0, 0, 0},
		    {0, 0, 0, 0, 0},
		    {0, 0, 0, 0, 0},
		    {0, 0, 0, 0, 0},
		    {0, 0, 0, 0, 0}
		};
	
	private int[] posicion= {0,0,0,0};
	
	private boolean fin = false;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int[][] getFondo() {
		return fondo;
	}

	public void setFondo(int[][] fondo) {
		this.fondo = fondo;
	}

	public int[] getPosicion() {
		return posicion;
	}

	public void setPosicion(int[] posicion) {
		this.posicion = posicion;
	}

	public boolean isFin() {
		return fin;
	}

	public void setFin(boolean fin) {
		this.fin = fin;
	}

	public PiezaPadre(String color, int[][] fondo, int[] posicion, boolean fin) {
		super();
		this.color = color;
		this.fondo = fondo;
		this.posicion = posicion;
		this.fin = fin;
	}

	public PiezaPadre() {
		super();
	}

	

	
	
	
	
	
	

}
