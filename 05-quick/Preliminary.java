import java.util.*;
public class Preliminary {
  public static int partition(int[] data, int start, int end) {
    int random = ((int)(Math.random() * (end-start))) + start;
    int storage = data[start];
    data[start] = data[random];
    data[random] = storage;
    System.out.println(Arrays.toString(data));
    return 35;
   }
}
