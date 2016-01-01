package com.dihaw.inheritance3.withJoinedStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="INH_WJS_FOUR_WHEELER")
public class FourWheeler_WJS extends Vehicule_WJS{
	
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
