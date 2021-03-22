public class Tester {
  public static void main(String[] args) {
    MyDeque d = new MyDeque();
    MyDeque b = new MyDeque(100);
    MyDeque z = new MyDeque(0);
    MyDeque n = new MyDeque(-1);
    System.out.println(d.size());
    System.out.println(b.size());
    System.out.println(z.size());
    System.out.println(n.size());
  }
}
