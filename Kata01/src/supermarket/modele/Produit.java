package supermarket.modele;

public class Produit {
	int id;
	Prix prix;
	double quantite;
	
	public Produit(int id, Prix prix, double quantite) {
		super();
		this.id = id;
		this.prix = prix;
		this.quantite = quantite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Prix getPrix() {
		return prix;
	}

	public void setPrix(Prix prix) {
		this.prix = prix;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	
	
}
