package Lista_Duplamente_Ligada;

public class Tester {
  public static void main(String[] args) {
    Lista_Ligada<Integer> a = new Lista_Ligada<>();

    a.adicionar(1, 0);
    a.adicionar(2, 0);
    a.adicionar(1, 0);
    a.adicionar(1, 0);
    a.adicionar(1, 0);
    a.adicionar(1, 0);
    a.adicionar(30, -1);
    a.show();
    System.out.println(a.extensao());
    System.out.println(a.vazia());

  }
}
