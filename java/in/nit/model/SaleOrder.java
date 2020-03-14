package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sordertab")
public class SaleOrder {
	@Id
	@GeneratedValue
	@Column(name="saleId")
	private Integer saleId;
	@Column(name = "ordrcode")
	private String orderCode;
	@ManyToOne
	@JoinColumn(name = "shipIdFk")
	private ShipmentType shipmentCode;
	@ManyToOne
	@JoinColumn(name="customerIdFk")
	private WhType customer;
	@Column(name = "refeNumber")
	private String refNumber;
	@Column(name = "stockMode")
	private String stockMode;
	@Column(name = "stockSource")
	private String stockSource;
	@Column(name = "note")
	private String description;

	public SaleOrder() {
		super();
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public ShipmentType getShipmentCode() {
		return shipmentCode;
	}

	public void setShipmentCode(ShipmentType shipmentCode) {
		this.shipmentCode = shipmentCode;
	}

	public WhType getCustomer() {
		return customer;
	}

	public void setCustomer(WhType customer) {
		this.customer = customer;
	}

	public String getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}

	public String getStockMode() {
		return stockMode;
	}

	public void setStockMode(String stockMode) {
		this.stockMode = stockMode;
	}

	public String getStockSource() {
		return stockSource;
	}

	public void setStockSource(String stockSource) {
		this.stockSource = stockSource;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "SaleOrder [saleId=" + saleId + ", orderCode=" + orderCode + ", shipmentCode=" + shipmentCode
				+ ", customer=" + customer + ", refNumber=" + refNumber + ", stockMode=" + stockMode + ", stockSource="
				+ stockSource + ", description=" + description + "]";
	}
	
}
