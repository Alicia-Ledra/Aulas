package atividade2;

public class Teste {
    
 public static void main(String[] args) {
	
	 Animal[] animal = new Animal [2];
 	
 	animal[0]= new Gato();
 	animal[1]= new Cachorro();
 			 
 	 for (int i = 0; i < animal.length; i++) {
 		 animal[i].emitirSom();
 	 }	 
 }
}

 