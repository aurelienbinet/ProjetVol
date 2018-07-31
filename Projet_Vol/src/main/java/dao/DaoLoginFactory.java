package dao;

public class DaoLoginFactory {
	
	
	
	private DaoLoginFactory() {
		
	}
	
	
	public static DaoLogin getInstance() {
		
		return new DaoLoginImpl();
		
	}

}
