public class Driver {
  public static void main(String[] args) {
    QueenBoard q = new QueenBoard(8);
    System.out.println(q.toString());

// //TESTING ADD (will be commented out later);
//     q.addQueen(0,0);
//     System.out.println(q.toString());
//     System.out.println(q.addQueen(5,0));
//     System.out.println(q.addQueen(2,2));
//     System.out.println(q.addQueen(0,6));
//     q.addQueen(5,7);
//     System.out.println(q.toString());
//     q.addQueen(6,4);
//     System.out.println(q.toString());
//     System.out.println(q.addQueen(5,4));
//
// //TESTING REMOVE (WILL BE COMMENTED OUT LATER)
//    q.removeQueen(0,0);
//    System.out.println(q.toString());
//    q.addQueen(1,0);
//    System.out.println(q.toString());
//    System.out.println(q.addQueen(0,7));
//    q.removeQueen(5,7);
//    System.out.println(q.addQueen(0,7));

    //TESTING solve
    QueenBoard f = new QueenBoard(4);
    System.out.println(f.solve());
    System.out.println(f.toString());
    q.solve();
    System.out.println(q.toString());
    try {
      q.solve();
    }
    catch(IllegalStateException e) {
      e.printStackTrace();
    }

    QueenBoard t = new QueenBoard(2);
    QueenBoard tr = new QueenBoard(3);
    QueenBoard o = new QueenBoard(1);
    System.out.println(t.solve());
    System.out.println(tr.solve());
    System.out.println(t.toString());
    System.out.println(tr.toString());
    System.out.println(o.solve());
    System.out.println(o.toString());
    // QueenBoard big = new QueenBoard(25);
    // big.solve();
    // System.out.println(big.toString());

    System.out.println();

    System.out.println("TESTING countSolutions");
    QueenBoard wow = new QueenBoard(4);
    QueenBoard eight = new QueenBoard(5);
    System.out.println(wow.countSolutions());
    // System.out.println(wow.toString());
    System.out.println(eight.countSolutions());
    // System.out.println(eight.toString());
    // System.out.println(tr.countSolutions());
    // System.out.println(t.countSolutions());
    // try {
    //   o.countSolutions();
    // }
    // catch(IllegalStateException e) {
    //   e.printStackTrace();
    // }

  }
}
