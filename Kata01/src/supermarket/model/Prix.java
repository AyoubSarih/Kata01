package supermarket.model;


public class Prix {
	
	double montant;
	Unite u;//Kg,litre ou autre 
	int nombre=1;//Le multiplicateur, par example 1 euro pour 3 pommes
	int pour=0;
	int obtener=0;//pour simuler l'offre "pour 2 packets obtener un 3éme gratuit"
	
	public Prix(double pMontant,Unite pu){
		montant=pMontant;
		u=pu;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
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

	public int getPour() {
		return pour;
	}

	public int getObtener() {
		return obtener;
	}

	public Prix(double montant, Unite u, int nombre, int pour, int obtener) {
		super();
		this.montant = montant;
		this.u = u;
		this.nombre = nombre;
		this.pour = pour;
		this.obtener = obtener;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public void setPour(int pour) {
		this.pour = pour;
	}

	public void setObtener(int obtener) {
		this.obtener = obtener;
	}
	
	public double getPrixAchat(double quantite){
		if(nombre==1 && pour==0 && obtener==0)
		return montant*quantite;
		
		else if(nombre >1 && pour==0 && obtener==0){
			return (quantite/nombre)*montant;
		}
		
		else if(nombre==1 && pour>=1 && obtener>=1){
			int partieEntiereQuantite=(int) (quantite);
			int i= (int)(quantite/(pour+obtener));
			int r= partieEntiereQuantite% (pour+obtener) ;
			return (i*pour*montant) + (r*montant);
		}
		
		else if(nombre>=1 && pour>=1 && obtener>=1){
			int partieEntiereQuantite=(int) (quantite);
			int i= (int)(quantite/(pour+obtener));
			int r= partieEntiereQuantite% (pour+obtener);
			double prixUnitaire=(montant/nombre);
			return (i*pour*prixUnitaire) + (r*prixUnitaire);
		}
		
		else{
			return -1;//Au cas où les paramètre sont erronés
		}
			
	}
}
