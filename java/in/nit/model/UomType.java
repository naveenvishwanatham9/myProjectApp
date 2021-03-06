package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="uomtable")
public class UomType {
	@Id
	@GeneratedValue
	@Column(name = "uomid")
	private Integer uomId;
	@Column(name = "uomtype")
	private String umType;
	
	@Column(name = "uommodel")
	private String uomModel;
	@Column(name = "uomdesc")
	private String uomDesc;
	public UomType() {
	}
	public UomType(Integer id) {
	}
	public Integer getUomId() {
		return uomId;
	}
	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}
	public String getUmType() {
		return umType;
	}
	public void setUmType(String umType) {
		this.umType = umType;
	}
	public String getUomModel() {
		return uomModel;
	}
	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}
	public String getUomDesc() {
		return uomDesc;
	}
	public void setUomDesc(String uomDesc) {
		this.uomDesc = uomDesc;
	}
	@Override
	public String toString() {
		return "UomType [uomId=" + uomId + ", umType=" + umType + ", uomModel=" + uomModel + ", uomDesc=" + uomDesc
				+ "]";
	}
	
}
