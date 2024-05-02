public class TesteLecionar {
    public static void main(String[] args) {
        ProfessorHorista profHorista = new ProfessorHorista();
        profHorista.setNome("José");
        ProfessorPesquisador profPesq = new ProfessorPesquisador();
  profPesq.setNome("Henrique");
  profHorista.lecionar();
        profPesq.lecionar();
    }
}
    