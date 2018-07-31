package jdbc_projet_vol;

public class Login {
	
	private Long id;
	private String login;
	private String motDePasse;
	private Boolean admin;
	
	public Login(String login, String motDePasse, Boolean admin) {
		super();
		this.login = login;
		this.motDePasse = motDePasse;
		this.admin = admin;
	}
	
	

	public Login() {
		super();
	}



	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public Long getId() {
		return id;
	}
	
	
	
	
	

}
