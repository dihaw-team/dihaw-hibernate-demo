package com.dihaw.inheritance1.withSingleTableStrategy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Car")		// to use 'Car' name instead of 'FourWheeler' in the 'Dtype' (VEHICULE_TYPE) Column
@Table(name="INH_ST_FOUR_WHEELER")
public class FourWheeler_ST extends Vehicule_ST{
	
	//volant
	@Column(name="STEERING_WHELL")
	private String steeringWhell;

	public String getSteeringWhell() {
		return steeringWhell;
	}

	public void setSteeringWhell(String steeringWhell) {
		this.steeringWhell = steeringWhell;
	}
	
	

}
