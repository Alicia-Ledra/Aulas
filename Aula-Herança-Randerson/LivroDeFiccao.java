public class LivroDeFiccao extends Livro{
    String CategoriaFiccao;

    public LivroDeFiccao( String Nome, String Autor, int NumeroPagina){
        super(Nome, Autor, NumeroPagina);
        this.CategoriaFiccao = "Ficção";
    }
    
}
