package dao;

import java.util.ArrayList;
import java.util.List;

import sql.*;

import java.sql.Statement;
import java.sql.ResultSet;

import model.Reservation;
import model.Vol;
import sql.SQLRequest_Select;
import util.Closer;
import util.Context;

import java.util.List;

import model.Vol;


public class DaoVolImpl implements DaoVol {
	
	@Override
	public List<Vol> findAll() {
		
		List<Vol> vol = new ArrayList<>();
		SQLRequest_Select requete = new SQLRequest_Select();
		ResultSet rs = requete.selectAllClient(Context.getInstance());
		Statement st = null;
		try {
			st = rs.getStatement();
			while(rs.next()) {
				vol.add(new Vol(rs.getDate("dateDepart"), rs.getDate("dateArrivee"), rs.getDate("heureDepart"), rs.getDate("heureArrivee") ));
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
	public Vol findByKey(Long key) {
		
		Vol vol = null;
		SQLRequest_Select requetes = new SQLRequest_Select();
		ResultSet rs = requetes.selectVolByKey(Context.getInstance(), key);
		Statement st = null;
		try {
			st = rs.getStatement();
			if(rs.next()) {
				vol = new Vol(rs.getDate("dateDepart"), rs.getDate("dateArrivee"), rs.getDate("heureDepart"), rs.getDate("heureArrivee"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return vol;
	}

	@Override
	public void insert(Vol obj) {
		
		SQLRequest_Insert requetes = new SQLRequest_Insert();
		obj.setId(requetes.insertVol(Context.getInstance(), obj.getDateDepart(), obj.getDateArrivee(), obj.getHeureDepart(), obj.getHeureArrivee());
		
	}

	@Override
	public Vol update(Vol obj) {
		
		SQLRequest_Update requetes = new SQLRequest_Update();
		requetes.updateVol(Context.getInstance(), obj.getDateDepart(), obj.getDateArrivee(), obj.getHeureDepart(), obj.getHeureArrivee());
		return obj;
	}

	@Override
	public void delete(Vol obj) {
		
		deleteByKey(obj.getId());
		
	}

	@Override
	public void deleteByKey(Long key) {
		
		SQLRequest_Delete requetes = new SQLRequest_Delete();
		requetes.deleteVol(Context.getInstance(), key);
	}
	
}
