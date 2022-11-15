package personnages;

public class Yakuza extends Humain{
	
	private int reputation=0;
	private String nomDeClan;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String nomDeClan) {
		super(nom, boissonFavorite, argent);
		this.nomDeClan = nomDeClan;
		
	}
	
	public String getNomDeClan() {
		return nomDeClan;
	}
	
	public void gagnerReputation(int reput) {
		this.reputation= reputation+reput;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + " , si tu tiens à la vie donne moi ta bourse !");
		int pognon = victime.seFaireExtorquer();
		parler("j'ai piqué " + pognon + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !" );
		this.gagnerReputation(1);
	}
}
