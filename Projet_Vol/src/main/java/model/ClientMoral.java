package model;

public class ClientMoral extends Client {
<<<<<<< HEAD
	
	private String titre;
	private String siret;
	
	public ClientMoral(String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, String siret, String titre) {
=======

	private String titre = "TitreMoral";
	private String siret;

	public ClientMoral(String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, String siret) {
>>>>>>> a321a630c9083a0a9a3ecf78f2981b6130789927
		super(nom, numeroTel, numeroFax, email, adresse);
		this.siret = siret;
		this.titre = titre;
	}
<<<<<<< HEAD
	public ClientMoral(String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, String siret, Login login, String titre) {
=======

	public ClientMoral(String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, String siret,
			Login login) {
>>>>>>> a321a630c9083a0a9a3ecf78f2981b6130789927
		super(nom, numeroTel, numeroFax, email, adresse, login);
		this.siret = siret;
		this.titre = titre;
	}

	public ClientMoral() {
		super();
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getTitre() {
		return titre;
	}

}
