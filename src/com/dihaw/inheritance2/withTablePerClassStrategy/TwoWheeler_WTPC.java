package com.dihaw.inheritance2.withTablePerClassStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="INH_WTPC_TWO_WHEELER")
public class TwoWheeler_WTPC extends Vehicule_WTPC{
	
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
