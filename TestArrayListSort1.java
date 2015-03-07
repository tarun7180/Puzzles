import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestArrayListSort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> stuff = new ArrayList<String>();
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		System.out.println(stuff);
		Collections.sort(stuff);
		System.out.println(stuff);
		

	}

}
