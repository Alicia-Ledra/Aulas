package Polimorfismo;

public class TesteComPolimorfismo {
     public static void main(String[] args) {
    	 
    	 Forma[] forma = new Forma [1];
    	
    	forma[0]= new Triangulo(5,6);
    			 
    	 for (int i = 0; i < forma.length; i++) {
    		 System.out.println("Área da forma: " +(i+1) +": " + forma[i].CalcularArea());
    		 forma[i].Desenhar();
    	 }
     }
}
