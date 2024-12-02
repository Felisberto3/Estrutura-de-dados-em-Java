package Lista_Simplesmete_Ligada;

public class Testing {
  public static void main(String[] args) {
    ListaLigada<Integer> a = new ListaLigada<>();

    a.adicionar(1);
    a.adicionar(1);
    a.adicionar(2);
    a.adicionar(1);
    a.adicionar(10, 0);
    a.adicionar(23, 0);
    a.adicionar(10002, 0);
    a.adicionar(10001, 0);
    System.out.println(a.extensao());
    System.out.println(a.vazia());
    a.show();
  }
}
