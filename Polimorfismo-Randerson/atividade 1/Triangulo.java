package Polimorfismo;

public class Triangulo extends Forma{
  private double base;
  private double altura;
  
  public Triangulo(double base, double altura) {
      this.base = base;
      this.altura = altura;
  }
  
  @Override
  public double CalcularArea() {
      return (this.base * this.altura) / 2;
     
  }

  @Override
  public void Desenhar() {
     
  }
  
}
