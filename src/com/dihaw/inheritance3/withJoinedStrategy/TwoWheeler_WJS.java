package com.dihaw.inheritance3.withJoinedStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="INH_WJS_TWO_WHEELER")
public class TwoWheeler_WJS extends Vehicule_WJS{
	
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
