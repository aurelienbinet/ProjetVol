package model;

public abstract class Client {

<<<<<<< HEAD
	private Long id;
=======
	private Long id_client;
>>>>>>> a321a630c9083a0a9a3ecf78f2981b6130789927
	private String nom;
	private Integer numeroTel;
	private Integer numeroFax;
	private String email;
	private Adresse adresse;
	private Login login;

	public Client(String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse) {
		super();
		this.nom = nom;
		this.numeroTel = numeroTel;
		this.numeroFax = numeroFax;
		this.email = email;
		this.adresse = adresse;
	}

	public Client(String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, Login login) {
		super();
		this.nom = nom;
		this.numeroTel = numeroTel;
		this.numeroFax = numeroFax;
		this.email = email;
		this.adresse = adresse;
		this.login = login;
	}

	public Client() {
		super();
	}

<<<<<<< HEAD
	public void setId(Long i) {
		this.id = i;
=======
	public void setId(Long id_client) {
		this.id_client = id_client;
>>>>>>> a321a630c9083a0a9a3ecf78f2981b6130789927
	}

	public Long getId() {
		return id_client;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(Integer numeroTel) {
		this.numeroTel = numeroTel;
	}

	public Integer getNumeroFax() {
		return numeroFax;
	}

	public void setNumeroFax(Integer numeroFax) {
		this.numeroFax = numeroFax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
<<<<<<< HEAD

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
=======
>>>>>>> a321a630c9083a0a9a3ecf78f2981b6130789927

}
