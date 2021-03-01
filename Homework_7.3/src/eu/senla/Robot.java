package eu.senla;

public class Robot extends FactoryHead{
	
	private String name;
	private Object head;
	private Object body;
	

	public Robot(String name, Object head, Object body) {
		super();
		this.name = name;
		this.head = head;
		this.body= body;
	}


	@Override
	public String toString() {
		return "Robot [хЛЪ = " + name + ", цнкнбю = " + head + ", рекн = " + body + "]";
	}


	

	

}
