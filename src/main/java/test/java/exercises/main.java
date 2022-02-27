package test.java.exercises;

public class main {
  public static void main(String[] args) {

    BugfixingReverseNumberTest reverseTest = new BugfixingReverseNumberTest();

    reverseTest.bugfixingReverseNumber(0);

    reverseTest.bugfixingReverseNumber(1);

    reverseTest.bugfixingReverseNumber(100);

    reverseTest.bugfixingReverseNumber(1258);

    reverseTest.bugfixingReverseNumber(1234567);

    reverseTest.bugfixingReverseNumber(-1238);

    // LOGIN PAGE TEST
    System.setProperty(
        "webdriver.chrome.driver",
        "C:\\Users\\Hernan\\Documents\\technicalTestElectronicId\\qa-technical-test\\chromedriver\\chromedriver.exe");

    QAJavaLoginPage loginTest = new QAJavaLoginPage();

    loginTest.successFullLogin();
    loginTest.failedFullLogin();
  }
}
