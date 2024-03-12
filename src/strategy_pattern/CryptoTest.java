package strategy_pattern;

import java.io.IOException;

public class CryptoTest {

	public static void main(String[] args) throws IOException {
		CryptIO cIO = new CryptIO();
		//cIO.setCryptoStrategy(new Caesar_Chiffre(1));
		cIO.setCryptoStrategy(new Number_Character_Strategy());
		//cIO.setCryptoStrategy(new HexStrategy());
		cIO.write("XYZ","C:\\Users\\Raffl Manuel\\OneDrive - HTL Anichstrasse\\HTL\\4AHWII\\SWP\\Java\\Java_Abgaben_4AHWII\\src\\strategy_pattern\\text.txt");
		cIO.read("C:\\Users\\Raffl Manuel\\OneDrive - HTL Anichstrasse\\HTL\\4AHWII\\SWP\\Java\\Java_Abgaben_4AHWII\\src\\strategy_pattern\\text.txt");
		System.out.println(cIO.getText());
		
		
	}

}
