

public class MyImpl implements Animal {

	private static int count;
	
	@Override
	public void eat() {		
		Lion lion = new Lion();
		lion.eat();
	}
		
	public int countEat() {
		eat();
		count++;
		return count;
	}
	
	
}