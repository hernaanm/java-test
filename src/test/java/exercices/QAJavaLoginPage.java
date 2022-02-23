package exercices;

/*
Please, imaging that we have a login page with two input fields (username and password) and submit button.

  -Username and password fields are present
  -Button is present
  -If user is logged a message box is shown “Welcome to eID”
  -If credentials are not valid, a message box is shown “You shall not pass!”

  Goal 1: identify some tests to validate this login workflow
  Goal 2: write some test in the test class below ensuring following topics:
*/

class Solution extends WebDriverTestCase {

    /*
      !!! Do not create your own WebDriver!!! Directly use the object webDriver

      You can copy credentials from here:
      - valid@username.com    password
      - unknown@username.com  password
    */

    String url = "https://exercise.com/login.html";

    @Test
    public void defineYourTests() {
        //write some code
    }
}
