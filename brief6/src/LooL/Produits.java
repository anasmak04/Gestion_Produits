package LooL;

public class Produits {
	private String ref_produit,nom_produit,type_produit,Qte_produit,prix_produit,date_produit;

	
	public Produits(String ref_produit, String nom_produit, String type_produit, String qte_produit,
			String prix_produit, String date_produit) {
		super();
		this.ref_produit = ref_produit;
		this.nom_produit = nom_produit;
		this.type_produit = type_produit;
		Qte_produit = qte_produit;
		this.prix_produit = prix_produit;
		this.date_produit = date_produit;
	}

	public String getRef_produit() {
		return ref_produit;
	}

	public void setRef_produit(String ref_produit) {
		this.ref_produit = ref_produit;
	}

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}

	public String getType_produit() {
		return type_produit;
	}

	public void setType_produit(String type_produit) {
		this.type_produit = type_produit;
	}

	public String getQte_produit() {
		return Qte_produit;
	}

	public void setQte_produit(String qte_produit) {
		Qte_produit = qte_produit;
	}

	public String getPrix_produit() {
		return prix_produit;
	}

	public void setPrix_produit(String prix_produit) {
		this.prix_produit = prix_produit;
	}

	public String getDate_produit() {
		return date_produit;
	}

	public void setDate_produit(String date_produit) {
		this.date_produit = date_produit;
	}

	
	@Override
	public String toString() {
		return "Categorie [ref_produit=" + ref_produit + ", nom_produit=" + nom_produit + ", type_produit="
				+ type_produit + ", Qte_produit=" + Qte_produit + ", prix_produit=" + prix_produit + ", date_produit="
				+ date_produit + "]";
	}
	
}
