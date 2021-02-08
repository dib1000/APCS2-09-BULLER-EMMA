public class Tester {
  public static void main(String[] args) {
    System.out.println(Recursion.reverse("abcdefghijklmnopqrstuvwxyz"));
    System.out.println(Recursion.reverse("somewhere over the rainbow"));
    System.out.println(Recursion.reverse("Sore was I ere I saw Eros"));
    System.out.println(Recursion.reverse("a"));
    System.out.println(Recursion.reverse(""));

    System.out.println();
    System.out.println(Recursion.countNoDoubleLetterWords(0,""));
  }
}
