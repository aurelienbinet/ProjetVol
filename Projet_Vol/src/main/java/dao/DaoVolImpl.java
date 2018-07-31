package dao;

import sql.SQLRequest_Select;
import util.Closer;
import util.Context;

import java.sql.ResultSet;

 import java.sql.PreparedStatement;

import java.awt.List;
import java.beans.Statement;
import java.sql.*;

import model.Vol;

public class DaoVolImpl implements DaoVol {
	
	@Override
	public List<Vol> findAll() {
		
		Vol<Vol> vol = new ArrayList<>();
		SQLRequest_Select requete = new SQLRequest_Select();
		ResultSet rs = requete.selectAllClient(Context.getInstance());
		Statement st = null;
		try {
			st = rs.getStatement();
			while(rs.next()) {
				vol.add(new Vol(rs.getInt("id"), rs.getDate("dateDepart"), rs.getDate("dateArrivee"), rs.getDate("heureDepart"), rs.getDate("heureArrivee") ))
			}} catch (Exception e) {
				e.printStackTrace();
			}
		 finally {
			Closer.closeResultSet(rs);
			Closer.closeResultSet(st);
		}
		
		return vol;
	}
	
	@Override
	public Vol findByKey(Object key) {
		
		Vol vol = null;
		SQLRequest_Select requetes = new SQLRequest_Select();
		ResultSet rs = requetes.selectVolById(Context.getInstance(), key);
		Statement st = null;
		try {
			st = rs.getStatement();
			if(rs.next()) {
				vol = new Vol(rs.getInt("id"), rs.getDate("dateDepart"), rs.getDate("dateArrivee"), rs.getDate("heureDepart"), rs.getDate("heureArrivee"))
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return vol;
	}

	@Override
	public void insert(Vol obj) {
		
		SQLRequest_Insert requetes = new SQLRequest_Insert();
		obj.setId(requetes.insertVol(Context.getInstance(), rs.getDate("dateDepart"), rs.getDate("dateArrivee"), rs.getDate("heureDepart"), rs.getDate("heureArrivee"));
		
	}

	@Override
	public Vol update(Vol obj) {
		
		SQLRequest_Update requetes = new SQLRequest_Update();
		requetes.updateVol(Context.getInstance(), rs.getDate("dateDepart"), rs.getDate("dateArrivee"), rs.getDate("heureDepart"), rs.getDate("heureArrivee"))
		return obj;
	}

	@Override
	public void delete(Vol obj) {
		
		deleteByKey(obj.getId());
		
	}

	@Override
	public void deleteByKey(Object key) {
		
		SQLRequest_Delete requetes = new SQLRequest_Delete();
		requetes.deleteByKey(Context.getInstance(), key);
	}
	
}
