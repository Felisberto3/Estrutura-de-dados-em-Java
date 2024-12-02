package Lista_Duplamente_Ligada;

public class NoD<T> {

  private T dado;
  private NoD<T> anterior;
  private NoD<T> seguinte;

  public NoD(T dado) {
    this.dado = dado;
  }

  public NoD(T dado, NoD<T> anterior, NoD<T> seguinte) {
    this.dado = dado;
    this.anterior = anterior;
    this.seguinte = seguinte;
  }

  public T getDado() {
    return dado;
  }

  public void setDado(T dado) {
    this.dado = dado;
  }

  public NoD<T> getAnterior() {
    return anterior;
  }

  public void setAnterior(NoD<T> anterior) {
    this.anterior = anterior;
  }

  public NoD<T> getSeguinte() {
    return seguinte;
  }

  public void setSeguinte(NoD<T> seguinte) {
    this.seguinte = seguinte;
  }

  @Override
  public String toString() {
    return "NoD [dado=" + dado + ", anterior=" + anterior + ", seguinte=" + seguinte + "]";
  }

  // resumo de humanidade
  // Estudar fortemente Probabilidade e Estatistica
  // Resolver o meu pendente de Lista Duplamente Ligada

}
