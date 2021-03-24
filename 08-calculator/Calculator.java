import java.util.*;
public class Calculator {
  @SuppressWarnings("unchecked")
  public static double eval(String s) {
    String[] math = s.split(" ");
    ArrayDeque vals = new ArrayDeque();
    ArrayList<String> operators = new ArrayList<String>(Arrays.asList(new String[] {"+","-","*","/","%"}));
    for(int i = 0; i<math.length; i++) {
      if(operators.contains(math[i])) {
        if(vals.size()<2) {
          throw new IllegalArgumentException("Not enough operands");
        }
        else {
          double one = (double) vals.removeLast();
          double two = (double) vals.removeLast();
          double add = 0;
          if(math[i].equals("+")) {
            add = two+one;
          }
          if(math[i].equals("-")) {
            add = two-one;
          }
          if(math[i].equals("*")) {
            add = two*one;
          }
          if(math[i].equals("/")) {
            add = two/one;
          }
          if(math[i].equals("%")) {
            add = two%one;
          }
          vals.addLast(add);
        }
      }
      else {
        double convert = Double.parseDouble(math[i]);
        vals.addLast(convert);
      }
    }
    return (double) vals.getLast();
  }
}
