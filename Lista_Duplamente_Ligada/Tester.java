package Lista_Duplamente_Ligada;

public class Tester {
  public static void main(String[] args) {
    Lista_Ligada<Integer> a = new Lista_Ligada<>();

    a.adicionar(1, 0);
    a.adicionar(2, 0);
    a.adicionar(3, 2);
    a.adicionar(3, 2);
    a.adicionar(4, 1);
    a.adicionar(5, 4);
    a.adicionar(6, 2);
    a.adicionar(7, 6);
    a.adicionar(8, 7);
    a.show();
    a.adicionar(3, 4);
    // a.extrair(8);
    // a.extrair(7);
    // a.extrair(6);
    // a.extrair(5);
    // a.extrair(0);
    // a.extrair(1);
    // a.extrair(1);
    // a.extrair(0);
    // a.extrair(1);
    a.show();
    System.out.println(a.toString());
    System.out.println(a.extensao());
    System.out.println(a.vazia());

  }
}
