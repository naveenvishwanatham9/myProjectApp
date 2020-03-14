package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="parttab")
public class Part {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="ptcode")
	private String partCode;
	@Column(name="ptlen")
private Double partLen;
	@Column(name="ptwid")
private Double partWid;
	@Column(name="pthgt")
private Double partHgt;
	@Column(name="ptcost")
private Double baseCost;
	@Column(name="ptcurrency")
private String baseCurrency;
	@Column(name="ptnote")
private String note;
	@ManyToOne
	@JoinColumn(name="uomIdFk")
private UomType uomOb;

	@ManyToOne
	@JoinColumn(name="orderSaleIdFk")
private OrderMethod omSaleOb;

	@ManyToOne
	@JoinColumn(name="orderPurchaseIdFk")
private OrderMethod omPurchaseOb;

	
	public Part() {
		super();
	}
	
	public OrderMethod getOmSaleOb() {
		return omSaleOb;
	} 

	public OrderMethod getOmPurchaseOb() {
		return omPurchaseOb;
	}

	public void setOmPurchaseOb(OrderMethod omPurchaseOb) {
		this.omPurchaseOb = omPurchaseOb;
	}

	public void setOmSaleOb(OrderMethod omSaleOb) {
		this.omSaleOb = omSaleOb;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPartCode() {
		return partCode;
	}
	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}
	public Double getPartLen() {
		return partLen;
	}
	public void setPartLen(Double partLen) {
		this.partLen = partLen;
	}
	public Double getPartWid() {
		return partWid;
	}
	public void setPartWid(Double partWid) {
		this.partWid = partWid;
	}
	public Double getPartHgt() {
		return partHgt;
	}
	public void setPartHgt(Double partHgt) {
		this.partHgt = partHgt;
	}
	public Double getBaseCost() {
		return baseCost;
	}
	public void setBaseCost(Double baseCost) {
		this.baseCost = baseCost;
	}
	public String getBaseCurrency() {
		return baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public UomType getUomOb() {
		return uomOb;
	}
	public void setUomOb(UomType uomOb) {
		this.uomOb = uomOb;
	}

	@Override
	public String toString() {
		return "Part [id=" + id + ", partCode=" + partCode + ", partLen=" + partLen + ", partWid=" + partWid
				+ ", partHgt=" + partHgt + ", baseCost=" + baseCost + ", baseCurrency=" + baseCurrency + ", note="
				+ note + ", uomOb=" + uomOb + ", omSaleOb=" + omSaleOb + ", omPurchaseOb=" + omPurchaseOb + "]";
	}

	
}
