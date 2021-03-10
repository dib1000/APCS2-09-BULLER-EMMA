public class Tester {
  public static void main(String[] args) {
    int[] data = {999,999,999,4,3,2,1,0,999,999,999};
    int[] doubles = {999,999,999,5,5,12,12,13,13,999,999,999};
    System.out.println(Preliminary.partition(data,3,7));
    System.out.println(Preliminary.partition(doubles,3,8));
  }
}
