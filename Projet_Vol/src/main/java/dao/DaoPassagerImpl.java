package dao;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.util.Closer;
import jdbc.util.Context;
import jdbc_projetvol_dao.SQLRequest_Insert;
import model.Adherent;
import model.Passager;
import sql.SQLRequest_Delete;
import sql.SQLRequest_Update;

public class DaoPassagerImpl implements DaoPassager {

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findByKey(Object key) {
		
		// TODO Auto-generated method stub
		
		
		
		return null;
	}

	@Override
	public void insert(Passager obj) {
		sql.SQLRequest_Insert requetes = new sql.SQLRequest_Insert();
		obj.setId((long) requetes.insertPassager(util.Context.getInstance(), obj.getNom(), obj.getPrenom(), obj.getAdresse().getAdresse(), obj.getAdresse().getCodePostal(), obj.getAdresse().getVille(), obj.getAdresse().getVille()));
	}

	@Override
	public Passager update(Passager obj) {
		SQLRequest_Update requetes = new SQLRequest_Update();
		requetes.updatePassager(util.Context.getInstance(),  obj.getNom(), obj.getPrenom(), obj.getAdresse().getAdresse(), obj.getAdresse().getCodePostal(), obj.getAdresse().getVille(), obj.getAdresse().getVille());
		return obj;
	}
	

	@Override
	public void delete(Passager obj) {
		deleteByKey(obj.getId());

	}

	@Override
	public void deleteByKey(Long key) {
		SQLRequest_Delete requetes = new SQLRequest_Delete();
		requetes.deletePassager(util.Context.getInstance(), key);

	}


}
