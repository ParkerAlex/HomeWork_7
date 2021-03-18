package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import eu.senla.FactoryHead;

public class FactoryHeadTest {
	
	FactoryHead factoryHead = new FactoryHead();
	
	private static final Object ROUND = "�������";
	private static final Object SQUARE = "����������";
	private static final Object CYLINDR = "��������������";
	
	@Test
	void headTest() {
		
		Assertions.assertEquals(ROUND, factoryHead.AddShapeHead(0), "��� ����� ������");
		Assertions.assertEquals(SQUARE, factoryHead.AddShapeHead(1), "��� ����� ������");
		Assertions.assertEquals(CYLINDR, factoryHead.AddShapeHead(2), "��� ����� ������");
		
		
	}

}
