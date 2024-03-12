package strategy_pattern;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class HexStrategyTest {

	@Test
	void testEncrypt() {
			HexStrategy strat = new HexStrategy();
			String str = "as23w4rtfzdfghjklqweresxdcvrtuiopjodfigz";
			String verschluesselt = strat.encrypt(str);
			assertEquals(str, strat.decrypt(verschluesselt));
	}

}
