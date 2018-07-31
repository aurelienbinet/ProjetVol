package jdbc_projetvol_dao;

import java.awt.List;

public interface DaoGeneric<T, K> {
	
	List<T> findAll();

	T findByKey(K key);

	void insert(T obj);

	T update(T obj);

	void delete(T obj);

	void deleteByKey(K key);
}
