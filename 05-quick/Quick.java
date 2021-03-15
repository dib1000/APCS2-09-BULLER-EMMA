import java.util.*;
public class Quick {
  public static int quickselect(int[] data, int k) {
    int start = 0;
    int end = data.length-1;
    while(start!=k || end!=k) {
      int part = Preliminary.partition(data,start,end);
      //System.out.println(part);
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
      //System.out.println(start + " " + end);
    }
    return data[k];
  }

  public static void quicksort(int[] data) {
    quicksort(data,0,data.length-1);
  }

  public static void quicksort(int[] data, int start, int end) {
    if(start!=end) {
      int part = Preliminary.partition(data,start,end);
      //System.out.println(Arrays.toString(data));
      //System.out.println(part);
      if(!(part==start)) {
        quicksort(data,start,part-1);
      }
      if(!(part==end)) {
        quicksort(data,part+1,end);
    }
    }
  }
}
