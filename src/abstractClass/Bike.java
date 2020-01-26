package abstractClass;

public class Bike extends Thing {
	private int age;
	private boolean isFrontBreakWorking = true;
	private boolean isBackBreakWorking = true;
	@Override
	public void isValid() {
		if(age < 2) {
			if(isBackBreakWorking | isFrontBreakWorking) {
				
			}
		}
	}
	Bike(String name, int age, boolean isFrontBreakWorking, boolean isBackBreakWorking){
		super();
		this.age = age;
		this.isFrontBreakWorking = isFrontBreakWorking;
		this.isBackBreakWorking = isBackBreakWorking;
	}
}
