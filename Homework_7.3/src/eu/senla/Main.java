package eu.senla;

public class Main {
	public static void main(String[] args) {	
		
		FactoryHead head = new FactoryHead();
		FactoryBody body = new FactoryBody();
		FactoryName name = new FactoryName();
		
		
		for (int i=0; i<9; i++ ) {
			//Robot robot = new Robot( "SUNNY_" + i,head.AddShapeHead((int)(Math.random()*3)), body.AddShapeBody((int)(Math.random()*3)));
			Robot robot = new Robot(name.AddShapeName((int)(Math.random()*9)) ,head.AddShapeHead((int)(Math.random()*3)), body.AddShapeBody((int)(Math.random()*3)));
			System.out.println(robot);
		}
		
	}

}
