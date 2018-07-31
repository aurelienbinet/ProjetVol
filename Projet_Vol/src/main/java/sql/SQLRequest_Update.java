package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.Closer;
import util.Context;

public class SQLRequest_Update {
	private final static String UPDATE_CLIENT = "update client set nom=?,numeroTel=?,numeroFax=?,email=?,adresse=?,cp=?,ville=?,pays=? where id_client=?";
	private final static String UPDATE_LOGIN = "update login set login=?,motDePasse=?,admin=? where id_login=?";
	private final static String UPDATE_VOL = "update vol set date_Depart=?,date_Arrivee=?,heure_Depart=?,heure_Arrivee=? where id_vol=?";
	private final static String UPDATE_RESERVATION = "update reservation set date=?,numero=? where id_reservation=?";
	private final static String UPDATE_PASSAGER = "update passager set nom_passager=?,prenom_passager=?,adresse_passager=?,cp_passager=?,ville_passager=?,pays_passager=? where id_passager=?";

	// UPDATE CLIENT
	public int updateClient(Context ctx, String nom, Integer numeroTel, Integer numeroFax, String email, String adresse,
			String cp, String ville, String pays) {
		int retour = 0;
		PreparedStatement ps = null;
		try {
			ps = ctx.getConnection().prepareStatement(UPDATE_CLIENT);
			ps.setString(1, nom);
			ps.setInt(2, numeroTel);
			ps.setInt(3, numeroFax);
			ps.setString(4, email);
			ps.setString(5, adresse);
			ps.setString(6, cp);
			ps.setString(7, ville);
			ps.setString(8, pays);
			retour = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(ps);
		}
		return retour;
	}

	// UPDATE LOGIN
	public int updateLogin(Context ctx, String login, String motDePasse, Boolean admin) {
		int retour = 0;
		PreparedStatement ps = null;
		try {
			ps = ctx.getConnection().prepareStatement(UPDATE_LOGIN);
			ps.setString(1, login);
			ps.setString(2, motDePasse);
			ps.setBoolean(3, admin);
			retour = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(ps);
		}
		return retour;
	}

	// UPDATE VOL
	public int updateVol(Context ctx, Date date_Depart, Date date_Arrivee, Date heure_Depart, Date heure_Arrivee) {
		int retour = 0;
		PreparedStatement ps = null;
		try {
			ps = ctx.getConnection().prepareStatement(UPDATE_VOL);
			ps.setDate(1, date_Depart);
			ps.setDate(2, date_Arrivee);
			ps.setDate(3, heure_Depart);
			ps.setDate(4, heure_Arrivee);
			retour = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(ps);
		}
		return retour;
	}

	// UPDATE RESERVATION
	public int updateReservation(Context ctx, Date date, Integer numero) {
		int retour = 0;
		PreparedStatement ps = null;
		try {
			ps = ctx.getConnection().prepareStatement(UPDATE_RESERVATION);
			ps.setDate(1, date);
			ps.setInt(2, numero);
			retour = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(ps);
		}
		return retour;
	}

	// UPDATE PASSAGER
	public int updatePassager(Context ctx, String nom_passager, String prenom_passager, String adresse_passager,
			String cp_passager, String ville_passager, String pays_passager) {
		int retour = 0;
		PreparedStatement ps = null;
		try {
			ps = ctx.getConnection().prepareStatement(UPDATE_PASSAGER);
			ps.setString(1, nom_passager);
			ps.setString(2, prenom_passager);
			ps.setString(3, adresse_passager);
			ps.setString(4, cp_passager);
			ps.setString(5, ville_passager);
			ps.setString(6, pays_passager);
			retour = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(ps);
		}
		return retour;
	}

}
