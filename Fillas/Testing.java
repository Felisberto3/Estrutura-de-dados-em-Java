package Fillas;

public class Testing {
  public static void main(String[] args) {
    Filas<Integer> a = new Filas<>();

    // a.adicionar(6);
    a.adicionar(200000000);
    a.adicionar(2);
    a.adicionar(3);
    // a.adicionar(3);
    a.show();
    System.out.println(a.frente());
  }
}
