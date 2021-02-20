public class Driver {
  public static void main(String[] args) {
    QueenBoard q = new QueenBoard(8);
    System.out.println(q.toString());

    q.addQueen(0,0);
    System.out.println(q.toString());
    System.out.println(q.addQueen(5,0));
    System.out.println(q.addQueen(2,2));
    System.out.println(q.addQueen(0,6));
    q.addQueen(5,7);
    System.out.println(q.toString());
    q.addQueen(6,4);
    System.out.println(q.toString());
    System.out.println(q.addQueen(5,4));
  }
}
