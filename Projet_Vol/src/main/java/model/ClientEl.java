package model;

public class ClientEl extends Client {

	
	private String titre;

	private String prenom;

	public ClientEl() {
		super();

	}

	
	public ClientEl(String typeClient, String prenom , String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, String titre) {
		super(typeClient, nom, numeroTel, numeroFax, email, adresse);
		this.prenom=prenom;
		this.titre = titre;
	}
	public ClientEl(String typeClient, String prenom , String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, Login login, String titre) {
		super(typeClient, nom, numeroTel, numeroFax, email, adresse, login);
		this.prenom=prenom;
		this.titre = titre;
	}
	public ClientEl(String typeClient, String prenom, String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse) {
		super(typeClient, nom, numeroTel, numeroFax, email, adresse);
		this.prenom = prenom;
	}



	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTitre() {
		return titre;
	}

}
