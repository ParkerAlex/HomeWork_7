package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import eu.senla.FactoryBody;

public class FactoryBodyTest {
	
	FactoryBody factoryBody = new FactoryBody();
	
	private static final Object METALLIC = "�������������";
	private static final Object WOODEN = "����������";
	private static final Object PLASTIC = "�������������";
	
	
	@Test
	void bodyTest() {
		
		Assertions.assertEquals(METALLIC, factoryBody.AddShapeBody(0), "��� ������ ��������");
		Assertions.assertEquals(WOODEN, factoryBody.AddShapeBody(1), "��� ������ ��������");
		Assertions.assertEquals(PLASTIC, factoryBody.AddShapeBody(2), "��� ������ ��������");
		
	}

}
