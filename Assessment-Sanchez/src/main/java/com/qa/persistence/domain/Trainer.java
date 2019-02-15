package com.qa.persistence.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.hibernate.mapping.Set;

@Entity
@Table (name = "trainer") 
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long trainerID;
	@Column
	private String trainerFirstName;
	@Column
	private String trainerLastName;
	@OneToMany (mappedBy = "trainer", cascade = CascadeType.ALL)
	private Set classrooomID;

	public Trainer() {

	}

	public Trainer(Long trainerID, String trainerFirstName, String trainerLastName, Set classroomID) {
		super();
		this.trainerID = trainerID;
		this.trainerFirstName = trainerFirstName;
		this.trainerLastName = trainerLastName;
		this.classrooomID = classroomID;

	}

	public Long getTrainerID() {
		return trainerID;
	}

	public void setTrainerID(Long trainerID) {
		this.trainerID = trainerID;
	}

	public String getTrainerFirstName() {
		return trainerFirstName;
	}

	public void setTrainerFirstName(String trainerFirstName) {
		this.trainerFirstName = trainerFirstName;
	}

	public String getTrainerLastName() {
		return trainerLastName;
	}

	public void setTrainerLastName(String trainerLastName) {
		this.trainerLastName = trainerLastName;
	}

	public Set getClassrooomID() {
		return classrooomID;
	}

	public void setClassrooomID(Set classrooomID) {
		this.classrooomID = classrooomID;
	}


}
