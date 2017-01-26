package supermarket.model;


public class Produit {
	int id;
	Prix prix;
	Double quantite;
	
	public Produit(int id, Prix prix, Double quantite) {
		super();
		this.id = id;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	public void acheter(Double quantite){
		if(this.quantite>=quantite){
			this.quantite-=quantite;
		}
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

	public Double getQuantite() {
		return quantite;
	}

	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}
}
