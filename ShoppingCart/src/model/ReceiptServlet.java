package model;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customTools.ReceiptUtils;
/**
 * Servlet implementation class ReceiptServlet
 */
@WebServlet("/ReceiptServlet")
public class ReceiptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReceiptServlet() {
		super();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		EntityManager em = customTools.DBUtil.getEmFactory()
				.createEntityManager();
		
		long pid = Long.parseLong(request.getParameter("pid"));

		String query = "Select p from Product p where p.productId = :prodid";
		TypedQuery<Product> q = em.createQuery(query, Product.class);

		Product myProduct = q.setParameter("prodid", pid).getSingleResult();

		Receipt myReceipt = new Receipt();

		myReceipt.setProductId(pid);

		ProductJB productBean = new ProductJB();

		productBean.setProductId(myProduct.getProductId());
		productBean.setProductName(myProduct.getProductName());
		productBean.setDescription(myProduct.getDescription());
		productBean.setPrice(myProduct.getPrice());		
		
		myReceipt.setReceiptId(myReceipt.getReceiptId());
		myReceipt.setDescription(myProduct.getDescription());
		myReceipt.setProductId(myReceipt.getProductId());
		myReceipt.setProductName(myProduct.getProductName());
		myReceipt.setProductPrice(myProduct.getPrice());
		myReceipt.setProductQuantity(1);
		BigDecimal choc = myReceipt.setTotalPrice(myProduct.getPrice());
			
		ProductInterface PIR = new ProductInterface();
		ArrayList<Receipt> itemList = PIR.getItems();
		
		for(int i = 0; i<itemList.size(); i++)	
		{	
		myReceipt.getReceiptId();
		ReceiptUtils.insert(myReceipt);
		{
			request.setAttribute("receipt", myReceipt);
			request.setAttribute("products", productBean);
			request.setAttribute("itemList", itemList);

			getServletContext().getRequestDispatcher("/Receipt.jsp").forward(
					request, response);
		}
		}	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
		
	}

}
