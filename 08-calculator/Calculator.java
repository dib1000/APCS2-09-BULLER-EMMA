public class Calculator {
  public static double eval(String s) {
    String[] operators = s.split(" ");
    for(int i = 0; i<operators.length; i++) {
      System.out.println(operators[i]);
    }
    return 0.0;
  }
}
