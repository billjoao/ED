public class ListaDuplamenteLigada {

    private NoDuplo inicio;
    private NoDuplo fim;
    private int tamanho;

    public ListaDuplamenteLigada(NoDuplo inicio, NoDuplo fim, int tamanho) {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void adicionar(Object elemento) {
        NoDuplo novoNo = new NoDuplo(elemento);

        if (fim == null) {
            inicio = fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            novoNo.setAnterior(fim);
            fim = novoNo;
        }
        tamanho++;
    }

    public void adicionar(Object elemento, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição Inválida");
        }

        NoDuplo novoNo = new NoDuplo(elemento);

        if (posicao == 0) {
            novoNo.setProximo(inicio);
            inicio.setAnterior(novoNo);
            inicio = novoNo;
        } else if (posicao == tamanho) {
            novoNo.setAnterior(fim);
            fim.setProximo(novoNo);
            fim = novoNo;
        } else {
            NoDuplo atual = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }

            NoDuplo proximoNo = atual.getProximo();
            atual.setProximo(novoNo);
            novoNo.setAnterior(novoNo);
            novoNo.setProximo(proximoNo);
            proximoNo.setAnterior(novoNo);
        }
        tamanho++;
    }

}