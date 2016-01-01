package com.dihaw.inheritance2.withTablePerClassStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="INH_WTPC_FOUR_WHEELER")
public class FourWheeler_WTPC extends Vehicule_WTPC{
	
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
