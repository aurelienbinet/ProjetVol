package dao;

public class DaoVolFactory {

	
	private DaoVolFactory() {
		
	}
	
	
	public static DaoVol getInstance() {
		
		return new DaoVolImpl();
		
	}
}
