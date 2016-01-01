package com.dihaw.inheritance1.withSingleTableStrategy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) // Inheritance Type : SINGLE_TABLE

/**	@DiscriminatorColumn	to change the default column 'Dtype' to 'VEHICULE_TYPE', 
							the 'Dtype' is the name of the instance Type */
@DiscriminatorColumn(name="VEHICULE_TYPE",discriminatorType=DiscriminatorType.STRING)

@DiscriminatorValue("vehicule")		// to use 'vehicule' name instead of 'Vehicule' in the 'Dtype' (VEHICULE_TYPE) Column
@Table(name="INH_ST_VEHICULE")
public class Vehicule_ST {
	
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
