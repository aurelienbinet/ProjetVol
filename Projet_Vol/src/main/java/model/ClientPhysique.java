package model;

public class ClientPhysique extends Client {
<<<<<<< HEAD
	
	private String titre ;
=======

	private String titre = "TitrePhysique";
>>>>>>> a321a630c9083a0a9a3ecf78f2981b6130789927
	private String prenom;

	public ClientPhysique() {
		super();

	}
<<<<<<< HEAD
	
	public ClientPhysique(String prenom , String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, String titre) {
		super(nom, numeroTel, numeroFax, email, adresse);
		this.prenom=prenom;
		this.titre = titre;
	}
	
	
	public ClientPhysique(String prenom , String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, Login login, String titre) {
		super(nom, numeroTel, numeroFax, email, adresse, login);
		this.prenom=prenom;
		this.titre = titre;
=======

	public ClientPhysique(String prenom, String nom, Integer numeroTel, Integer numeroFax, String email,
			Adresse adresse) {
		super(nom, numeroTel, numeroFax, email, adresse);
		this.prenom = prenom;
	}

	public ClientPhysique(String prenom, String nom, Integer numeroTel, Integer numeroFax, String email,
			Adresse adresse, Login login) {
		super(nom, numeroTel, numeroFax, email, adresse, login);
		this.prenom = prenom;
>>>>>>> a321a630c9083a0a9a3ecf78f2981b6130789927
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
