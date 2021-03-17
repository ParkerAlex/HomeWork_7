package eu.senla;

public class FactoryName implements Name {

	Object name[]= new Object [9];	

	public Object AddShapeName(int e) {
		if (e == 0) {
			return name[e] = ShapeName.SASHA.getCode();						
		}else if (e == 1) {
			return name[e] = ShapeName.DASHA.getCode();	
		}else if (e == 2) {
			return name[e] = ShapeName.MASHA.getCode();	
		}else if (e == 3) {
			return name[e] = ShapeName.VOVA.getCode();	
		}else if (e == 4) {
			return name[e] = ShapeName.MAKS.getCode();	
		}else if (e == 5) {
			return name[e] = ShapeName.LENA.getCode();	
		}else if (e == 6) {
			return name[e] = ShapeName.BARS.getCode();	
		}else if (e == 7) {
			return name[e] = ShapeName.JECK.getCode();	
		}else if (e == 8) {
			return name[e] = ShapeName.LORA.getCode();	
		}
		return e;
	}
	
}
