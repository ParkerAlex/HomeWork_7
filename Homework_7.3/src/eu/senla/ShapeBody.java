package eu.senla;

public enum ShapeBody {
	METALLIC("�������������"),
	WOODEN("����������"),
	PLASTIC("�������������");

	
	private String code;

	
	ShapeBody(String code) {
		 this.code = code;
	}
	
	 
	 
	    public String getCode(){ return code;}


	 

}
