package eu.senla;

public class FactoryHead implements Head{
	

	Object head[]= new Object [3];	

	@Override
	public Object AddShapeHead(int e) {
		if (e == 0) {
			return head[e] =ShapeHead.ROUND.getCode();						
		}else if (e == 1) {
			return head[e] =ShapeHead.SQUARE.getCode();
		}else if (e == 2) {
			return head[e] =ShapeHead.CYLINDR.getCode();
		}
		return e;
	}

	



	
	

}
