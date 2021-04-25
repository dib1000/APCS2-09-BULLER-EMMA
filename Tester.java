import java.util.*;

public class Tester {
  public static void main(String[] args) {
    int[] nums = {8, 16, 9, 13, 4, 0, 11};
    MyHeap.pushDown(nums,7,0);
    System.out.println(Arrays.toString(nums));
  }
}
