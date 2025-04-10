public class NoDuplo {
    Object valor;
    NoDuplo anterior;
    NoDuplo proximo;

    public NoDuplo(Object valor) {
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    
    
}
