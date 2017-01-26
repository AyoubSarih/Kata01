package supermarket.test.main;

import supermarket.model.Prix;
import supermarket.model.Produit;
import supermarket.model.Unite;

public class Test {

	public static void main(String[] args) {
		Produit p1=new Produit(1,new Prix(3,Unite.Kg),100.22);
		Produit p2=new Produit(2,new Prix(2.5,Unite.Unite), 122.0);
		Produit p3=new Produit(3,new Prix(4.4,Unite.Unite, 2,0,0),500.0);
		Produit p4=new Produit(4,new Prix(10.99,Unite.Litre,1,2,2),15.2);
		Produit p5=new Produit(5,new Prix(5.99,Unite.Litre,3,2,1),16.7);
		
		System.out.println(p1.getPrix().getPrixAchat(10.0));
		
		System.out.println(p2.getPrix().getPrixAchat(5));
		
		System.out.println(p3.getPrix().getPrixAchat(4));
		System.out.println(p3.getPrix().getPrixAchat(5));
		
		System.out.println(p4.getPrix().getPrixAchat(4));
		System.out.println(p4.getPrix().getPrixAchat(5));
		
		System.out.println(p5.getPrix().getPrixAchat(1));
		System.out.println(p5.getPrix().getPrixAchat(3));
		System.out.println(p5.getPrix().getPrixAchat(9));
	}

}
