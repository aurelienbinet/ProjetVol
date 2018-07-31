package dao;

public class DaoClientFactory {

	
	private DaoClientFactory() {
		
	}
	
	
	public static DaoClient getInstance() {
		
		return new DaoClientImpl();
		
	}
	
	
	
}
