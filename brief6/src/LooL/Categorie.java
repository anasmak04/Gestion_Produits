package LooL;

public class Categorie {
		
	private String ref_categorie,nom_categorie,ref_produit;

	
	public Categorie(String ref_categorie, String nom_categorie, String ref_produit) {
		super();
		this.ref_categorie = ref_categorie;
		this.nom_categorie = nom_categorie;
		this.ref_produit = ref_produit;
	}

	public String getRef_categorie() {
		return ref_categorie;
	}

	public void setRef_categorie(String ref_categorie) {
		this.ref_categorie = ref_categorie;
	}

	public String getNom_categorie() {
		return nom_categorie;
	}

	public void setNom_categorie(String nom_categorie) {
		this.nom_categorie = nom_categorie;
	}

	public String getRef_produit() {
		return ref_produit;
	}

	public void setRef_produit(String ref_produit) {
		this.ref_produit = ref_produit;
	}

	
	@Override
	public String toString() {
		return "Categorie [ref_categorie=" + ref_categorie + ", nom_categorie=" + nom_categorie + ", ref_produit="
				+ ref_produit + "]";
	}
	
	
}
