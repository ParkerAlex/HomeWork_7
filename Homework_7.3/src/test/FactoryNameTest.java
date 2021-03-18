package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import eu.senla.FactoryName;

public class FactoryNameTest {
	
	private static final Object SASHA = "����";
	private static final Object DASHA = "����";
	private static final Object MASHA = "����";
	private static final Object VOVA = "����";
	private static final Object MAKS = "����";
	private static final Object LENA = "����";
	private static final Object BARS = "����";
	private static final Object JECK = "����";
	private static final Object LORA = "����";
 
	FactoryName factoryName = new FactoryName();
	
	
	@Test
	void nameTest() {

			Assertions.assertEquals(SASHA, factoryName.AddShapeName(0), "��� ������ �����");
			Assertions.assertEquals(DASHA, factoryName.AddShapeName(1), "��� ������ �����");
			Assertions.assertEquals(MASHA, factoryName.AddShapeName(2), "��� ������ �����");
			Assertions.assertEquals(VOVA, factoryName.AddShapeName(3), "��� ������ �����");
			Assertions.assertEquals(MAKS, factoryName.AddShapeName(4), "��� ������ �����");
			Assertions.assertEquals(LENA, factoryName.AddShapeName(5), "��� ������ �����");
			Assertions.assertEquals(BARS, factoryName.AddShapeName(6), "��� ������ �����");
			Assertions.assertEquals(JECK, factoryName.AddShapeName(7), "��� ������ �����");
			Assertions.assertEquals(LORA, factoryName.AddShapeName(8), "��� ������ �����");
     }
	
	
		 
		
		
	}
	
	 


