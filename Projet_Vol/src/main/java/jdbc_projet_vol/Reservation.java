package jdbc_projet_vol;

import java.util.Date;

public class Reservation {
	
	private Long id;
	private Date date;
	private Integer numero;
	private Passager passager;
	private Client client;
	private Vol vol;
	
	
	public Reservation() {
		super();
	}
	
	


	public Reservation(Date date, Integer numero, Passager passager, Client client, Vol vol) {
		super();
		this.date = date;
		this.numero = numero;
		this.passager = passager;
		this.client = client;
		this.vol = vol ;
	}




	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public Passager getPassager() {
		return passager;
	}


	public void setPassager(Passager passager) {
		this.passager = passager;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Long getId() {
		return id;
	}




	public Vol getVol() {
		return vol;
	}




	public void setVol(Vol vol) {
		this.vol = vol;
	}
	
	
	
	
	
	
	
	
	

}
