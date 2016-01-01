package com.dihaw.inheritance2.withTablePerClassStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) // Inheritance Type : TABLE_PER_CLASS
@Table(name="INH_WTPC_VEHICULE")
public class Vehicule_WTPC {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="VEHICULE_ID")
	private int vehiculeId;
	
	@Column(name="VEHICULE_NAME")
	private String vehiculeName;
	
	@Column(name="LICENSE_NUMBER")
	private int licenseNumber;

	public int getVehiculeId() {
		return vehiculeId;
	}

	public void setVehiculeId(int vehiculeId) {
		this.vehiculeId = vehiculeId;
	}

	public String getVehiculeName() {
		return vehiculeName;
	}

	public void setVehiculeName(String vehiculeName) {
		this.vehiculeName = vehiculeName;
	}

	public int getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

}
