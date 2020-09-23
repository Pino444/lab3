
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void testEmptyString(){
        assertTrue(Palindrome.checkPalindrome(""));
    }
    @Test
    public void testIsPalindrome(){
        assertTrue(Palindrome.checkPalindrome("a"));
        assertTrue(Palindrome.checkPalindrome("aa"));
        assertTrue(Palindrome.checkPalindrome("aba"));
        assertTrue(Palindrome.checkPalindrome("abbba"));
    }
    @Test
    public void testIsNotPalindrome(){
        assertFalse(Palindrome.checkPalindrome("ab"));
        assertFalse(Palindrome.checkPalindrome("abaa"));
        assertFalse(Palindrome.checkPalindrome("abc"));
    }
}