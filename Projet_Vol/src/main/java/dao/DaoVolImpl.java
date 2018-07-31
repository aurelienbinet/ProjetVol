package dao;

import java.awt.List;
import java.beans.Statement;
import java.sql.ResultSet;

public class DaoVolImpl implements DaoVol {
	
	@Override
	public List<Vol> findAll() {
		
		Vol<Vol> vol = new ArrayList<>();
		SQLRequest_Select request = new SQLRequest_Select();
		ResultSet rs = request.selectAllVol();
		Statement st = null;
		try {
			st = rs.getStatement();
			while(rs.next()) {
				vol.add(new Vol(rs.getLong("id"), rs.getDate("dateDepart"), rs.getDate("dateArrivee"), rs.getDate("heureDepart"), rs.getDate("heureArrivee") ////))
			} catch (Exception e) {
				e.printStackTrace();
			}
		}finally {
			Closer.closeResultSet(rs);
			Closer.closeResultSet(st);
		}
		
		return vol;
	}
	
	@Override
	public Object findByKey(Object key) {
		
		Vol vol = null;
		SQLRequest request = new SQLRequest();
		ResultSet rs = request.xxxx();
		Statement st = null;
		try {
			st = rs.getStatement();
			if(rs.next()) {
				vol = new Vol(rs.getInt("num_vol") ////)
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
//		return vol;
	}

	@Override
	public void insert(Object obj) {
		
//		SQLRequest requetes = new SQLRequest();
//		if (obj instanceof Type1) {
//			requetes.insertDvd(Context.getInstance()////);
//		} else if (obj instanceof Type2) {
//			requetes.insertBluRay(Context.getInstance()////);
//		}
		
	}

	@Override
	public Object update(Object obj) {
		
		SQLRequest requetes = new SQLRequest();
		
		return null;
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByKey(Object key) {
		// TODO Auto-generated method stub
		
	}
	
}
