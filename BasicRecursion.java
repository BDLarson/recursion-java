import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * A set of JUnit tests that demonstrate various types of recursion.
 *
 * Blake Larson -10 points if you don't put your name here  :-)
 */
public class BasicRecursion {

  /**
   * Return the length of the string s.
   *
   * @param s The string to evaluate.
   * @return The length of s.
   */
  public int length(final String s) {
	  if (s == null || s.equals("")) {
		 return 0; 
	  }
	  return 1 + length(s.substring(1));
  }


  /**
   * Test the recursive length() method.
   */
  @Test
  public void testLength() {
    assertEquals(0, length(""));
    assertEquals(1, length("A"));
    assertEquals(2, length("GO"));
    assertEquals(3, length("XYZ"));
  }


  /**
   * Reverse a string.
   *
   * @param s The string to reverse.
   * @return The reversed string.
   */
  public String reverseString(final String s) {
	  if (s == null || s.equals("")) {
		  return s;
	  }
	  String r = reverseString(s.substring(1)) + s.charAt(0);
	  System.out.println(r); //Test that the reversal is working.
	  return r;
  }


  /**
   * Test the reverseString() method.
   */
  @Test
  public void testReverseString() {
    assertEquals("", reverseString(""));
    assertEquals("A", reverseString("A"));
    assertEquals("OG", reverseString("GO"));
    assertEquals("ZYX", reverseString("XYZ"));
    assertEquals("lkjhgfdsa", reverseString("asdfghjkl"));
    assertEquals("RACECAR", reverseString("RACECAR"));  // A palindrome.
  }


  /**
   * The method runs a summation of the value of n.
   *
   * @param n The number of times the program adds to itself
   * @return  The Summation of the value of n.
   */
  public int mystery(final int n) {
    if (n == 0) {
      return 0;
    } else {
      return n + mystery(n - 1);
    }

  }


  /**
   * Exercise the mystery function, printing out the results of the first 10
   * iterations.
   */
  @Test
  public void doMystery() {

    for (int i = 0; i < 10; i++) {
      System.out.println(i + ": " + mystery(i));
    }
  }



  /**
   * Print a loan amortization schedule.
   *
   * Periodic interest is applied before the periodic payment is made.
   *
   * @param principal The current principal of the loan.
   * @param interest  The per-period interest rate of the loan.
   * @param payment   The periodic payment of the loan.
   */
  public void loan(final double principal
                 , final double interest
                 , final int payment) {
    // Implement this method
  }


  /**
   * Test a basic loan that can be paid off.
   */
  @Test
  public void testLoan() {
    loan(10000, 0.05, 1000);
  }


  /**
   * Test a basic loan that can not be paid off.
   */
  @Test (expected = RuntimeException.class)
  public void testLoanUnderFunded() {
    loan(10000, 0.05, 100);
  }
  
}
