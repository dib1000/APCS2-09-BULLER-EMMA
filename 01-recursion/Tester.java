public class Tester {
  public static void main(String[] args) {
    System.out.println(Recursion.reverse("abcdefghijklmnopqrstuvwxyz"));
    System.out.println(Recursion.reverse("somewhere over the rainbow"));
    System.out.println(Recursion.reverse("Sore was I ere I saw Eros"));
    System.out.println(Recursion.reverse("a"));
    System.out.println(Recursion.reverse(""));

    System.out.println();
    System.out.println(Recursion.countNoDoubleLetterWords(0,""));
    System.out.println(Recursion.countNoDoubleLetterWords(1,""));
    System.out.println(Recursion.countNoDoubleLetterWords(2,""));
    System.out.println(Recursion.countNoDoubleLetterWords(3,""));
    System.out.println(Recursion.countNoDoubleLetterWords(4,""));
    System.out.println(Recursion.countNoDoubleLetterWords(5,""));
    //System.out.println(Recursion.countNoDoubleLetterWords(6,""));
    //System.out.println(Recursion.countNoDoubleLetterWords(7,""));

    System.out.println();
    System.out.println(Recursion.sqrt(100));
    System.out.println(Recursion.sqrt(2));
    for(int i = 0; i<20; i++) {
      double check = Math.random() * 10000;
      double guess = Recursion.sqrt(check);
      double actual = Math.sqrt(check);
      if(Math.abs(guess-actual)<=0.00001) {
        System.out.println("TRUE");
      }
      else {
        System.out.println(check);
      }
    }
  }
}
