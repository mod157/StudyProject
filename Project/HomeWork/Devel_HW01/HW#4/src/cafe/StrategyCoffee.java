package cafe;

public abstract class StrategyCoffee {
	
	protected Sugar sugar;
	
	//생성자는 왠만하면 넣으랫으니까 넣었따
	public StrategyCoffee() { }
	
	public void putsugar() {
		sugar.sugar();
	}
	//public void info() {}
	//public void price() {}
}
