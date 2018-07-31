package sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;

import util.Context;

public class SQLRequest_Select {
	private final static String FIND_ALL_CLIENT = "select * from client";
	private final static String FIND_CLIENT_BY_ID = "select * from client where id_client=?";
	private final static String FIND_ALL_LOGIN = "select * from login";
	private final static String FIND_LOGIN_BY_ID = "select * from login where id_login=?";
	private final static String FIND_ALL_VOL = "select * from vol";
	private final static String FIND_VOL_BY_ID = "select * from vol where id_vol=?";
	private final static String FIND_ALL_RESERVATION = "select * from client";
	private final static String FIND_RESERVATION_BY_ID = "select * from reservation where id_reservation=?";
	private final static String FIND_ALL_PASSAGER = "select * from passager";
	private final static String FIND_PASSAGER_BY_ID = "select * from passager where id_passager=?";

	// SELECTIONNER TOUS LES CLIENTS
	public ResultSet selectAllClient(Context ctx) {
		Statement st = null;
		ResultSet rs = null;
		try {
			st = ctx.getConnection().createStatement();
			rs = st.executeQuery(FIND_ALL_CLIENT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	// SELECTIONNER UN CLIENT AVEC UN ID
	public ResultSet selectClientByKey(Context ctx, Long id_client) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = ctx.getConnection().prepareStatement(FIND_CLIENT_BY_ID);
			ps.setLong(1, id_client);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	// SELECTIONNER TOUS LES LOGINS
	public ResultSet selectAllLogin(Context ctx) {
		Statement st = null;
		ResultSet rs = null;
		try {
			st = ctx.getConnection().createStatement();
			rs = st.executeQuery(FIND_ALL_LOGIN);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	// SELECTIONNER UN LOGIN AVEC UN ID
	public ResultSet selectLoginByKey(Context ctx, Long id_login) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = ctx.getConnection().prepareStatement(FIND_LOGIN_BY_ID);
			ps.setLong(1, id_login);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	// SELECTIONNER TOUS LES VOLS
	public ResultSet selectAllVol(Context ctx) {
		Statement st = null;
		ResultSet rs = null;
		try {
			st = ctx.getConnection().createStatement();
			rs = st.executeQuery(FIND_ALL_VOL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	// SELECTIONNER UN VOL AVEC UN ID
	public ResultSet selectVolByKey(Context ctx, Long id_vol) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = ctx.getConnection().prepareStatement(FIND_VOL_BY_ID);
			ps.setLong(1, id_vol);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	// SELECTIONNER TOUTES LES RESERVATIONS
	public ResultSet selectAllReservation(Context ctx) {
		Statement st = null;
		ResultSet rs = null;
		try {
			st = ctx.getConnection().createStatement();
			rs = st.executeQuery(FIND_ALL_RESERVATION);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	// SELECTIONNER UNE RESERVATION AVEC UN ID
	public ResultSet selectReservationByKey(Context ctx, Long id_reservation) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = ctx.getConnection().prepareStatement(FIND_RESERVATION_BY_ID);
			ps.setLong(1, id_reservation);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	// SELECTIONNER TOUS LES PASSAGERS
	public ResultSet selectAllPassager(Context ctx) {
		Statement st = null;
		ResultSet rs = null;
		try {
			st = ctx.getConnection().createStatement();
			rs = st.executeQuery(FIND_ALL_PASSAGER);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	// SELECTIONNER UN PASSAGER AVEC UN ID
	public ResultSet selectPassagerByKey(Context ctx, Long id_passager) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = ctx.getConnection().prepareStatement(FIND_PASSAGER_BY_ID);
			ps.setLong(1, id_passager);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

}
