package com.dihaw.CascadeTypes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CT_VEHICULE")
public class VehiculeCT {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="VEHICULE_ID")
	private int vehiculeId;
	
	@Column(name="VEHICULE_NAME")
	private String vehiculeName;

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
