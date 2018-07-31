package dao;

import java.sql.ResultSet;

import java.sql.Statement;

import util.Context;

public class SQLRequest_Select {
	private final static String FIND_ALL_CLIENT = "select * from client";
	private final static String FIND_CLIENT_BY_KEY = "select * from client where id_client=?";
	private final static String FIND_ALL_LOGIN = "select * from login";
	private final static String FIND_LOGIN_BY_KEY = "select * from login where id_login=?";
	private final static String FIND_ALL_VOL = "select * from vol";
	private final static String FIND_VOL_BY_KEY = "select * from vol where id_vol=?";
	private final static String FIND_ALL_RESERVATION = "select * from client";
	private final static String FIND_RESERVATION_BY_KEY = "select * from reservation where id_reservation=?";
	private final static String FIND_ALL_PASSAGER = "select * from passager";
	private final static String FIND_PASSAGER_BY_KEY = "select * from passager where id_passager=?";

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

	// SELECTIONNER TOUS LES PASSAGERS
	public ResultSet selectAllPassager(Context ctx) {
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

}
