import java.util.*;
public class Calculator {
  @SuppressWarnings("unchecked")
  public static double eval(String s) {
    String[] values = s.split(" ");
    ArrayDeque vals = new ArrayDeque();
    ArrayList<String> operators = new ArrayList<String>(Arrays.asList(new String[] {"+","-","*","/","%"}));
    for(int i = 0; i<values.length; i++) {
      if(operators.contains(values[i])) {
        System.out.println("Operation: " + values[i]);
      }
      else {
        double convert = Double.parseDouble(values[i]);
        vals.addLast(convert);
        System.out.println("Operand: "+vals.getLast());
      }
    }
    return 0.0;
  }
}
