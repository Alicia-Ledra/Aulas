public class TesteLivro {
    
    public static void main(String[] args) {
       LivroDeDrama Livro1 = new LivroDeDrama("A Garota do Lago", "Alícia Ledra", 569);
       LivroDeFiccao Livro2 = new LivroDeFiccao("Love In The Dark", "Mayara dos Anjos", 200);
       LivroDeRomance Livro3 = new LivroDeRomance("Manual da Conquista Imperfeita", "Olivia Uviplais", 375);
    
       System.out.println("Titulo: " + Livro1.Nome);
       System.out.println("Autor: " + Livro1.Autor);
       System.out.println("Paginas: " + Livro1.NumeroPaginas);
       System.out.println("Titulo: " + Livro2.Nome);
       System.out.println("Autor: " + Livro2.Autor);
       System.out.println("Paginas: " + Livro2.NumeroPaginas);
       System.out.println("Titulo: " + Livro3.Nome);
       System.out.println("Autor: " + Livro3.Autor);
       System.out.println("Paginas: " + Livro3.NumeroPaginas);

    }

}
