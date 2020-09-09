import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Palindrom{
  public static void main(String[] args) {
    String s="abcba";
    System.out.println(isPalindrom(s));
  }
  public static boolean isPalindrom(String s){
    char[] c=s.toCharArray();
    int i=0,j=c.length-1;
    while(i<j){
      if(c[i]!=c[j]){return false;}
      ++i;
      --j;
    }
    return true;
  }

  @Test
  public void testIsPalindrom(){
    assertEquals(true,isPalindrom("abcba"));
    assertEquals(false,isPalindrom("abbb"));
    assertEquals(true,isPalindrom("aaaaa"));
    assertEquals(true,isPalindrom("aaaaa"));
  }

  @Test
  public void testPalindrom(){
    assertEquals(true,isPalindrom("abcba"));
    assertEquals(false,isPalindrom("abbb"));
    assertEquals(true,isPalindrom("aaaaa"));
    assertEquals(true,isPalindrom("aaaaa"));
  }
}