import java.util.*;
public class Tester {
  public static void main(String[] args) {
    System.out.println(Calculator.eval("11 3 - 4 + 2.5 *"));
    System.out.println(Calculator.eval("4 5 7 2 + - *"));
    System.out.println(Calculator.eval("3 4 + 2 * 7 /"));
    System.out.println(Calculator.eval("5 7 + 6 2 - *"));
    System.out.println(Calculator.eval("4 2 + 3 5 1 - * +"));
    try {
      Calculator.eval("4 2 3 5 1 - + * + *");
    }
    catch(IllegalArgumentException e) {
      e.printStackTrace();
    }
    try {
      Calculator.eval("5 3 7 9 + +");
    }
    catch(IllegalArgumentException e) {
      e.printStackTrace();
    }
  }
}
