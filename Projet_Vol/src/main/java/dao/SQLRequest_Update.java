package jdbc_projetvol_dao;

public class SQLRequest_Update {
	private final static String UPDATE_CLIENT = "update client set nom=?,numeroTel=?,numeroFax=?,email=? where id_client=?";
	private final static String UPDATE_LOGIN = "update login set login=?,motDePasse=?,admin=? where id_login=?";
	private final static String UPDATE_VOL = "update vol set date_Depart=?,date_Arrivee=?,heure_Depart=?,heure_Arrivee=? where id_vol=?";
	private final static String UPDATE_RESERVATION = "update reservation set date=?,numero=? where id_reservation=?";
	private final static String UPDATE_PASSAGER = "update passager set nom=?,prenom=? where id_passager=?";

}
