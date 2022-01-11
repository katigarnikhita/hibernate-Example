package com.xworkz.patient_entity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_info1")
public class PatientEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="age")
	private int age;
	@Column(name="bedNo")
	private int bedNo;
	@Column(name="name")
	private String name;
	@Column(name="birthPlace")
	private String birthPlace;
	
	PatientEntity()
	{
		
	}

	public PatientEntity(int id, int age, int bedNo, String name, String birthPlace) {
		super();
		this.id = id;
		this.age = age;
		this.bedNo = bedNo;
		this.name = name;
		this.birthPlace = birthPlace;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBedname() {
		return bedNo;
	}

	public void setBedname(int bedname) {
		this.bedNo = bedname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	@Override
	public String toString() {
		return "PatientEntity [id=" + id + ", age=" + age + ", bedname=" + bedNo+ ", name=" + name + ", birthPlace="
				+ birthPlace + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + bedNo;
		result = prime * result + ((birthPlace == null) ? 0 : birthPlace.hashCode());
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
		PatientEntity other = (PatientEntity) obj;
		if (age != other.age)
			return false;
		if (bedNo != other.bedNo)
			return false;
		if (birthPlace == null) {
			if (other.birthPlace != null)
				return false;
		} else if (!birthPlace.equals(other.birthPlace))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
