package abstractClass;

public class Bike extends Thing {
	
	private int age;
	private boolean isFrontBreakWorking = true;
	private boolean isBackBreakWorking = true;
	@Override
	public boolean isValid() {
		boolean result = false;
		if(age < 2) {
			if(isBackBreakWorking | isFrontBreakWorking) {
				result = true;
			}
		}
		return result;
	}
	
	Bike(String name, int age, boolean isFrontBreakWorking, boolean isBackBreakWorking) {
		super(name);
		this.age = age;
		this.isFrontBreakWorking = isFrontBreakWorking;
		this.isBackBreakWorking = isBackBreakWorking;
	}
	
}
