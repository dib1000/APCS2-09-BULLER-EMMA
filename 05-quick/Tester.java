public class Tester {
  public static void main(String[] args) {
    int[] data = {999,999,999,4,3,2,1,0,999,999,999};
    int[] doubles = {999,999,999,5,5,12,12,13,13,999,999,999};
    int[] numbers = {5,6,3,2,9,18,43,58,23,82};
    System.out.println(Preliminary.partition(data,3,3));
    System.out.println(Preliminary.partition(data,3,7));
    System.out.println(Preliminary.partition(doubles,3,8));
    System.out.println(Preliminary.partition(numbers,1,2));
    System.out.println(Preliminary.partition(numbers,0,6));
  }
}
