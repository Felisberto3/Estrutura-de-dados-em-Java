package Pilhas;

public class Pilhas<T> {
  private No<T> inicio;
  private No<T> topo;
  private int tamanho = 0;

  public void push(T dado) {
    No<T> novoNo = new No<T>(dado);

    if (tamanho == 0) {
      this.inicio = novoNo;
    } else {
      novoNo.setAnterior(topo);
      this.topo.setProximo(novoNo);
    }

    this.topo = novoNo;
    this.tamanho++;
  }

  private void posicaoValida(int posicao) {

    if (posicao < 0 || posicao >= tamanho) {
      throw new IllegalArgumentException("Posicao Invalida");
    }
  }

  private No<T> getElement(int index) {
    No<T> actual = this.inicio;

    for (int i = 0; i < index; i++) {
      actual = actual.getProximo();
    }

    return actual;
  }

  public T top() {
    if (tamanho > 0) {
      return topo.getDado();
    }
    return null;

  }

  public void show() {

    if (tamanho == 0) {
      System.out.println("[]");
      return;
    }
    No<T> atual = this.inicio;
    StringBuilder builder = new StringBuilder();

    builder.append("[").append(atual.getDado());
    while (atual.getProximo() != null) {
      atual = atual.getProximo();
      builder.append(",").append(atual.getDado());
    }
    builder.append("]");

    System.out.println(builder.toString());
  }

  @Override
  public String toString() {
    return "Pilhas [inicio=" + inicio + ", topo=" + topo + ", tamanho=" + tamanho + "]";
  }

}
