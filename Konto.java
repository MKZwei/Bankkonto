public class Konto {
	protected int kontostand;

	public int getKontostand() {
		return this.kontostand;
	}

	public void setKontostand(int kontostand) {
		this.kontostand = kontostand;
	}

	public Konto(int kontostand) {
		setKontostand(kontostand);
	}

	public void einzahlen(double betrag) {
		double betrag1 =  betrag * 100;
		int wert = (int) betrag1;
		if(wert >= 0) {
			this.kontostand += wert;
		} 
		else {
			System.out.println("Betrag darf nicht negativ sein.\n");
			System.exit(-1);	
		}
	}

	public void auszahlen(double betrag) {
		double betrag1 =  betrag * 100;
		int wert = (int) betrag1;
		
		if(wert >= 0 && this.kontostand >= 0) {
			if(this.kontostand >= wert) {
				this.kontostand -= wert;		
			}
			else {
				System.out.printf("Auszahlung micht möglich.\nBetrag ist höher als Kontostand.\n");
				//System.exit(-1);
			}		
		}
		else {
			System.out.printf("Betrag oder Kontostand ist negativ.");
			System.exit(-1);
		}	
	}

	public String toString() {
		return " \nAktueller Kontostand: " + this.kontostand + " Cent\n";	
	}
}
