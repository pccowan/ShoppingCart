package customTools;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Product;


import java.util.ArrayList;
import java.util.List;




public class DBUtil {
	private static final EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("ShoppingCart");
	public static EntityManagerFactory getEmFactory(){
		return emf;
	}
	
}
