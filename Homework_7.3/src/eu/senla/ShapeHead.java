package eu.senla;

public enum ShapeHead {
	
	ROUND ("�������"),
	SQUARE("����������"),
	CYLINDR("��������������");

	 private String code;
	
	ShapeHead(String code) {
		this.code = code;
	}

	 public String getCode(){
		 return code;
		 }
	 
}
