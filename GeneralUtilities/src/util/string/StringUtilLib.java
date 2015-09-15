package util.string;
import java.lang.reflect.Method;

/**
 * @author debnath
 *
 */
public class StringUtilLib {

	public StringUtilLib() {
	}

	public String reverse(String input) {
	  //method 1
	  String output =  new StringBuilder(input).reverse().toString();
	  System.out.println("Input is " + input + " and output is " + output);
		return output;
	}
	
}
