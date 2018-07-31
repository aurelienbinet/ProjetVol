package dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import jdbc.util.Closer;
import jdbc.util.Context;
import jdbc_projetvol_dao.SQLRequest_Insert;
import model.Adresse;
import model.Passager;
import sql.SQLRequest_Delete;
import sql.SQLRequest_Select;
import sql.SQLRequest_Update;

public class DaoPassagerImpl implements DaoPassager {

	@Override
	public List<Passager> findAll() {
<<<<<<< HEAD
		List<Passager> passagers = new ArrayList<>();
		SQLRequest_Select requetes = new SQLRequest_Select();
		ResultSet rs = requetes.selectAllPassager(util.Context.getInstance());
		Statement st = null;
		try {
			st = rs.getStatement();
			while (rs.next()) {
				passagers.add(new Passager(rs.getString("nom"), rs.getString("prenom"), (Adresse) rs.getObject("adresse")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			util.Closer.closeResultSet(rs);
			util.Closer.closeResultSet(rs);
		}
		return passagers;
=======
		// TODO Auto-generated method stub
		return null;
>>>>>>> 41c412eb69bef49691a00be4b0dec81458fc21f7
	}
	
	@Override
	public Passager findByKey(Long key) {
		Passager passager = null;
		SQLRequest_Select requetes = new SQLRequest_Select();
		ResultSet rs = requetes.selectPassagerByKey(util.Context.getInstance(), key);
		Statement st = null;
		try {
			st = rs.getStatement();
			if (rs.next()) {
				passager = new Passager(rs.getString("nom"), rs.getString("prenom"), (Adresse) rs.getObject("adresse"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			util.Closer.closeResultSet(rs);
			util.Closer.closeStatement(st);
		}
		return passager;
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
