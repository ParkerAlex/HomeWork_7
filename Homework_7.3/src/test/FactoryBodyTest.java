package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import eu.senla.FactoryBody;

public class FactoryBodyTest {
	
	FactoryBody factoryBody = new FactoryBody();
	
	private static final Object METALLIC = "лерюккхвеяйне";
	private static final Object WOODEN = "депебъммне";
	private static final Object PLASTIC = "окюярлюяянбне";
	
	
	@Test
	void bodyTest() {
		
		Assertions.assertEquals(METALLIC, factoryBody.AddShapeBody(0), "мер рюйнцн рскнбхью");
		Assertions.assertEquals(WOODEN, factoryBody.AddShapeBody(1), "мер рюйнцн рскнбхыю");
		Assertions.assertEquals(PLASTIC, factoryBody.AddShapeBody(2), "мер рюйнцн рскнбхыю");
		
	}

}
