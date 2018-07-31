package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.Closer;
import util.Context;
import model.Adresse;
import model.Client;
import model.ClientEl;
import model.ClientMoral;
import model.ClientPhysique;
import model.Login;
import sql.SQLRequest_Delete;
import sql.SQLRequest_Insert;
import sql.SQLRequest_Select;
import sql.SQLRequest_Update;

public class DaoClientImpl implements DaoClient {

	@Override
	public List<Client> findAll() {

		List<Client> clients = new ArrayList<>();
		SQLRequest_Select requetes = new SQLRequest_Select();
		ResultSet rs = requetes.selectAllClient(Context.getInstance());
		Statement st = null;
		try {
			st = rs.getStatement();
			while (rs.next()) {

				if (rs.getString("typeClient").equals("P")) {
					clients.add(new ClientPhysique(rs.getString("prenom"), rs.getString("nom"), rs.getInt("numeroTel"),
							rs.getInt("numeroFax"), rs.getString("email"), (Adresse) rs.getObject("adresse"),
							(Login) rs.getObject("login"), rs.getString("titre")));
				} else if (rs.getString("typeClient").equals("M")) {
					clients.add(new ClientMoral(rs.getString("nom"), rs.getInt("numeroTel"), rs.getInt("numeroFax"),
							rs.getString("email"), (Adresse) rs.getObject("adresse"), rs.getString("siret"),
							rs.getString("titre")));
				} else {
					clients.add(new ClientEl(rs.getString("prenom"), rs.getString("nom"), rs.getInt("numeroTel"),
							rs.getInt("numeroFax"), rs.getString("email"), (Adresse) rs.getObject("adresse"),
							(Login) rs.getObject("login"), rs.getString("titre")));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeResultSet(rs);
			Closer.closeStatement(st);
		}
		return clients;
	}

	@Override
	public Client findByKey(Long key) {
		Client client = null;
		SQLRequest_Select requetes = new SQLRequest_Select();
		ResultSet rs = requetes.selectClientByKey(Context.getInstance(), key);
		Statement st = null;
		try {
			st = rs.getStatement();
			if (rs.next()) {
				if(rs.getString("typeClient").equals("P")) {
					client = new ClientPhysique(rs.getString("prenom"), rs.getString("nom"), rs.getInt("numeroTel"), rs.getInt("numeroFax"), rs.getString("email"), (Adresse) rs.getObject("adresse"), (Login) rs.getObject("login"), rs.getString("titre"));
				} else if(rs.getString("typeClient").equals("M")) {
					client = new ClientMoral(rs.getString("nom"), rs.getInt("numeroTel"), rs.getInt("numeroFax"), rs.getString("email"), (Adresse) rs.getObject("adresse"), rs.getString("siret"), rs.getString("titre"));
				} else {
					client = new ClientEl(rs.getString("prenom"), rs.getString("nom"), rs.getInt("numeroTel"), rs.getInt("numeroFax"), rs.getString("email"), (Adresse) rs.getObject("adresse"), (Login) rs.getObject("login"), rs.getString("titre"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeResultSet(rs);
			Closer.closeStatement(st);
		}
		return client;
	}

	@Override
	public void insert(Client obj) {
		SQLRequest_Insert requetes = new SQLRequest_Insert();
		if(obj instanceof ClientPhysique) {
			obj.setId(requetes.insertClientPhysique(Context.getInstance(), obj.getNom(), ((ClientPhysique) obj).getPrenom(), obj.getNumeroTel(), obj.getNumeroFax(), obj.getEmail(), obj.getAdresse().getAdresse(), obj.getAdresse().getCodePostal(), obj.getAdresse().getVille(), obj.getAdresse().getPays(), ((ClientPhysique) obj).getTitre()));
		} else if (obj instanceof ClientMoral){
			obj.setId(requetes.insertClientMoral(Context.getInstance(), obj.getNom(), obj.getNumeroTel(), obj.getNumeroFax(), obj.getEmail(), obj.getAdresse().getAdresse(), obj.getAdresse().getCodePostal(), obj.getAdresse().getVille(), obj.getAdresse().getPays(), ((ClientMoral) obj).getSiret(),((ClientMoral) obj).getTitre()));
		} else {
			obj.setId(requetes.insertClientPhysique(Context.getInstance(), obj.getNom(), ((ClientPhysique) obj).getPrenom(), obj.getNumeroTel(), obj.getNumeroFax(), obj.getEmail(), obj.getAdresse().getAdresse(), obj.getAdresse().getCodePostal(), obj.getAdresse().getVille(), obj.getAdresse().getPays(), ((ClientEl) obj).getTitre()));
		}
	}

	@Override
	public Client update(Client obj) {
		SQLRequest_Update requetes = new SQLRequest_Update();
		if(obj instanceof ClientPhysique) {
			requetes.updateClientPhysique(Context.getInstance(), obj.getNom(), ((ClientPhysique) obj).getPrenom(), obj.getNumeroTel(), obj.getNumeroFax(), obj.getEmail(), obj.getAdresse().getAdresse(), obj.getAdresse().getCodePostal(), obj.getAdresse().getVille(), obj.getAdresse().getPays(), ((ClientPhysique) obj).getTitre());
		} else if (obj instanceof ClientMoral){
			requetes.updateClientMoral(Context.getInstance(), obj.getNom(), obj.getNumeroTel(), obj.getNumeroFax(), obj.getEmail(), obj.getAdresse().getAdresse(), obj.getAdresse().getCodePostal(), obj.getAdresse().getVille(), obj.getAdresse().getPays(), ((ClientMoral) obj).getSiret(),((ClientMoral) obj).getTitre());
		} else {
			requetes.updateClientPhysique(Context.getInstance(), obj.getNom(), ((ClientPhysique) obj).getPrenom(), obj.getNumeroTel(), obj.getNumeroFax(), obj.getEmail(), obj.getAdresse().getAdresse(), obj.getAdresse().getCodePostal(), obj.getAdresse().getVille(), obj.getAdresse().getPays(), ((ClientEl) obj).getTitre());
		}
		return obj;
		
	}

	@Override
	public void delete(Client obj) {
		SQLRequest_Delete requetes = new SQLRequest_Delete();
		requetes.deleteClient(Context.getInstance(), obj.getId());

	}

	@Override
	public void deleteByKey(Long key) {
		SQLRequest_Delete requetes = new SQLRequest_Delete();
		requetes.deleteClient(Context.getInstance(), key);

	}

}
