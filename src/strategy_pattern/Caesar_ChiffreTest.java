package strategy_pattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Caesar_ChiffreTest {

	@Test
	void testEncrypt() {
		Caesar_Chiffre strat = new Caesar_Chiffre(1);
		String str = "asdfghjklqweresxdcvrtuiopjodfigz";
		String verschluesselt = strat.encrypt(str);
		assertEquals(str, strat.decrypt(verschluesselt));
	}

}
