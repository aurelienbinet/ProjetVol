package jdbc_projetvol_dao;

import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.util.Closer;
import jdbc.util.Context;

public class SQLRequest_Insert {
	private final static String INSERT_CLIENT = "insert into client(id_client,nom,numeroTel,numeroFax,email,adresse,cp,ville,pays) values(nextval('seq_client'),?,?,?,?,?,?,?,?)";
	private final static String INSERT_LOGIN = "insert into login(id_login,login,motDePasse,admin) values('seq_login',?,?,?)";
	private final static String INSERT_VOL = "insert into vol(id_vol,date_Depart,date_Arrivee,heure_Depart,heure_Arrivee) values('seq_vol',?,?,?,?)";
	private final static String INSERT_RESERVATION = "insert into reservation(id_reservation,date,numero) values(nextval('seq_reservation'),?,?)";
	private final static String INSERT_PASSAGER = "insert into passager(id_passager,nom_passager,prenom_passager,adresse_passager,cp_passager,ville_passager,pays_passager) values(nextval('seq_passager'),?,?,?,?,?,?)";

	// INSERER UN CLIENT
	public int insertClient(Context ctx, String nom, Integer numeroTel, Integer numeroFax, String email, String adresse,
			String cp, String ville, String pays) {
		PreparedStatement ps = null;
		Statement st = null;
		int numeroGenere = -1;
		ResultSet rs = null;
		try {
			ps = ctx.getConnection().prepareStatement(INSERT_CLIENT);
			ps.setString(1, nom);
			ps.setInt(2, numeroTel);
			ps.setInt(3, numeroFax);
			ps.setString(4, email);
			ps.setString(5, adresse);
			ps.setString(6, cp);
			ps.setString(7, ville);
			ps.setString(8, pays);
			ps.executeUpdate();
			st = ctx.getConnection().createStatement();
			rs = st.executeQuery("select currval('seq_client')");
			if (rs.next()) {
				numeroGenere = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(st);
			Closer.closeStatement(ps);
		}
		return numeroGenere;
	}

	// INSERER UN LOGIN
	public int insertLogin(Context ctx, String login, String motDePasse, Boolean admin) {
		PreparedStatement ps = null;
		Statement st = null;
		int numeroGenere = -1;
		ResultSet rs = null;
		try {
			ps = ctx.getConnection().prepareStatement(INSERT_LOGIN);
			ps.setString(1, login);
			ps.setString(2, motDePasse);
			ps.setBoolean(3, admin);
			ps.executeUpdate();
			st = ctx.getConnection().createStatement();
			rs = st.executeQuery("select currval('seq_login')");
			if (rs.next()) {
				numeroGenere = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(st);
			Closer.closeStatement(ps);
		}
		return numeroGenere;
	}

	// INSERER UN VOL
	public int insertVol(Context ctx, Date date_Depart, Date date_Arrivee, Date heure_Depart, Date heure_Arrivee) {
		PreparedStatement ps = null;
		Statement st = null;
		int numeroGenere = -1;
		ResultSet rs = null;
		try {
			ps = ctx.getConnection().prepareStatement(INSERT_VOL);
			ps.setDate(1, date_Depart);
			ps.setDate(2, date_Arrivee);
			ps.setDate(3, heure_Depart);
			ps.setDate(4, heure_Arrivee);
			ps.executeUpdate();
			st = ctx.getConnection().createStatement();
			rs = st.executeQuery("select currval('seq_vol')");
			if (rs.next()) {
				numeroGenere = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(st);
			Closer.closeStatement(ps);
		}
		return numeroGenere;
	}

	// INSERER UNE RESERVATION
	public int insertReservation(Context ctx, Date date, Integer numero) {
		PreparedStatement ps = null;
		Statement st = null;
		int numeroGenere = -1;
		ResultSet rs = null;
		try {
			ps = ctx.getConnection().prepareStatement(INSERT_RESERVATION);
			ps.setDate(1, date);
			ps.setInt(2, numero);
			ps.executeUpdate();
			st = ctx.getConnection().createStatement();
			rs = st.executeQuery("select currval('seq_reservation')");
			if (rs.next()) {
				numeroGenere = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(st);
			Closer.closeStatement(ps);
		}
		return numeroGenere;
	}

	// INSERER UN PASSAGER
<<<<<<< HEAD
	public int insertPassager(Context ctx, String nom, String prenom, String adresse_passager,
=======
	public int insertPassager(Context ctx, String nom_passager, String prenom_passager, String adresse_passager,
>>>>>>> 1fd5f1752d15b979555204aa2ef355feaff355ce
			String cp_passager, String ville_passager, String pays_passager) {
		PreparedStatement ps = null;
		Statement st = null;
		int numeroGenere = -1;
		ResultSet rs = null;
		try {
<<<<<<< HEAD
			ps = ctx.getConnection().prepareStatement(INSERT_CLIENT);
			ps.setString(1, nom);
			ps.setString(2, prenom);
=======
			ps = ctx.getConnection().prepareStatement(INSERT_PASSAGER);
			ps.setString(1, nom_passager);
			ps.setString(2, prenom_passager);
>>>>>>> 1fd5f1752d15b979555204aa2ef355feaff355ce
			ps.setString(3, adresse_passager);
			ps.setString(4, cp_passager);
			ps.setString(6, ville_passager);
			ps.setString(7, pays_passager);
			ps.executeUpdate();
			st = ctx.getConnection().createStatement();
			rs = st.executeQuery("select currval('seq_passager')");
			if (rs.next()) {
				numeroGenere = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(st);
			Closer.closeStatement(ps);
		}
		return numeroGenere;
	}

}
