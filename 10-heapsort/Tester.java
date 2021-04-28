import java.util.*;

public class Tester {
  public static void main(String[] args) {
    int[] nums = {8, 16, 9, 13, 4, 0, 11};
    MyHeap.pushDown(nums,7,0);
    MyHeap.pushDown(nums,7,6);
    MyHeap.pushDown(nums,7,2);
    System.out.println(Arrays.toString(nums));

    int[] fill = new int[10];
    for(int i = 0; i<6; i++) {
      fill[i] = (int)(Math.random() * 100);
    }
    System.out.println(Arrays.toString(fill));
    MyHeap.pushDown(fill,6,0);
    System.out.println(Arrays.toString(fill));
    MyHeap.pushDown(fill,6,2);
    System.out.println(Arrays.toString(fill));

    int[] child = {9,16};
    MyHeap.pushDown(child,2,0);
    System.out.println(Arrays.toString(child));

    int[] equal = new int[15];
    for(int i = 0; i<7; i++) {
      equal[i] = 15;
    }
    MyHeap.pushDown(equal,7,0);
    MyHeap.pushDown(equal,7,4);
    MyHeap.pushDown(equal,7,6);
    System.out.println(Arrays.toString(equal));

    System.out.println();
    System.out.println("TESTING REMOVE");
    int[] t = {23,1,6,19,14,18,8,24,15};
    MyHeap.buildHeap(t);
    System.out.println(Arrays.toString(t));
    MyHeap.remove(t,t.length); //index 8
    System.out.println(Arrays.toString(t));
    MyHeap.remove(t,t.length-1); //index 7
    System.out.println(Arrays.toString(t));
    MyHeap.remove(t,t.length-2); //index 6
    System.out.println(Arrays.toString(t));
    MyHeap.remove(t,t.length-3); //index 6
    System.out.println(Arrays.toString(t));
    MyHeap.remove(t,t.length-4); //index 6
    System.out.println(Arrays.toString(t));
    MyHeap.remove(t,t.length-5); //index 6
    System.out.println(Arrays.toString(t));
    MyHeap.remove(t,t.length-6); //index 6
    System.out.println(Arrays.toString(t));
    MyHeap.remove(t,t.length-7); //index 6
    System.out.println(Arrays.toString(t));

  }
}
