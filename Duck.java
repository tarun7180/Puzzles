
public class Duck implements Comparable{

	String name;
	int weight;
	
	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}

	public int compareTo(Object o) {
		Duck otherDuck = (Duck) o;
		if(this.weight<otherDuck.weight){
			return -1;
		}else if(this.weight == otherDuck.weight){
			return 0;
		}else {
			return 1;
		}
	}

	
}
