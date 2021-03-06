package domain.model;

public class Dier {
	private String naam;
	private DierSoort soort;
	private int voedsel;

	public Dier(String naam) {
		this.setNaam(naam);
	}

	public Dier(String naam, DierSoort soort, int voedsel) {
		this.setNaam(naam);
		this.setSoort(soort);
		this.setVoedsel(voedsel);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		if (isValidName(naam)) {
			throw new IllegalArgumentException("Geen geldige naam");
		}
		this.naam = naam;
	}

	public static boolean isValidName(String naam) {
		return naam == null || naam.isEmpty();
	}

	public DierSoort getSoort() {
		return soort;
	}

	public void setSoort(DierSoort soort) {
		if (isValidSoort(soort)) {
			throw new IllegalArgumentException("Geen geldige soort");
		}
		this.soort = soort;
	}

	public static boolean isValidSoort(DierSoort soort) {
		return soort == null;
	}

	public int getVoedsel() {
		return voedsel;
	}

	public void setVoedsel(int voedsel) {
		if (isValidVoedsel(voedsel)) {
			throw new IllegalArgumentException("Geen geldige hoeveelheid voor voedsel");
		}
		this.voedsel = voedsel;
	}

	public static boolean isValidVoedsel(int voedsel) {
		return voedsel < 0;
	}


}
