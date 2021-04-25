import java.util.*;
public class buildTester {
  public static void main(String[] args) {
    int[] one = {8, 16, 9, 13, 4, 0, 11};
    MyHeap.buildHeap(one);
    System.out.println(Arrays.toString(one));
    int[] reverse = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    MyHeap.buildHeap(reverse);
    System.out.println(Arrays.toString(reverse));
    int[] test = new int[500000000];
    for(int i = 0; i<test.length; i++) {
      test[i] = (int) (Math.random() * 100);
    }
   long start = System.currentTimeMillis();
   MyHeap.buildHeap(test);
   double ranTime = (System.currentTimeMillis()-start)/1000.0;
   System.out.println(ranTime);

   for(int i = 0; i<test.length; i++) {
     test[i] = test.length-i;
   }
  long startb = System.currentTimeMillis();
   MyHeap.buildHeap(test);
  double reverseTime = (System.currentTimeMillis()-startb)/1000.0;
  System.out.println(reverseTime);

  for(int i = 0; i<test.length; i++) {
    test[i] = i;
  }
   long startc = System.currentTimeMillis();
   MyHeap.buildHeap(test);
   double orderTime = (System.currentTimeMillis()-startc)/1000.0;
   System.out.println(orderTime);

 for(int i = 0; i<test.length; i++) {
   test[i] = 4;
 }
  long startd = System.currentTimeMillis();
  MyHeap.buildHeap(test);
  double equalTime = (System.currentTimeMillis()-startd)/1000.0;
  System.out.println(equalTime);
  }
}
