package eu.senla;

public enum ShapeName {

	SASHA ("яюью"),
	DASHA ("дюью"),
	MASHA("люью"),
	MAKS ("люйя"),
	VOVA ("бнбю"),
	LENA ("кемю"),
	BARS ("аюпя"),
	JECK ("дфей"),
	LORA ("кнпю");
	
	public String getCode() {
		return code;
	}

	private String code;
	
	 private ShapeName(String code) {
		this.code = code;
	}

	
	
}
