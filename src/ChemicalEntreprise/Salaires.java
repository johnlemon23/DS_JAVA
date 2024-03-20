package ChemicalEntreprise;

public class Salaires {

	public static void main(String[] args) {
		Personnel p = new Personnel();
		 p.ajouterEmploye(new Vendeur("Pierre", "Business", 45,
		"1995", 30000.0));
		 p.ajouterEmploye(new Representant("Léon", "Vendtout",
		25, "2001", 20000));
		 p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28,
		"1998", 1000.0));
		 p.ajouterEmploye(new Manutentionnaire("Jeanne",
		"Stocketout", 32, "1998", 45.0));
		 p.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28,
		"2000", 1000.0));
		 p.ajouterEmploye(new ManuARisque("Al", "Abordage", 30,
		"2001", 45.0));
		 p.calculerSalaires();
		 System.out.println("Le salaire moyen dans l'entreprise est de "+p.salaireMoyen()+" euros.");
	}
}
