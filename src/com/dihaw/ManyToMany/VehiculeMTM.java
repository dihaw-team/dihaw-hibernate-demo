package com.dihaw.ManyToMany;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="MTM_VEHICULE")
public class VehiculeMTM {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="VEHICULE_ID")
	private int vehiculeId;
	
	@Column(name="VEHICULE_NAME")
	private String vehiculeName;
	
	/***********************************************************************************************************
	 *****								ManyToMany bidirectional association			   				   *****
	 ***********************************************************************************************************
		If the association is bidirectional, one side has to be the owner and one side has to be the inverse end 
		(ie. it will be ignored when updating the relationship values in the association table):
		The side which has the mappedBy attribute is the inverse side. 
		The side which doesn't have the mappedBy attribute is the owner.
	 ***********************************************************************************************************/
	
	@ManyToMany(mappedBy="vehiculeList")
	private Collection<UserDetailsMTM> userList;


	public Collection<UserDetailsMTM> getUserList() {
		return userList;
	}

	public void setUserList(Collection<UserDetailsMTM> userList) {
		this.userList = userList;
	}

	public String getVehiculeName() {
		return vehiculeName;
	}

	public void setVehiculeName(String vehiculeName) {
		this.vehiculeName = vehiculeName;
	}

	public int getVehiculeId() {
		return vehiculeId;
	}

	public void setVehiculeId(int vehiculeId) {
		this.vehiculeId = vehiculeId;
	}

}
