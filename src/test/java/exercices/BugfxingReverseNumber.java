package exercices;

/*
You can find a Java class (Solution) with a method which receives a number (integer) and prints the reverse number. 
This class does not work, it contains errors, and it is not printing the right reverse number.

  Goal: fix the class to print the right reverse number.
  Please, include the values used to validate that it is working.
*/

class BugfxingReverseNumberTest {

    @Test
    void bugfxingReverseNumber(int N) {
        int value = N;
        int valueReverse = reverse(N);
        System.out.println("Value to analyse: "+ value + "and reverse value: " + valueReverse);
    }

    public void reverse(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            else if (enable_print == 1) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }
}
