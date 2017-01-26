package supermarket.modele;

public class Prix {
	
	Double montant;
	Unite u;
	int nombre=1;//Multiplicateur, par exemple 1 euro pour 3 pommes
	double pour=0;
	double obtenir=0;
	
	public Prix(Double montant, Unite u, int nombre, double pour, double obtenir) {
		super();
		this.montant = montant;
		this.u = u;
		this.nombre = nombre;
		this.pour = pour;
		this.obtenir = obtenir;
	}
	
	public Prix(Double montant, Unite u, int nombre) {
		super();
		this.montant = montant;
		this.u = u;
		this.nombre = nombre;
	}
	
	public Prix(Double montant, Unite u) {
		super();
		this.montant = montant;
		this.u = u;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Unite getU() {
		return u;
	}

	public void setU(Unite u) {
		this.u = u;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public double getPour() {
		return pour;
	}

	public void setPour(double pour) {
		this.pour = pour;
	}

	public double getObtenir() {
		return obtenir;
	}

	public void setObtenir(double obtenir) {
		this.obtenir = obtenir;
	}
	
	public double getPrixAchat(double quantite){
		if(nombre==1 && pour==0 && obtenir==0){
			return montant*quantite;
		}
		else if(nombre>1 && pour==0 && obtenir==0){
			return (quantite/nombre)*montant;
		}
		
		else if(nombre==1 && pour>=1 && obtenir>=1){
			int i=(int) (quantite/(pour+obtenir));
			int quantitPartieEntiere=(int)(quantite);
			int r= (int) (quantitPartieEntiere % (pour+obtenir));
			return (i*pour*montant+r*montant);
		}
		else if(nombre>1 && pour>=1 && obtenir>=1){
			int i=(int) (quantite/(pour+obtenir));
			int quantitPartieEntiere=(int)(quantite);
			int r= (int) (quantitPartieEntiere % (pour+obtenir));
			double prixUnitaire=montant/nombre;
			return (i*pour*prixUnitaire+r*prixUnitaire);
		}
		
		else{
			return -1;//dans le cas de données incohérentes
		}
		
			
	}
	
	
}
