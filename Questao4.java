import java.util.Scanner;

public class Questao4 {
	public static void main(String args[]) {
		
        Scanner in = new Scanner(System.in);
        
        int[] qtdPessoas = new int[10];
        
        int totalRoubado = 0;
        
        for(int i = 0; i < qtdPessoas.length;i++) {
        	System.out.println("Digite o valor encontrado com a pessoa " + i);
        	int valor = in.nextInt();
        	qtdPessoas[i] = valor;
        }
                
        System.out.println("Qual o valor informado pelo bandido que robou menos dinheiro? ");
 
        int quantidadeInformadaBandido = in.nextInt();
        
        
    	
    	for(int i=0; i < qtdPessoas.length; i++) {
    		if((qtdPessoas[i] >= quantidadeInformadaBandido) && (qtdPessoas[i] % 10 == 0)) {
    			totalRoubado += qtdPessoas[i];
    			System.out.println("O bandido da posição " + i + " roubou R$ " + qtdPessoas[i] + ",00 reais");
    		}
    	}
    	
    	System.out.println("Foram roubados R$ " + totalRoubado + ",00 reais");
    	
    	
    }
}