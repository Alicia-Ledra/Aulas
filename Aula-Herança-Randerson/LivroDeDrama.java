public class LivroDeDrama extends Livro{
     String CategoriaDrama;

    public LivroDeDrama( String Nome, String Autor, int NumeroPagina){
        super(Nome, Autor, NumeroPagina);
        this.CategoriaDrama = "Drama";
    }
   
}
