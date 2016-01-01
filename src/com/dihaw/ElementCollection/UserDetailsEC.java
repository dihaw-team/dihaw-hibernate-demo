package com.dihaw.ElementCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EC_USER_DETAILS")
public class UserDetailsEC {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int id;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="EC_USER_ADDRESS",
				joinColumns=@JoinColumn(name="USER_ID"))
	/** using hibernate annotations: GenericGenerator, CollectionId, Type*/
//	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
//	@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type = "long"))
	private Collection<Address> addressList = new ArrayList<Address>();
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Collection<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(Collection<Address> addressList) {
		this.addressList = addressList;
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
