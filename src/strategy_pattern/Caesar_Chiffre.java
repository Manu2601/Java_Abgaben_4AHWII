package strategy_pattern;

public class Caesar_Chiffre implements CryptoStrategy {
private int verschiebung;
	public Caesar_Chiffre(int verschiebung) {
		this.verschiebung=verschiebung;
	}

	@Override
	 public String encrypt(String s) {
        String verschluesselt = "";
        char [] buffer = s.toCharArray();
        for (char c : buffer) {
			verschluesselt += (char)(c+verschiebung);
		}
		return verschluesselt;
    }

	@Override
	public String decrypt(String s) {
		String entschluesselt = "";
		char [] buffer = s.toCharArray();
        for (char c : buffer) {
			entschluesselt += (char)(c-verschiebung);
		}
		return entschluesselt;
	}

}
