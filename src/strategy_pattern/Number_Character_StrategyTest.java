package strategy_pattern;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class Number_Character_StrategyTest {

	@Test
	void testEncrypt() throws FileNotFoundException {
		Number_Character_Strategy strat = new Number_Character_Strategy();
		String str = "ABCDABCDABCDABCAaaaaaehijophghcx".toUpperCase();
		String verschluesselt = strat.encrypt(str);
		assertEquals(str, strat.decrypt(verschluesselt));
	}

}
