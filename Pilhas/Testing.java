package Pilhas;

public class Testing {
  public static void main(String[] args) {
    Pilhas<Integer> a = new Pilhas<>();

    // a.push(1);
    // a.push(2);
    // a.push(3);
    // a.push(4);
    System.out.println(a.top());
    a.show();
    System.out.println(a.toString());
  }
}
