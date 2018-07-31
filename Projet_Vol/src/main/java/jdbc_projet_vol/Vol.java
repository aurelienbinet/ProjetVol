package jdbc_projet_vol;

import java.util.Date;

public class Vol {
	
	private Long id;
	private Date dateDepart;
	private Date dateArrivee;
	private Date heureDepart;
	private Date heureArrivee;
	
	
	public Vol() {
		super();
	}


	public Vol(Date dateDepart, Date dateArrivee, Date heureDepart, Date heureArrivee) {
		super();
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
	}


	public Date getDateDepart() {
		return dateDepart;
	}


	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}


	public Date getDateArrivee() {
		return dateArrivee;
	}


	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}


	public Date getHeureDepart() {
		return heureDepart;
	}


	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}


	public Date getHeureArrivee() {
		return heureArrivee;
	}


	public void setHeureArrivee(Date heureArrivee) {
		this.heureArrivee = heureArrivee;
	}


	public Long getId() {
		return id;
	}
	
	
	

}
