package util.string;
import java.lang.reflect.Method;

/**
 * @author debnath
 *
 */
public class StringUtilCLI {

	protected StringUtilLib stringLib;
	
	public StringUtilCLI() 
	{
		this.stringLib = new StringUtilLib();
	}

	/**
	 * Get a list of all helper functions available through Reflection
	 * Do so in a human friendly way, e.g. show "getMethods" instead of util.string.StringUtilLib.getMethods()
	 * 
	 * @return String of all available methods in a print friendly format
	 */
	public String getAvailableFunctions() {
		Method[] methods = this.stringLib.getMethods();
		String available = "";
		for (Method m : methods) {
			String method = m.toString();
			int beginIndex = method.lastIndexOf('.') + 1; //skip including .
			int endIndex = method.length() - 2; //skip parentheses () in function name
			String shortMethod = method.substring(beginIndex, endIndex);						
			available = available + "\n " + shortMethod;
		}
		return available; 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		StringUtilCLI cli = new StringUtilCLI();
		if (args.length == 1) {  //TODO check for --help
			System.out.println("Usage: java StringUtil -f <function> -s <string>. " +
					cli.getAvailableFunctions());
		} else if (args.length < 4) {
			System.out.println("Invalid arguments. Correct usage is java StringUtil -f <function> -s <string>. " +
					"\n Use --help for further information.");
			System.exit(0);
		}
		
	}

	
	
}
