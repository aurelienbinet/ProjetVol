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

import model.Reservation;


public class DaoReservationImpl implements DaoReservation {
	
	@Override
	public List<Reservation> findAll() {

		List<Reservation> reservation = new ArrayList<>();
		SQLRequest_Select requete = new SQLRequest_Select();
		ResultSet rs = requete.selectAllClient(Context.getInstance());
		Statement st = null;
		try {
			st = rs.getStatement();
			while(rs.next()) {
				vol.add(new Vol(rs.getInt("numero"), rs.getDate("date"), rs.getPassager(), rs.getClient(), rs.getVol("vol")));
			}} catch (Exception e) {
				e.printStackTrace();
			}
		 finally {
			Closer.closeResultSet(rs);
			Closer.closeResultSet(st);
		}
		
		return reservation;
	}
	
	@Override
	public Reservation findByKey(Long key) {
		
		Reservation reservation = null;
		SQLRequest_Select requetes = new SQLRequest_Select();
		ResultSet rs = requetes.selectReservationById(Context.getInstance(), key);
		Statement st = null;
		try {
			st = rs.getStatement();
			if(rs.next()) {
				vol = new Vol(rs.getInt("numero"), rs.getDate("date"), rs.getPassager("passager"), rs.getClient("client"), rs.getVol("vol")));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return reservation;
		
	}

	@Override
	public void insert(Reservation obj) {
		
		SQLRequest_Insert requetes = new SQLRequest_Insert();
		obj.setNumero(requetes.insertReservation(Context.getInstance(), obj.getDate(), obj.getPassager(), obj.getClient(), obj.getVol()));
		
	}

	@Override
	public Reservation update(Reservation obj) {
		
		SQLRequest_Update requetes = new SQLRequest_Update();
		requetes.updateReservation(Context.getInstance(), obj.getDate(), obj.getPassager(), obj.getClient(), obj.getVol());
		return obj;
	}

	@Override
	public void delete(Reservation obj) {
		
		deleteByKey(obj.getId());
	}

	@Override
	public void deleteByKey(Long key) {
		
		SQLRequest_Delete requetes = new SQLRequest_Delete();
		requetes.deleteReservation(Context.getInstance(), key);
		
	}
	
}
