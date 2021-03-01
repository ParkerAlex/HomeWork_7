package eu.senla;

public enum ShapeHead {
	
	ROUND ("ÊĞÓÃËÀß"),
	SQUARE("ÊÂÀÄĞÀÒÍÀß"),
	CYLINDR("ÖÈËÈÍÄĞÈ×ÅÑÊÀß");

	 private String code;
	
	ShapeHead(String code) {
		this.code = code;
	}

	 public String getCode(){
		 return code;
		 }
	 
}
