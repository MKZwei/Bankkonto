public class Jugendkonto extends Konto {
	private int alter;
	private int limit;

	public int getAlter() {
		return this.alter;	
	}

	public int getLimit() {
		return this.limit;	
	}

	public void setLimit(int limit) {
		if(limit >= 0) {
			this.limit = limit;			
		}
		else {
			System.out.printf("Limit muss positiv sein.");
			System.exit(-1);		
		}	
	}

	public void setAlter(int alter) {
		if(alter >= 0 && alter <= 18) {
			this.alter = alter;
		}
		else {
			System.out.printf("Das Alter ist entweder negativ oder älter als 18.\n");
			System.exit(-1);	
		}	
	}

	public Jugendkonto(int konto, int alter) {
		super(konto);	
		setAlter(alter);
		this.limit = 50;
	}

	public void geburtstag() {
		int neu = this.alter + 1;
		setAlter(neu);
	}
	
	public void auszahlen(double betrag) {
			double betrag1 =  betrag * 100;
			int wert = (int) betrag1;
			if(wert > this.limit) {
				System.out.printf("Der Betrag überschreitet das Limit.\n");
				//System.exit(-1);					
			}
			else {
				this.kontostand -= wert;		
			}
	}

	

}
