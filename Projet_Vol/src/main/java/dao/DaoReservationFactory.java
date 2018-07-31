package dao;

public class DaoReservationFactory {

	
	private DaoReservationFactory() {
		
	}
	
	
	public static DaoReservation getInstance() {
		
		return new DaoReservationImpl();
		
	}
	
}
