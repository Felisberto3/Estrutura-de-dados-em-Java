package Lista_Simplesmete_Ligada;

public class Testing {
  public static void main(String[] args) {
    ListaLigada<Integer> a = new ListaLigada<>();

    a.adicionar(1);
    a.extrair(1);

    a.show();
  }
}
