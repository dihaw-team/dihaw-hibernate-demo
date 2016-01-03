package com.dihaw.inheritance2.withTablePerClassStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="INH_TPC_FOUR_WHEELER")
public class FourWheeler_TPC extends Vehicule_TPC{
	
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
