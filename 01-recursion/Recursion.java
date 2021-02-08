public class Recursion {
  public static String reverse(String s) {
    if(s.length()<=1) {
      return s;
    }
    else {
      return s.substring(s.length()-1) + reverse(s.substring(0,s.length()-1));
    }
  }

  public static long countNoDoubleLetterWords(int length,String word) {
    if(length==0) {
      if(word.length()==0) {
        return 0;
      }
      else {
        return 1;
      }
    }
    else {
      return 21;
    }
  }
}
