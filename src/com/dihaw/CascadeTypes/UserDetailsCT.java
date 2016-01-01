package com.dihaw.CascadeTypes;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CT_USER_DETAILS")
public class UserDetailsCT {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int id;
	
	@Column(name="USER_NAME")
	private String userName;
	
	/**
		Use CascadeType.PERSIST to not return this error if we tray to save a UserDetails without saving a Vehicules Entity
		org.hibernate.TransientObjectException: object references an unsaved transient instance 
		- save the transient instance before flushing: com.dihaw.cascade.types.VehiculeCT
		
		And use session.persist(user) not session.save(user)
	*/
	//	http://openjpa.apache.org/builds/2.4.0/apache-openjpa/docs/jpa_overview_meta_field.html#jpa_overview_meta_cascade
	/**
		CascadeType.PERSIST: 	When persisting an entity, also persist the entities held in this field. 
								We suggest liberal application of this cascade rule, because if the EntityManager finds 
								a field that references a new entity during flush, 
								and the field does not use CascadeType.PERSIST, it is an error.
		CascadeType.REMOVE: 	When deleting an entity, also delete the entities held in this field.
		CascadeType.REFRESH: 	When refreshing an entity, also refresh the entities held in this field.
		CascadeType.MERGE: 		When merging entity state, also merge the entities held in this field.
	*/
	
	@OneToMany(cascade=CascadeType.PERSIST)
	private Collection<VehiculeCT> vehicules = new ArrayList<VehiculeCT>();
	
	public Collection<VehiculeCT> getVehicules() {
		return vehicules;
	}
	
	public void setVehicules(Collection<VehiculeCT> vehicules) {
		this.vehicules = vehicules;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
