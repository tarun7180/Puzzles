import java.util.Arrays;


public class DuckSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck[] ducks = {
						new Duck("Daffy1", 8),
						new Duck("Daffy2", 2),
						new Duck("Daffy3", 7),
						new Duck("Daffy4", 2),
						new Duck("Daffy5", 10),
						new Duck("Daffy", 2)
		};
		
		System.out.println("Before sorting");
		display(ducks);
		Arrays.sort(ducks);
		System.out.println("After sorting");
		display(ducks);
	}

	public static void display(Duck[] duck){
		for(int i=0;i<duck.length;i++){
			System.out.println(duck[i]);
		}
	}
}
