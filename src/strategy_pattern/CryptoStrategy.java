package strategy_pattern;

import java.io.FileNotFoundException;

public interface CryptoStrategy {
	String encrypt (String s) throws FileNotFoundException;
	String decrypt (String s);
}
