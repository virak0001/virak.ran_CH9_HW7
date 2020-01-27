package abstractClass;

public class Bike extends Thing {
	private int age;
	private boolean isFrontBreakWorking = true;
	private boolean isBackBreakWorking = true;
	@Override
	public boolean isValid() {
		boolean isNotvalid = false;
		if(age < 2) {
			if(isBackBreakWorking | isFrontBreakWorking) {
				
			}
		}
		return isNotvalid;
	}
	Bike(String name, int age, boolean isFrontBreakWorking, boolean isBackBreakWorking){
		super();
		this.age = age;
		this.isFrontBreakWorking = isFrontBreakWorking;
		this.isBackBreakWorking = isBackBreakWorking;
	}
}
