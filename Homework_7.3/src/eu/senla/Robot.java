package eu.senla;

public class Robot extends FactoryHead{
	
	private Object name;
	private Object head;
	private Object body;
	

	public Robot(Object name, Object head, Object body) {
		super();
		this.name = name;
		this.head = head;
		this.body= body;
	}


	@Override
	public String toString() {
		return "Robot: Имя " + name + ", Голова " + head + ", Туловище " + body;
	}


	

	

}
