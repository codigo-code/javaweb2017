package com.utn.dao;

import java.sql.ResultSet;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.utn.modelo.Usuario;

public class UsuarioFactory implements IQueriable<Usuario> {

	private ConnectioMySql conn;
	
	public UsuarioFactory(ConnectioMySql connectioMySql) {
		this.conn = connectioMySql;
	}
	


	@Override
	public Usuario getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getByUser(String user) {
		
		Usuario usuario = null;

		try {
			String query = "select * from usuarios where user = ?";
			PreparedStatement ps = (PreparedStatement) conn.getConnection().prepareStatement(query);
			ps.setString(1, user);
			
			ResultSet rs = ps.executeQuery();
			usuario = new Usuario();
			while(rs.next()) {
				usuario.setName(rs.getString("name"));
				usuario.setSurname(rs.getString("surname"));
				usuario.setEmail(rs.getString("email"));
				usuario.setPassword(rs.getString("password"));
				usuario.setUser(rs.getString("user"));
			}
			
			
		} catch (Exception e) {
			System.out.println("Hubo un problema ");
			
			return null;
		}
		
		
		return usuario;
	}

	@Override
	public Usuario getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getAllList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Usuario usuario) {
		try {
			String query = "insert into usuarios (name,surname,email,user,password) values (?,?,?,?,?)";
			PreparedStatement ps = (PreparedStatement) conn.getConnection().prepareStatement(query);
			ps.setString(1, usuario.getName());
			ps.setString(2, usuario.getSurname());
			ps.setString(3, usuario.getEmail());
			ps.setString(4, usuario.getUser());
			ps.setString(5, usuario.getPassword());
			
			ps.execute();
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Usuario t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByObjecto(Usuario t) {
		// TODO Auto-generated method stub
		return false;
	}
}






