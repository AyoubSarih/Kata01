package supermarket.test;

import supermarket.modele.Prix;
import supermarket.modele.Produit;
import supermarket.modele.Unite;

public class test {

	public static void main(String[] args) {
		Produit p1=new Produit(1,new Prix(2.0, Unite.Kg), 102.0);
		Produit p2=new Produit(2,new Prix(5.0, Unite.Litre,2), 200.0);
		Produit p3=new Produit(3,new Prix(9.99, Unite.Unite,1,2,1), 500.78);
		Produit p4=new Produit(4,new Prix(12.25, Unite.Unite,2,3,1), 100.0);
		
		System.out.println(p1.getPrix().getPrixAchat(5));
		System.out.println(p2.getPrix().getPrixAchat(5));
		System.out.println(p3.getPrix().getPrixAchat(5));
		System.out.println(p4.getPrix().getPrixAchat(5));
	
	}

}
