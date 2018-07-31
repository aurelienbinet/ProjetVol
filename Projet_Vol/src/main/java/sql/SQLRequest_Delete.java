package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.Closer;
import util.Context;

public class SQLRequest_Delete {
	private final static String DELETE_CLIENT = "delete from client where id_client=?";
	private final static String DELETE_LOGIN = "delete from login where id_login=?";
	private final static String DELETE_VOL = "delete from vol where id_vol=?";
	private final static String DELETE_RESERVATION = "delete from reservation where id_reservation=?";
	private final static String DELETE_PASSAGER = "delete from passager where id_passager=?";

	// SUPPRIMER UN CLIENT
	public int deleteClient(Context ctx, int id_client) {
		int retour = 0;
		PreparedStatement ps = null;
		try {
			ps = ctx.getConnection().prepareStatement(DELETE_CLIENT);
			ps.setInt(1, id_client);
			retour = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(ps);
		}
		return retour;
	}

}
