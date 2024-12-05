package Pilhas;

public class Testing {
  public static void main(String[] args) {
    Pilhas<Integer> a = new Pilhas<>();

    // a.push(4);
    // a.push(1);
    // a.push(2);
    // a.push(3);
    a.show();
    System.out.println("Empty " + a.empty());
    System.out.println("ToP " + a.top());
    System.out.println("PoP " + a.pop());
    a.show();
  }
}
