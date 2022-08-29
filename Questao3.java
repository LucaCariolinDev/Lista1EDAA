import java.text.DecimalFormat;

public class Questao3 {
	public static void main(String args[]) {
		String[] veiculos = new String[] {"Gol", "Vectra", "Jetta", "Up", "Fusca"};
    	double[] consumos = new double[] {13.9, 9.7, 6.1, 9.1, 8.4};
    	double melhorConsumo = 0;
    	int melhorVeiculoConsumo = 0;
    	
    	for(int i=0; i < veiculos.length; i++) {
    		if(consumos[i] > melhorConsumo) {
    			melhorConsumo = consumos[i];
    			melhorVeiculoConsumo = i;
    		}
    		
    		System.out.println("O modelo " + veiculos[i] + " consome " + new DecimalFormat("#0.00").format((double)1000/consumos[i]) + " litros para percorrer uma distância de 1.000 km");
    	}
    	
    	System.out.println("O modelo mais econômico é o " + veiculos[melhorVeiculoConsumo]);
    	
    	
    }
}