package com.dihaw.ManyToOne;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MTO_USER_DETAILS")
public class UserDetailsMTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int id;
	
	@Column(name="USER_NAME")
	private String userName;
	
	
	/** OneToMany using a JoinTable annotation */
	@OneToMany
	@JoinTable(	
			name="MTO_USER_VEHICULE",
			joinColumns={ @JoinColumn(name="USER_ID", referencedColumnName="USER_ID") },
			inverseJoinColumns={ @JoinColumn(name="VEHICULE_ID", referencedColumnName="VEHICULE_ID") })
	private Collection<VehiculeMTO> vehicules = new ArrayList<VehiculeMTO>();
	
/*
	@OneToMany(mappedBy="user")
	private Collection<VehiculeMTO> vehicules = new ArrayList<VehiculeMTO>();
*/	
	public Collection<VehiculeMTO> getVehicules() {
		return vehicules;
	}
	
	public void setVehicules(Collection<VehiculeMTO> vehicules) {
		this.vehicules = vehicules;
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
