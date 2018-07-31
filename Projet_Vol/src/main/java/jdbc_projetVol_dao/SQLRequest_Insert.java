package jdbc_projetvol_dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.util.Closer;
import jdbc.util.Context;

public class SQLRequest_Insert {
	private final static String INSERT_CLIENT = "insert into client(id_client,nom,numeroTel,numeroFax,email) values(nextval('seq_client'),?,?,?,?)";
	private final static String INSERT_LOGIN = "insert into login(id_login,login,motDePasse,admin) values('seq_login',?,?,?)";
	private final static String INSERT_VOL = "insert into vol(id_vol,date_Depart,date_Arrivee,heure_Depart,heure_Arrivee) values(?,?,?,?,?)";
	private final static String INSERT_RESERVATION = "insert into reservation(id_reservation,date,numero) values(nextval('seq_reservation'),?,?)";
	private final static String INSERT_PASSAGER = "insert into passager(id_passager,nom,prenom) values(nextval('seq_passager'),?,?)";

	public int insertClient(Context ctx, String nom, Integer numeroTel, Integer numeroFax, String email) {
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

}
