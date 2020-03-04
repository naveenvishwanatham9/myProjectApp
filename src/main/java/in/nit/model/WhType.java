package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="whtptab")
public class WhType {
	@Id
	@GeneratedValue
	@Column(name="urid")
	private Integer userId;
	@Column(name="uType")
	private String userType;
	@Column(name="ucode")
	private String userCode;
	//@Column(name="uFor")
	//private String userFor;
	@Column(name="uemail")
	private String userEmail;
	@Column(name="ucontact")
	private Long userContact;
	@Column(name="uidtype")
	private String userIdType;
	@Column(name="other")
	private String ifOther;
	@Column(name="idnumber")
	private String idNumber;
	
	
	public WhType() {
		super();
	}
	

	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Long getUserContact() {
		return userContact;
	}
	public void setUserContact(Long userContact) {
		this.userContact = userContact;
	}
	public String getUserIdType() {
		return userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}
	public String getIfOther() {
		return ifOther;
	}
	public void setIfOther(String ifOther) {
		this.ifOther = ifOther;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	@Override
	public String toString() {
		return "WhType [userId=" + userId + ", userType=" + userType + ", userCode=" + userCode + ", userEmail="
				+ userEmail + ", userContact=" + userContact + ", userIdType=" + userIdType + ", ifOther=" + ifOther
				+ ", idNumber=" + idNumber + "]";
	}

}
