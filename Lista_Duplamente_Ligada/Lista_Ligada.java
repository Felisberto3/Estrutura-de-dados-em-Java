package Lista_Duplamente_Ligada;

public class Lista_Ligada<T> {
  // vazia ✔
  // extensao ✔
  // adicionar ✔
  // adicionar ✔
  // obter
  // extrair
  // procurar

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
    if (posicao == 0) {
      NoD<T> novNoD = new NoD<T>(dado, null, cabeca);
      this.cabeca = novNoD;

      if (tamanho == 0) {
        this.fundo = novNoD;
      } else {
        this.cabeca.setAnterior(novNoD);
      }
      tamanho++;

    } else if (posicao == tamanho) {
      this.adicionar(dado);
    } else {
      this.posicaoValida(posicao);
      NoD<T> anterior = this.pegarElemento(posicao - 1);
      NoD<T> atual = anterior.getSeguinte();
      NoD<T> novoNoD = new NoD<T>(dado, anterior, atual);
      anterior.setSeguinte(novoNoD);
      tamanho++;

    }

  }

  public T obter(int posicao) {
    this.posicaoValida(posicao);
    return this.pegarElemento(posicao).getDado();
  }

  public void extrair(int posicao) {

    this.posicaoValida(posicao);

    NoD<T> noParaEliminar = this.pegarElemento(posicao);

    NoD<T> anterior = noParaEliminar.getAnterior();
    NoD<T> posterior = noParaEliminar.getSeguinte();

    anterior.setSeguinte(posterior);

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