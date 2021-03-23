import java.util.*;

public class Tester {
  public static void main(String[] args) {
    MyDeque d = new MyDeque();
    MyDeque b = new MyDeque(100);
    MyDeque z = new MyDeque(0);
    MyDeque n = new MyDeque(-1);
    MyDeque ex = new MyDeque(5);
    System.out.println(d.size());
    System.out.println(b.size());
    System.out.println(z.size());
    System.out.println(n.size());
    System.out.println(b.toString());
    System.out.println(n.toString());
    d.addFirst("a"); //5
    d.addFirst("b"); //4
    d.addFirst("c"); //3
    d.addFirst("d"); //2
    d.addFirst("e"); //1
    d.addFirst("f"); //0
    d.addFirst("g"); //
    System.out.println(d.getFirst());
    System.out.println(d.getLast());
    System.out.println(d.size());
    System.out.println(d.toString());
    b.addLast("FIRST");
    System.out.println(b.getFirst());
    System.out.println(b.getLast());
    System.out.println(b.size());
    System.out.println(b.toString());

    System.out.println();
    ex.addLast(1);
    ex.addLast(2);
    ex.addLast(3);
    ex.addLast(4);
    System.out.println(ex.getFirst());
    System.out.println(ex.getLast());
    System.out.println(ex.toString());

    System.out.println();
    System.out.println(d.removeFirst());
    System.out.println(d.getFirst());
    System.out.println(d.getLast());
    System.out.println(d.size());
    System.out.println(d.toString());
    System.out.println(d.removeLast());
    System.out.println(d.getFirst());
    System.out.println(d.getLast());
    System.out.println(d.size());
    System.out.println(d.toString());

    System.out.println();
    System.out.println(ex.removeFirst());
    System.out.println(ex.getFirst());
    System.out.println(ex.getLast());
    System.out.println(ex.size());
    System.out.println(ex.toString());
    System.out.println(ex.removeLast());
    System.out.println(ex.getFirst());
    System.out.println(ex.getLast());
    System.out.println(ex.size());
    System.out.println(ex.toString());

    System.out.println();
    try {
      z.removeFirst();
    }
    catch(NoSuchElementException e) {
      e.printStackTrace();
    }
    try {
      n.removeLast();
    }
    catch(NoSuchElementException e) {
      e.printStackTrace();
    }
    try {
      z.getFirst();
    }
    catch(NoSuchElementException e) {
      e.printStackTrace();
    }
    try {
      n.getLast();
    }
    catch(NoSuchElementException e) {
      e.printStackTrace();
    }
    try {
      d.addFirst(null);
    }
    catch(NullPointerException e) {
      e.printStackTrace();
    }
    try {
      ex.addLast(null);
    }
    catch(NullPointerException e) {
      e.printStackTrace();
    }

    System.out.println();
    z.addFirst(34.23);
    System.out.println(z.size());
    System.out.println(z.getFirst());
    System.out.println(z.getLast());
    System.out.println(z.toString());
    System.out.println();
    ex.addFirst("a");
    ex.addFirst("b");
    ex.addFirst("c");
    ex.addFirst("d");
    System.out.println(ex.getFirst());
    System.out.println(ex.getLast());
    System.out.println(ex.size());
    System.out.println(ex.toString());
  }
}
