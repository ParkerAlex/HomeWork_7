package eu.senla;

public class FactoryBody implements Body {
	
	Object body[]= new Object [3];	

	public Object AddShapeBody(int e) {
		if (e == 0) {
			return body[e] = ShapeBody.METALLIC.getCode();						
		}else if (e == 1) {
			return body[e] = ShapeBody.WOODEN.getCode();	
		}else if (e == 2) {
			return body[e] = ShapeBody.PLASTIC.getCode();	
		}else
		return e;
	}

}
