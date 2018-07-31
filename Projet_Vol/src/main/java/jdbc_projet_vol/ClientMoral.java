package jdbc_projet_vol;

public class ClientMoral extends Client {
	
	private String titre = "TitreMoral";
	private String siret;
	
	public ClientMoral(String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, String siret) {
		super(nom, numeroTel, numeroFax, email, adresse);
		this.siret = siret;
	}
	public ClientMoral(String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, String siret, Login login) {
		super(nom, numeroTel, numeroFax, email, adresse, login);
		this.siret = siret;
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
