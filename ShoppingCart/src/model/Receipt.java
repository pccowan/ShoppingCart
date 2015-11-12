package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the RECEIPTS database table.
 * 
 */
@Entity
@Table(name="RECEIPTS", schema="testuserdb")
@NamedQuery(name="Receipt.findAll", query="SELECT r FROM Receipt r")
public class Receipt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SHOPPINGCART_ID_GENERATOR", sequenceName="RECEIPTS_SEQ",allocationSize=1,initialValue=20)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SHOPPINGCART_ID_GENERATOR")
	
	@Column(name="RECEIPT_ID")
	private long receiptId;

	private String description;

	@Column(name="PRODUCT_ID")
	private long productId;

	@Column(name="PRODUCT_NAME")
	private String productName;

	@Column(name="PRODUCT_PRICE")
	private BigDecimal productPrice;

	@Column(name="PRODUCT_QUANTITY")
	private int productQuantity;

	@Column(name="TOTAL_PRICE")
	private BigDecimal totalPrice;

	public Receipt() {
	}

	public long getReceiptId() {
		return this.receiptId;
	}

	public void setReceiptId(long receiptId) {
		this.receiptId = receiptId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getProductId() {
		return this.productId;
	}

	public void setProductId(long pid) {
		this.productId = pid;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(BigDecimal bigDecimal) {
		this.productPrice = bigDecimal;
	}

	public int getProductQuantity() {
		return this.productQuantity;
	}

	public void setProductQuantity(int i) {
		this.productQuantity = i;
	}

	public BigDecimal getTotalPrice() {
		return this.totalPrice;
	}

	public BigDecimal setTotalPrice(BigDecimal bigDecimal) {
		return this.totalPrice = bigDecimal;
	}



}