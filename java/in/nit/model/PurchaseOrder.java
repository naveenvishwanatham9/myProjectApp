package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pordertab")
public class PurchaseOrder {
	@Id
	@GeneratedValue
	@Column(name="partId")
	private Integer partId;
	@Column(name = "ordercode")
	private String orderCode;
	@ManyToOne
	@JoinColumn(name = "shipmentIdFk")
	private ShipmentType shipmentCode;
	@ManyToOne
	@JoinColumn(name="vendorIdFk")
	private WhType vendor;
	@Column(name = "refNumber")
	private String refNumber;
	@Column(name = "qualityCheck")
	private String qualityCheck;
	@Column(name = "defStatus")
	private String defaultStatus;
	@Column(name = "note")
	private String description;

	public PurchaseOrder() {
		super();
	}
	

	public Integer getPartId() {
		return partId;
	}


	public void setPartId(Integer partId) {
		this.partId = partId;
	}


	public WhType getVendor() {
		return vendor;
	}

	public void setVendor(WhType vendor) {
		this.vendor = vendor;
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

	public String getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}

	public String getQualityCheck() {
		return qualityCheck;
	}

	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}

	public String getDefaultStatus() {
		return defaultStatus;
	}

	public void setDefaultStatus(String defaultStatus) {
		this.defaultStatus = defaultStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [partId=" + partId + ", orderCode=" + orderCode + ", shipmentCode=" + shipmentCode
				+ ", vendor=" + vendor + ", refNumber=" + refNumber + ", qualityCheck=" + qualityCheck
				+ ", defaultStatus=" + defaultStatus + ", description=" + description + "]";
	}


}
