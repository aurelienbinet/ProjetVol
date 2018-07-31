package jdbc_projetvol_dao;

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

}
