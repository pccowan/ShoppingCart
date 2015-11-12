package model;

import javax.persistence.EntityManager;

import customTools.DBUtil;


public class grabProduct {

	public static void main(String[] args) {
		
EntityManager em = customTools.DBUtil.getEmFactory().createEntityManager();
		
		try{
			
			model.Product cust = em.find(model.Product.class,(long)4);
			System.out.println(cust.getProductName());
			System.out.println(cust.getDescription());
			System.out.println(cust.getPrice());
			System.out.println(cust.getProductId());
			
		}	catch (Exception e){
			System.out.println(e);
		}	finally {
			em.close();
			System.out.println("Good Job!");
		}
		// TODO Auto-generated method stub

	}

}