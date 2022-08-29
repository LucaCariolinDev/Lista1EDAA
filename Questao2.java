public class Questao2 {
	public static void main(String args[]) {
    	int[] vetorDeNumeros = new int[] {2,4,6,15,17,22,24,253,30,91};
    	
    	for(int i=0; i < vetorDeNumeros.length; i++) {
    		if(Questao2.ehPrimo(vetorDeNumeros[i])){
    	    	System.out.println("O número " + vetorDeNumeros[i] +  " da posiçao  " + i + " é primo");
    		}
    	}
    }
	
	private static boolean ehPrimo(int numero) {
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    }
	    return true;
	}
}