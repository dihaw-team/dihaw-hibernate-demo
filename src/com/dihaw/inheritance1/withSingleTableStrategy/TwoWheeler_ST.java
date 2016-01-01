package com.dihaw.inheritance1.withSingleTableStrategy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Bike") 	// to use 'Bake' name instead of 'TwoWheeler' in the 'Dtype' (VEHICULE_TYPE) Column
@Table(name="INH_ST_TWO_WHEELER")
public class TwoWheeler_ST extends Vehicule_ST{
	
	//guidon
	@Column(name="STEERING_HANDLE")
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
	
	

}
