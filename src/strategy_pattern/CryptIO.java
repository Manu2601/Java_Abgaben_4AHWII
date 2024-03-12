package strategy_pattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CryptIO {
	private String text = "";
	private CryptoStrategy cstrat;
	
	public void write(String eingabe, String fPath) throws IOException {
		eingabe = cstrat.encrypt(eingabe);
		FileWriter fw = new FileWriter(new File(fPath));
		fw.write(eingabe);
		fw.close();
	}
	
	public void read(String fPath) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(fPath));
		while(scanner.hasNext()) {
			text += scanner.nextLine();
		}
		scanner.close();
		text = cstrat.decrypt(text);
	}
	
	public String getText() {
		return text;
	}
	
	public void setCryptoStrategy(CryptoStrategy strat) {
		this.cstrat = strat;
	}
}
