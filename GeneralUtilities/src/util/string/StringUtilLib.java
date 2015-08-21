package util.string;
import java.lang.reflect.Method;

/**
 * @author debnath
 *
 */
public class StringUtilLib {

	public StringUtilLib() 
	{
	}
	
	public Method[] getMethods() {
		Method[] methods = this.getClass().getDeclaredMethods();
		return methods;
	}
	
}
