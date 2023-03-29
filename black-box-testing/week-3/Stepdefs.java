package skeleton;
import cucumber.api.java.en.When;

public class Stepdefs {
	  @When("^test_posint (\\d+)$")
    public void test_posint(int number) throws Throwable {
        System.out.println("test_posint true for: " + number);
    }
    
    @When("^test_int (-?\\d+)$")
    public void test_int(int arg1) throws Throwable {
        System.out.println("test_int true for: " + arg1);
    }
    @When("^test_float [+-]?([0-9]*[.])?[0-9]+$")
    public void test_float(float arg1) throws Throwable {
        System.out.println("test_int true for: " + arg1);
    }
    @When("^test_ip_address ((?:(?:(?:\\d)|(?:1[0-2]\\d)|(?:[1-9]\\d))\\.){3}(?:(?:\\d)|(?:[1-9]\\d)|(?:1[0-2]\\d)))$")
    public void test_ip_address(String arg1) throws Throwable {
        System.out.println("test_ip_address true for: " + arg1);
    }

    @When("^test_splitter (?:\\bspill|Sponge|tap|rebuild\\b)((?!si|egregious|Foul|Test|top|ta|\\w).)*$")
    public void test_splitter(String match) throws Throwable {
        System.out.println("test_splitter2 true for: " + match);
    }
    @When("^test_splitter2 (?:\\bspill|Sponge|tap|rebuild\\b)((?!spall|egregious|foul|test|top|tapper|\\w).)*$")
    public void test_splitter2(String match) throws Throwable {
        System.out.println("test_splitter2 true for: " + match);
    }
}
