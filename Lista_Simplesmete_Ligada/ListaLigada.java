package Lista_Simplesmete_Ligada;

public class ListaLigada<T> {

  private No<T> cabeca;
  private No<T> fundo;
  private int tamanho = 0;

  public boolean vazia() {
    return tamanho <= 0 ? true : false;
  }

  public int extensao() {
    return tamanho;
  }

  public void adicionar(T dado) {
    No<T> novoNo = new No<T>(dado);

    if (tamanho == 0) {
      this.cabeca = novoNo;
    } else {
      this.fundo.setProximo(novoNo);
    }
    this.fundo = novoNo;
    this.tamanho++;
  }

  private No<T> pegarElemento(int posicao) {
    No<T> atual = this.cabeca;

    for (int i = 0; i < posicao; i++) {
      atual = atual.getProximo();
    }

    return atual;
  }

  private void posicaoValida(int posicao) {
    if (posicao < 0 || posicao >= tamanho) {
      throw new IllegalArgumentException("Posicao Invalida!");
    }
  }

  public void adicionar(T dado, int posicao) {
    No<T> novoNo = new No<T>(dado, cabeca);
    if (posicao == 0) {
      this.cabeca = novoNo;

      if (tamanho == 0) {
        fundo = novoNo;
      }

      tamanho++;

    } else if (posicao == tamanho) {
      this.adicionar(dado);

    } else {
      this.posicaoValida(posicao);

      No<T> anterior = pegarElemento(posicao - 1);
      No<T> atual = anterior.getProximo();
      No<T> proximoNo = new No<T>(dado, atual);

      anterior.setProximo(proximoNo);
      tamanho++;
    }

  }

  public T obter(int posicao) {
    this.posicaoValida(posicao);

    return pegarElemento(posicao).getDado();
  }

  public int procurar(T dado) {
    No<T> atual = this.cabeca;
    int posicao = 0;

    while (atual != null) {
      if (atual.getDado().equals(dado)) {
        return posicao;
      }
      posicao++;
      atual = atual.getProximo();
    }

    return -1;
  }

  public void extrair(int posicao) {
    this.posicaoValida(posicao);

    if (posicao == 0) {
      this.cabeca = this.cabeca.getProximo();

      if (tamanho == 1) {
        this.fundo = null;
      }
    } else {

      No<T> anterior = pegarElemento(posicao - 1);
      No<T> atual = anterior.getProximo();
      No<T> proximo = atual.getProximo();

      anterior.setProximo(proximo);
    }
    this.tamanho--;
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

    System.out.println(builder.toString());
  }

}
