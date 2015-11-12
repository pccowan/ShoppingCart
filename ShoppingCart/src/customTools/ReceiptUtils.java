package customTools;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Receipt;
import model.ReceiptBean;

public class ReceiptUtils {
	

	public static void insert(Receipt rec) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin(); 
		try {
		em.persist(rec);
		trans.commit();
		} catch (Exception e) {
		System.out.println(e);
		trans.rollback();
		} finally {
		em.close();
		}

}
}
