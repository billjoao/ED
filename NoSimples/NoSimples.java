public class NoSimples {
    No primeiroNo;
    No ultimoNo;
    int quantidade = 0

    public void add(Object info){
        No novoNo = new No(info);

        if(quantidade == 0){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            ultimoNo.proximo = novoNo;
            ultimoNo = novoNo
        }
        tamanho ++;
    }

    public String get(int indice){
        return buscarNo(indice).info;
    }

    public No buscarNo(int indice){
        No aux == primeiroNo;

        for(int i=0; i < indice; i++){
            aux = aux.proximo;
        }
        return aux;
    }

}
