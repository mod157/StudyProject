package cafe;

public abstract class StrategyCoffee {
	
	protected Sugar sugar;
	
	//�����ڴ� �ظ��ϸ� ���������ϱ� �־���
	public StrategyCoffee() { }
	
	public void putsugar() {
		sugar.sugar();
	}
	//public void info() {}
	//public void price() {}
}
