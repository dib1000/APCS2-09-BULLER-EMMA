import java.util.*;
public class Preliminary {
  public static int partition(int[] data, int start, int end) {
    int random = ((int)(Math.random() * (end-start))) + start;
    int storage = data[start];
    data[start] = data[random];
    data[random] = storage;
    System.out.println(Arrays.toString(data));
    int current = start+1;
    int greater = end;
    while(current<greater) {
      if(data[current]<data[start]) {
        current+=1;
      }
      else if(data[current]>data[start]) {
        int swap = data[greater];
        data[greater] = data[current];
        data[current] = swap;
        greater-=1;
      }
    }
    System.out.println(current + "," + greater);
    System.out.println(Arrays.toString(data));
    return 35;
   }
}
