import estruturas.Vetor;
import estruturas.Lista;
import estruturas.No;

public class VetorApp {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar(2);
        vetor.adicionar(9);
        vetor.adicionar(21);
        vetor.adicionar(33);
        vetor.adicionar(34);
        vetor.adicionar(37);
        vetor.adicionar(42);
        vetor.adicionar(55);
        vetor.adicionar(57);
        vetor.adicionar(58);
        vetor.adicionar(60);

        vetor.mostrarElementos();
    }
}