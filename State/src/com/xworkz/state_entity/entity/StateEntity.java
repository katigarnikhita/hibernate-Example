package com.xworkz.state_entity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="state_details12")
public class StateEntity {
	
	@Id 
	@Column (name = "s_id")
	private int id;
	@Column (name = "s_name")
	private String name;
	@Column (name = "s_no_of_dist")
	private int noOfDistict;
	@Column (name = "s_capital")
	private String capitalCity;
	
	public StateEntity() {
		// TODO Auto-generated constructor stub
	}

	public StateEntity(int id, String name, int noOfDistict, String capitalCity) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDistict = noOfDistict;
		this.capitalCity = capitalCity;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StateEntity other = (StateEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StateEntity [id=" + id + ", name=" + name + ", noOfDistict=" + noOfDistict + ", capitalCity="
				+ capitalCity + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfDistict() {
		return noOfDistict;
	}

	public void setNoOfDistict(int noOfDistict) {
		this.noOfDistict = noOfDistict;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	
}
