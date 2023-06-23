package packageDefault;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 int[][] fondo = new int[30][10];
		 
		 int contador = 0;
		
		 
		 PiezaHijoL pieza = new PiezaHijoL();
		 
		
			
		 
		 
		 for(int i = 0; i<fondo.length;i++) {
			 
			 
			 
			 for(int j = 0; j<fondo[i].length;j++) {
				 
				 fondo[i][j]=0;
	
			 }
			 	
			
		 }
		 	for(int i = 0; i<fondo.length;i++) {
			 
			 for(int j = 0; j<fondo[i].length;j++) {
				 
				 	fondo[0][4] = 1;
					fondo[1][4] = 1;
					fondo[2][4] = 1;
					fondo[2][5] = 1;
					
	
			 }
			 	fondo[0+(contador)][4] = 0;
				fondo[1+(contador-1)][4] = 0;
				fondo[2+(contador-1)][4] = 0;
				fondo[2+(contador-1)][5] = 0;
				
			 	fondo[0+contador][4] = 1;
				fondo[1+contador][4] = 1;
				fondo[2+contador][4] = 1;
				fondo[2+contador][5] = 1;
				Thread.sleep(1000);
				contador++;
				
				 System.out.println(Arrays.toString(fondo[i])+ "\n");
			
		 }
		 	System.out.println("+_________________________________+");
		 	 System.out.println(Arrays.deepToString(fondo)+ "\n");
		 	
			
	}
	
	
	
}
