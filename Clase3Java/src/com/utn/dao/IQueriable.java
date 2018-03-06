package com.utn.dao;

import java.util.List;

public interface IQueriable<T> {

	//recupero objeto por id
	public T getById(int id);
	
	//recupero objeto por usuario
	public T getByUser(String user);
	
	
	//recupero objeto x mail
	public T getUserByEmail(String email);
	
	//Recupero todos los registros de la tabla
	public List<T> getAllList();
	
	public boolean save(T t);
	
	public boolean update(T t);
	
	public boolean deleteById(int id);
	
	public boolean deleteByObjecto(T t);
	
	
}
