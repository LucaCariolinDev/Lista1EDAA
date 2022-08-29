public class Questao5 {
	public static void main(String[] argumentos)
	 {
		 ArrayEscritaUnica[] constantes = new ArrayEscritaUnica[10];;
		 for(int i=0; i< constantes.length; i++) {
			 constantes[i] = new ArrayEscritaUnica(i);
			 System.out.println(constantes[i].getValue());
		 }
		 
		 System.out.println("PRIMEIRA MUDANÇA");
		 
		 for(int i=0; i< constantes.length; i++) {
			 constantes[i].setValue(constantes[i].getValue() + 5);
			 System.out.println(constantes[i].getValue());
		 }
		 
		 System.out.println("SEGUNDA MUDANÇA");
		 
		 for(int i=0; i< constantes.length; i++) {
			 constantes[i].setValue(constantes[i].getValue() + 10);
			 System.out.println(constantes[i].getValue());
		 }
		 
		 
	 }
}
