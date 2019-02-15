public class DispoKonto extends Konto {
	private int kredit = 0;
	
	public int getKredit() {
		return this.kredit;
	}

	public void setKredit(int kredit) {
		if(kredit >= 0) {
			this.kredit = kredit;
		}
		else {
			System.out.printf("Kredit muss positiv sein.");
			System.exit(-1);
		}
	}

	public DispoKonto(int konto) {
		super(konto);	
		this.kredit = 10000;
	}

	public void auszahlen(double betrag) {
			double betrag1 =  betrag * 100;
			int wert = (int) betrag1;
			if(Math.abs(this.kontostand - wert) <= this.kredit) {
				this.kontostand -= wert;		
			}
			else {
				System.out.printf("Betrag überschreitet das Dispo.\n");
				
			}		
	}
}
