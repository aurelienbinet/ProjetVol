package dao;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.util.Closer;
import jdbc.util.Context;
import jdbc_projetvol_dao.SQLRequest_Insert;
import model.Adherent;
import model.Passager;

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
		obj.setId(requetes.insertPassager(util.Context.getInstance(), obj.getNom(), obj.getPrenom(), obj.getAdresse().getAdresse(), obj.getAdresse().getCodePostal(), obj.getAdresse().getVille(), obj.getAdresse().getVille()));
	}

	@Override
	public Object update(Object obj) {
		// TODO Auto-generated method stub
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
