package model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import customTools.DBUtil;
import model.Product;




public class ProductInterface {

	
	public ArrayList<Product> getAllProducts(){
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		List<Product> fd = null;
		
		try {
			String sql = "select p from Product p";
			TypedQuery<Product> results = em.createQuery(sql, Product.class);
			
			fd = results.getResultList();
			
		} catch (Exception e){
			System.out.println(e);
		} finally {
			em.close();
		}
		
		return new ArrayList<Product>(fd);
	}
	
	public ArrayList<Receipt> getItems(){
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		List<Receipt> itm = null;
		
		try {
			String sql = "select r from Receipt r";
			TypedQuery<Receipt> results = em.createQuery(sql, Receipt.class);
			
			itm = results.getResultList();
			
		} catch (Exception e){
			System.out.println(e);
		} finally {
			em.close();
		}
		
		return new ArrayList<Receipt>(itm);
	}

}
