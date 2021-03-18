package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import eu.senla.FactoryName;

public class FactoryNameTest {
	
	private static final Object SASHA = "—¿ÿ¿";
	private static final Object DASHA = "ƒ¿ÿ¿";
	private static final Object MASHA = "Ã¿ÿ¿";
	private static final Object VOVA = "¬Œ¬¿";
	private static final Object MAKS = "Ã¿ —";
	private static final Object LENA = "À≈Õ¿";
	private static final Object BARS = "¡¿–—";
	private static final Object JECK = "ƒ∆≈ ";
	private static final Object LORA = "ÀŒ–¿";
 
	FactoryName factoryName = new FactoryName();
	
	
	@Test
	void nameTest() {

			Assertions.assertEquals(SASHA, factoryName.AddShapeName(0), "Õ≈“ “¿ Œ√Œ »Ã≈Õ»");
			Assertions.assertEquals(DASHA, factoryName.AddShapeName(1), "Õ≈“ “¿ Œ√Œ »Ã≈Õ»");
			Assertions.assertEquals(MASHA, factoryName.AddShapeName(2), "Õ≈“ “¿ Œ√Œ »Ã≈Õ»");
			Assertions.assertEquals(VOVA, factoryName.AddShapeName(3), "Õ≈“ “¿ Œ√Œ »Ã≈Õ»");
			Assertions.assertEquals(MAKS, factoryName.AddShapeName(4), "Õ≈“ “¿ Œ√Œ »Ã≈Õ»");
			Assertions.assertEquals(LENA, factoryName.AddShapeName(5), "Õ≈“ “¿ Œ√Œ »Ã≈Õ»");
			Assertions.assertEquals(BARS, factoryName.AddShapeName(6), "Õ≈“ “¿ Œ√Œ »Ã≈Õ»");
			Assertions.assertEquals(JECK, factoryName.AddShapeName(7), "Õ≈“ “¿ Œ√Œ »Ã≈Õ»");
			Assertions.assertEquals(LORA, factoryName.AddShapeName(8), "Õ≈“ “¿ Œ√Œ »Ã≈Õ»");
     }
	
	
		 
		
		
	}
	
	 


