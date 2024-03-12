package strategy_pattern;

public class HexStrategy implements CryptoStrategy {

	@Override
	public String encrypt(String s) {
		String verschluesselt = "";
		char[] buffer = s.toCharArray();
		for (char c : buffer) {
			verschluesselt += Integer.toHexString(c) + " ";
		}
		return verschluesselt;

	}

	@Override
	public String decrypt(String s) {
		String entschluesselt = "";
		String [] buffer = s.split(" ");
        for (String c : buffer) {
			entschluesselt += (char)Integer.parseInt(c, 16);
		}
		return entschluesselt;
	}

}
