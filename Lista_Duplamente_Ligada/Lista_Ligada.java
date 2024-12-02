package Lista_Duplamente_Ligada;

public class Lista_Ligada<T> {

  private NoD<T> cabeca;
  private NoD<T> fundo;
  private int tamanho = 0;

  public boolean vazia() {
    return tamanho <= 0 ? true : false;
  }

  public int extensao() {
    return tamanho;
  }

  public void adicionar(T dado) {
    NoD<T> novoNoD = new NoD<>(dado);
    if (tamanho == 0) {
      this.cabeca = novoNoD;
    } else {
      novoNoD.setAnterior(fundo);
      this.fundo.setSeguinte(novoNoD);
    }

    this.fundo = novoNoD;
    this.tamanho++;
  }

  private void posicaoValida(int posicao) {
    if (posicao < 0 || posicao >= tamanho) {
      throw new IllegalArgumentException("Posicao Inválida");
    }
  }

  private NoD<T> pegarElemento(int posicao) {
    NoD<T> atual = this.cabeca;

    for (int i = 0; i < posicao; i++) {
      atual = atual.getSeguinte();
    }

    return atual;
  }

  public void adicionar(T dado, int posicao) {

    if (posicao == tamanho) {
      this.adicionar(dado);
    } else if (posicao == 0) {
      NoD<T> novo = new NoD<T>(dado, null, cabeca);
      if (tamanho > 0) {
        this.cabeca.setAnterior(novo);
      }
      this.cabeca = novo;
      this.tamanho++;
    } else {
      this.posicaoValida(posicao);

      NoD<T> anterior = this.pegarElemento(posicao - 1);
      NoD<T> seguinte = anterior.getSeguinte();

      NoD<T> novo = new NoD<T>(dado, anterior, seguinte);

      anterior.setSeguinte(novo);
      this.tamanho++;

    }

  }

  public T obter(int posicao) {
    this.posicaoValida(posicao);
    return this.pegarElemento(posicao).getDado();
  }

  public int procurar(T dado) {
    NoD<T> atual = this.cabeca;
    int posicao = 0;
    while (atual != null) {
      if (atual.getDado().equals(dado)) {
        return posicao;
      }
      atual = atual.getSeguinte();
      posicao++;
    }

    return -1;
  }

  public void extrair(int posicao) {

    if (posicao == 0) {
      this.cabeca.setAnterior(null);
      this.cabeca = this.cabeca.getSeguinte();
    } else {
      this.posicaoValida(posicao);

      NoD<T> noParaEliminar = this.pegarElemento(posicao);

      NoD<T> anterior = noParaEliminar.getAnterior();
      NoD<T> posterior = noParaEliminar.getSeguinte();

      anterior.setSeguinte(posterior);
      if (posicao != tamanho - 1) {
        posterior.setAnterior(anterior);
      }
    }

    tamanho--;
  }

  public void show() {
    if (tamanho == 0) {
      System.out.println("[]");
      return;
    }

    NoD<T> atual = this.cabeca;
    StringBuilder builder = new StringBuilder();
    builder.append("[").append(atual.getDado());
    while (atual.getSeguinte() != null) {
      atual = atual.getSeguinte();
      builder.append(",").append(atual.getDado());
    }
    builder.append("]");

    System.out.println(builder.toString());
  }

  @Override
  public String toString() {
    return "Lista_Ligada [cabeca=" + cabeca + ", fundo=" + fundo + "]";
  }

}