package test.java.exercises;

/*
You can find a Java class (Solution) with a method which receives a number (integer) and prints the reverse number.
This class does not work, it contains errors, and it is not printing the right reverse number.

  Goal: fix the class to print the right reverse number.
  Please, include the values used to validate that it is working.
*/

class BugfixingReverseNumberTest {

  // @Test
  void bugfixingReverseNumber(int N) {
    int value = N;
    String valueReverse = reverse(N);
    System.out.println("Value to analyse: " + value + " and reverse value: " + valueReverse);
  }

  public String reverse(int N) {
    int enable_print;
    String reversedNumber = new String();

    if (N < 0) { // fix to contemplate negative numbers
      N *= -1;
    }

    while (N > 0) {
      enable_print = N % 10;
      if (enable_print == 0 && N % 10 != 0) {
        enable_print = 1;
      } else {
        reversedNumber = reversedNumber + (N % 10);
      }
      N = N / 10;
    }
    return reversedNumber;
  }
}
