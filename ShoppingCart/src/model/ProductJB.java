package model;

import java.io.Serializable;
import java.math.BigDecimal;

@SuppressWarnings("serial")
public class ProductJB implements Serializable {

	private long productId;
	private String description,productName;
	private BigDecimal price;
	
	public ProductJB(){
		
	}
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
}
