package Fillas;

public class Filas<T> {
  private No<T> cabeca;
  private No<T> fundo;
  private int tamanho = 0;

  public void adicionar(T dado) {
    No<T> novoNo = new No<T>(dado);

    if (tamanho == 0) {
      this.cabeca = novoNo;
    } else {
      novoNo.setAnterior(fundo);
      this.fundo.setProximo(novoNo);
    }

    this.fundo = novoNo;
    this.tamanho++;
  }

  public T frente() {
    if (tamanho <= 0) {
      return null;
    }
    return this.cabeca.getDado();
  }

  public T extrair() {
    if (tamanho == 0) {
      return null;
    }

    No<T> atual = this.cabeca;

    this.cabeca = this.cabeca.getProximo();
    if (tamanho != 1) {
      this.cabeca.setAnterior(null);
    }

    this.tamanho--;
    return atual.getDado();
  }

  public boolean empty() {
    return tamanho > 0 ? false : true;
  }

  public void show() {
    if (tamanho == 0) {
      System.out.println("[]");
      return;
    }
    No<T> atual = this.cabeca;
    StringBuilder builder = new StringBuilder();

    builder.append("[").append(atual.getDado());
    while (atual.getProximo() != null) {
      atual = atual.getProximo();
      builder.append(",").append(atual.getDado());
    }
    builder.append("]");

    System.out.println(builder);
  }
}
