package com.dihaw.ManyToMany;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="MTM_USER_DETAILS")
public class UserDetailsMTM {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int id;
	
	@Column(name="USER_NAME")
	private String userName;
	
	/***********************************************************************************************************
	 *****								ManyToMany bidirectional association			   				   *****
	 ***********************************************************************************************************
		If the association is bidirectional, one side has to be the owner and one side has to be the inverse end
		(ie. it will be ignored when updating the relationship values in the association table):
		The side which has the mappedBy attribute is the inverse side.
		The side which doesn't have the mappedBy attribute is the owner.
	 ***********************************************************************************************************/
	
	@ManyToMany
	@JoinTable(
			name="MTM_USER_VEHICULE",
			joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="USER_ID")},
			inverseJoinColumns={@JoinColumn(name="VEHICULE_ID", referencedColumnName="VEHICULE_ID")})
	private Collection<VehiculeMTM> vehiculeList;
	
	public Collection<VehiculeMTM> getVehiculeList() {
		return vehiculeList;
	}
	public void setVehiculeList(Collection<VehiculeMTM> vehiculeList) {
		this.vehiculeList = vehiculeList;
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
