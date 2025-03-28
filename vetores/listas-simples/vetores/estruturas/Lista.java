package estruturas;

public class Lista {

    No inicio;

    public void Lista() {
        this.inicio = null;
    }

    public void adicionarAoInicio(int valor) {
        No no = new No(valor);

        no.proximo = this.inicio;
        this.inicio = no;
    }

    public void mostrarNos() {
        No noAux = this.inicio;
        while (noAux != null) {
            System.out.print("No " + noAux.dado);
            if (noAux.proximo != null) {
                System.out.println(" | Proximo -> " + noAux.proximo.dado);
            }
            System.out.println("");
            noAux = noAux.proximo;
        }
    }

    public void remover(int valor) {
        No noAux = this.inicio;
        No noAntAux = null;

        while (noAux != null && noAux.dado != valor) {
            noAntAux = noAux;

            noAux = noAux.proximo;
        }

        if (noAux == null) {
            System.out.println("Valor não encontrado");
            return;
        }

        noAntAux.proximo = noAux.proximo;
    }
}
