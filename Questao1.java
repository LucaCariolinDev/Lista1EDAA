public class Questao1 {
	public static void main(String args[]) {
    	int[][] tabuada = new int[11][11];
    	
    	for(int i=1; i <= 10; i++) {
    		for(int j=1; j <= 10; j++) {
    			tabuada[i][j] = i + j;
    		}
    	}
    	
    	System.out.println("tabuada[7][9] " + tabuada[7][9]);
    }
}