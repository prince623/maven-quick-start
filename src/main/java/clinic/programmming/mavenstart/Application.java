package clinic.programmming.mavenstart;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;


public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
	public int countWords(String words){
		String[] separateWords= StringUtils.split(words,' ');
		return (separateWords==null) ? 0 : separateWords.length;
	}
	public void greet()
	{
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		
		for (String greeting: greetings){
			System.out.println("Greeting: " + greeting);
		}
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
		System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int appCount = app.countWords("I have complete Maven");
		System.out.println("count is " + appCount);
    }
}