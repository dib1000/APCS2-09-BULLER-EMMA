public class Driver {
  public static void main(String[] args) {
    QueenBoard q = new QueenBoard(8);
    System.out.println(q.toString());

//TESTING ADD (will be commented out later);
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

//TESTING REMOVE (WILL BE COMMENTED OUT LATER)
   q.removeQueen(0,0);
   System.out.println(q.toString());
   q.addQueen(1,0);
   System.out.println(q.toString());
   System.out.println(q.addQueen(0,7));
   q.removeQueen(5,7);
   System.out.println(q.addQueen(0,7));
  }
}
