public class ZinsKonto extends Konto {
	private double zinssatz;

	public double getZinssatz() {
		return this.zinssatz;	
	}

	public void setZinssatz(double zinssatz) {
		if(zinssatz >= 0.0) {
			this.zinssatz = zinssatz;
		}
		else {
			System.out.printf("Zinsen dürfen nicht negativ sein.");
			System.exit(-1);	
		}		
	}

	public ZinsKonto(int konto, double zinssatz) {
		super(konto);
		setZinssatz(zinssatz);
	}

	public void verzinsen() {
		this.kontostand += (this.kontostand * (this.zinssatz / 100));	
	}
}

