package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import eu.senla.FactoryHead;

public class FactoryHeadTest {
	
	FactoryHead factoryHead = new FactoryHead();
	
	private static final Object ROUND = "ÊĞÓÃËÀß";
	private static final Object SQUARE = "ÊÂÀÄĞÀÒÍÀß";
	private static final Object CYLINDR = "ÖÈËÈÍÄĞÈ×ÅÑÊÀß";
	
	@Test
	void headTest() {
		
		Assertions.assertEquals(ROUND, factoryHead.AddShapeHead(0), "ÍÅÒ ÒÀÊÎÉ ÃÎËÎÂÛ");
		Assertions.assertEquals(SQUARE, factoryHead.AddShapeHead(1), "ÍÅÒ ÒÀÊÎÉ ÃÎËÎÂÛ");
		Assertions.assertEquals(CYLINDR, factoryHead.AddShapeHead(2), "ÍÅÒ ÒÀÊÎÉ ÃÎËÎÂÛ");
		
		
	}

}
