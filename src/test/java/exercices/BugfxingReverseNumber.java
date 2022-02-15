package exercices;

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
