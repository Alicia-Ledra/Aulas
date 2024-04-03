public class Livro {
   private String Nome;
   private String Autor;
   private int NumeroPaginas;
   public String getNome();

   public void setNome(String nome) {
    this.nome = nome;
    }

    public Livro (String Nome, String Autor, int NumeroPaginas) {
      this.Nome = Nome;
      this.Autor = Autor;
      this.NumeroPaginas = NumeroPaginas;
    }    

}
