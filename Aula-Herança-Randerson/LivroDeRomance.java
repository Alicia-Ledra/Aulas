public class LivroDeRomance extends Livro{
    String CategoriaRomance;

    public LivroDeRomance( String Nome, String Autor, int NumeroPagina){
        super(Nome, Autor, NumeroPagina);
        this.CategoriaRomance = "Romance";
    }
    public void monstargenerodolivro(){
        System.out.println("Genero: " + CategoriaRomance);
    }
}
