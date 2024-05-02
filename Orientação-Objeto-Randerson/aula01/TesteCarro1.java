package aula01;

public class TesteCarro1 {
    
    public static void main(String[] args) {
        
       Carro Carro01 = new Carro();
        Carro01.marca = "Golf";
        Carro01.modelo = "Volkswagen";
        Carro01.cor = "Vermelho";
    
        System.out.println("modelo do carro " + Carro01.modelo);
        System.out.println("Marca do carro é " + Carro01.marca);
        System.out.println("Cor do carro é " + Carro01.cor);
    
        //CHAMANDO MÉTODO DA CLASSE CARRO
        Carro01.acelerar();
        Carro01.freiar();

    }
}
