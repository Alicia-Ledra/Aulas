import java.io.IOException;

public class Exceção1 {
    public static void main(String[] args) {
        try {
            inputName("Alícia");

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

        static void inputName(String name) throws IOException {
            if (name = null || name.isEmpty()) {
                throw new IOException("O valor não pode ser nulo");
            }
            System.out.println("Nome:" + name);
        }
}
