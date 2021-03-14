import java.util.*;
public class Quick {
  public static int quickselect(int[] data, int k) {
    int start = 0;
    int end = data.length-1;
    while(start!=k || end!=k) {
      int part = Preliminary.partition(data,start,end);
      System.out.println(part);
      if(part==k) {
        start = k;
        end = k;
      }
      else if (part>k) {
        end = part-1;
      }
      else {
        start = part+1;
      }
      System.out.println(start + " " + end);
    }
    return data[k];
  }
}
