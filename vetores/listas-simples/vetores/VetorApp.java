import estruturas.Lista;


public class VetorApp {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adicionarAoInicio(2);
        lista.adicionarAoInicio(7);
        lista.adicionarAoInicio(9);
        lista.adicionarAoInicio(12);
        lista.adicionarAoInicio(16);
        lista.adicionarAoInicio(21);
        lista.adicionarAoInicio(27);
        lista.adicionarAoInicio(33);
        lista.adicionarAoInicio(42);
        lista.adicionarAoInicio(54);

        lista.mostrarNos();

        lista.remover(27);
        System.out.println("depois da remocao");
        lista.mostrarNos();
    }
}