public class Tester {
  public static void main(String[] args) {
    int[] data = {999,999,999,4,3,2,1,0,999,999,999};
    int[] doubles = {999,999,999,5,5,12,12,13,13,999,999,999};
    int[] numbers = {5,6,3,2,9,18,43,58,23,82};
    int[] piv = {9,-3,5,2,6,8,-6,1,3};
    int[] ary = {2, 10, 15, 23, 0, 5};
    int[] same = new int[1000000];
    for(int i = 0; i<same.length; i++) {
      same[i] = (int)(Math.random()*100);
    }
    System.out.println(Preliminary.partition(data,3,3));
    System.out.println(Preliminary.partition(data,3,7));
    System.out.println(Preliminary.partition(doubles,3,8));
    System.out.println(Preliminary.partition(numbers,1,2));
    System.out.println(Preliminary.partition(numbers,0,6));
    System.out.println(Quick.quickselect(piv,0));
    System.out.println(Quick.quickselect(ary,4));
    System.out.println(Quick.quickselect(doubles,7));
    System.out.println(Quick.quickselect(same,764434));
  }
}
