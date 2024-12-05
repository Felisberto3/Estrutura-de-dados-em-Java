package Pilhas;

public class No<T> {

  private T dado;
  private No<T> anterior;
  private No<T> proximo;

  public No(T dado) {
    this.dado = dado;
  }

  public No(T dado, No<T> proximo) {
    this.dado = dado;
    this.proximo = proximo;
  }

  public T getDado() {
    return dado;
  }

  public void setDado(T dado) {
    this.dado = dado;
  }

  public No<T> getProximo() {
    return proximo;
  }

  public void setProximo(No<T> proximo) {
    this.proximo = proximo;
  }

  public No<T> getAnterior() {
    return anterior;
  }

  public void setAnterior(No<T> anterior) {
    this.anterior = anterior;
  }

  @Override
  public String toString() {
    return "No [dado=" + dado + ", proximo=" + proximo + "]";
  }

}