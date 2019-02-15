public class KontoTest {
	public static void main(String[] args) {
		// Konto
		Konto k = new Konto(0);
		System.out.printf("Konto eröffnet\n");
		System.out.printf("Aktueller Kontostand\n");
		System.out.printf("Zahle 100,03 Euro ein\n");
		k.einzahlen(100.03);
		System.out.println(k);
		System.out.printf("Hebe 30,09 Euro ab.\n");
		k.auszahlen(30.09);
		System.out.println(k);
		System.out.printf("Hebe 99,99 Euro ab.\n");
		k.auszahlen(99.99);
		System.out.println(k);
		System.out.printf("Zahle 50,68 Euro ein\n");
		k.einzahlen(50.68);
		System.out.println(k);
		// Dispokonto
		DispoKonto d = new DispoKonto(0);
		System.out.printf("\nDispoKonto mit Dispo (100,00 Euro) eroeffnet\n");
		System.out.printf("Dispokredit: %d%n", d.getKredit());
		System.out.println(d);
		System.out.printf("Zahle 100,03 Euro ein\n");
		d.einzahlen(100.03);
		System.out.println(d);
		System.out.printf("Hebe 130,09 Euro ab.\n");
		d.auszahlen(130.09);
		System.out.println(d);
		System.out.printf("Hebe 99,99 Euro ab.\n");
		d.auszahlen(99.99);
		System.out.println(d);
		System.out.println("Setze Dispo auf 200,00\n");
		d.setKredit(20000); // Dispo auf 20000
		System.out.printf("Dispokredit: %d%n", d.getKredit());
		System.out.printf("Hebe 99,99 Euro ab.\n");
		d.auszahlen(99.99);
		System.out.println(d);
		System.out.printf("Zahle 50,68 Euro ein\n");
		d.einzahlen(50.68);
		System.out.println(d);
		// Jugendkonto
		System.out.printf("\nJugendKonto eroeffnet\n");
		Jugendkonto j = new Jugendkonto(0, 15);
		System.out.printf("Alter des Kontoinhabers: %d%n", j.getAlter());
		j.setLimit(5000);
		System.out.printf("Aktuelles Limit: %d%n", j.getLimit());
		System.out.printf("Aktueller Kontostand: %d%n", j.getKontostand());
		System.out.printf("Kontoinhaber hat Geburtstag\n");
		j.geburtstag();
		System.out.printf("Alter des Kontoinhabers: %d%n", j.getAlter());
		System.out.printf("Zahle 1200,03 Euro ein.\n");
		j.einzahlen(1200.03);
		System.out.println(j);
		System.out.printf("Hebe 130,09 Euro ab.\n");
		j.auszahlen(130.09);
		System.out.println(j);	
		System.out.printf("Aendere Limit auf 500,00 Euro");
		j.setLimit(50000);
		System.out.printf("Aktuelles Limit: %d%n", j.getLimit());
		System.out.printf("Hebe 500,00 Euro ab.\n");
		j.auszahlen(500.00);
		System.out.println(j);	
		// Zinskonto
		System.out.printf("\nZinsKonto eroeffnet\n");
		ZinsKonto z = new ZinsKonto(0, 1.0);
		System.out.printf("Aktueller Zinssatz: %.2f%n: ", z.getZinssatz());
		System.out.println(z);
		System.out.printf("Zahle 100,00 Euro ein.\n");	
		z.einzahlen(100.00);
		System.out.println(z);
		System.out.printf("Verzinsen\n");
		z.verzinsen();
		System.out.println(z);
		System.out.printf("Hebe 20,99 Euro ab.\n");
		z.auszahlen(20.99);
		System.out.println(z);
		System.out.printf("Aendere Zinssatz auf 3,5\n");
		z.setZinssatz(3.5);
		System.out.printf("Aktueller Zinssatz: %.2f%n ", z.getZinssatz());
		System.out.printf("Verzinsen\n");
		z.verzinsen();	
		System.out.println(z);
	}
}
