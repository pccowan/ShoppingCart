package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ItemSelectServlet")
public class ItemSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemSelectServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EntityManager em = customTools.DBUtil.getEmFactory().createEntityManager();
		long pid = Long.parseLong(request.getParameter("productId"));
				
		String query = "Select p from Product p where p.productId = :prodid";
		TypedQuery<Product> q = em.createQuery(query,Product.class);
		
		Product myProduct = q.setParameter("prodid", pid).getSingleResult();
		
		ProductJB productBean = new ProductJB();
		
		productBean.setProductId(myProduct.getProductId());
		productBean.setProductName(myProduct.getProductName());
		productBean.setDescription(myProduct.getDescription());
		productBean.setPrice(myProduct.getPrice());
			
		{			
			request.setAttribute("products", productBean);
			
			getServletContext()
			.getRequestDispatcher("/ItemSelect.jsp")
			.forward(request,response);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}

