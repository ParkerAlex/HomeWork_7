package eu.senla;

public enum ShapeName {

	SASHA ("����"),
	DASHA ("����"),
	MASHA("����"),
	MAKS ("����"),
	VOVA ("����"),
	LENA ("����"),
	BARS ("����"),
	JECK ("����"),
	LORA ("����");
	
	public String getCode() {
		return code;
	}

	private String code;
	
	 private ShapeName(String code) {
		this.code = code;
	}

	
	
}
