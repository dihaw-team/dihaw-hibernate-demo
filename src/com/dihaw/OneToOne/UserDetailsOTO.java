package com.dihaw.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OTO_USER_DETAILS")
public class UserDetailsOTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int id;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="user")
	private VehiculeOTO vehicule;
	
	public VehiculeOTO getVehicule() {
		return vehicule;
	}
	public void setVehicule(VehiculeOTO vehicule) {
		this.vehicule = vehicule;
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
