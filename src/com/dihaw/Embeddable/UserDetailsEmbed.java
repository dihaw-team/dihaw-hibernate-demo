package com.dihaw.Embeddable;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EMB_USER_DETAILS")
public class UserDetailsEmbed {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int id;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column = @Column(name="HOME_STREET")),
		@AttributeOverride(name="city", column = @Column(name="HOME_CITY")),
		@AttributeOverride(name="state", column = @Column(name="HOME_STATE")),
		@AttributeOverride(name="pinCode", column = @Column(name="HOME_PIN_CODE"))
	})
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column = @Column(name="OFFICE_STREET")),
		@AttributeOverride(name="city", column = @Column(name="OFFICE_CITY")),
		@AttributeOverride(name="state", column = @Column(name="OFFICE_STATE")),
		@AttributeOverride(name="pinCode", column = @Column(name="OFFICE_PIN_CODE"))
	})
	private Address officeAddress;


	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
