package model;
import java.io.Serializable;
import java.math.BigDecimal;


@SuppressWarnings("serial")
public class ReceiptBean implements Serializable {
	
	private long receiptId;
	private long productId;
	private String description;
	private String productName;
	private double productPrice;
	private int productQuantity;
	private Double totalPrice;
	
	public ReceiptBean(){
		
	}
	
	public long getReceiptId() {
		return receiptId;
	}
	public void setReceiptId(long receiptId) {
		this.receiptId = receiptId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long l) {
		this.productId = l;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double d) {
		this.productPrice = d;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int i) {
		this.productQuantity = i;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
