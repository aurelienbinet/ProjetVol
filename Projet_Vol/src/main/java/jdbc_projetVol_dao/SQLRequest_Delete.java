package jdbc_projetvol_dao;

public class SQLRequest_Delete {
	private final static String DELETE_CLIENT = "delete from client where id_client=?";
	private final static String DELETE_LOGIN = "delete from login where id_login=?";
	private final static String DELETE_VOL = "delete from vol where id_vol=?";
	private final static String DELETE_RESERVATION = "delete from reservation where id_reservation=?";
	private final static String DELETE_PASSAGER = "delete from passager where id_passager=?";

}
