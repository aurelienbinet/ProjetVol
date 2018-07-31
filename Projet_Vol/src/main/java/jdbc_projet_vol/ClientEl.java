package jdbc_projet_vol;

public class ClientEl extends Client {
	
	private String titre = "TitrePhysique";
	private String prenom;
	
	public ClientEl() {
		super();
		
	}
	
	public ClientEl(String prenom , String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse) {
		super(nom, numeroTel, numeroFax, email, adresse);
		this.prenom=prenom;
	}
	public ClientEl(String prenom , String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, Login login) {
		super(nom, numeroTel, numeroFax, email, adresse, login);
		this.prenom=prenom;
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
