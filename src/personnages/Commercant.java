package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "ricard", argent);
	}
	
	public int seFaireExtorquer() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		this.parler("oh zut, c'est vraiment dommage");
		return argent;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		System.out.println(argent + " sous !! c'est bien aimable à vous!!");
	}
}
