package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long traineeID;
	@Column
	private String traineeFirstName;
	@Column
	private String traineeLastName;

	public Trainee() {

	}

	public Trainee(Long traineeID, String traineeFirstName, String traineeLastName) {
		super();
		this.traineeID = traineeID;
		this.traineeFirstName = traineeFirstName;
		this.traineeLastName = traineeLastName;
	}

	public Long getTraineeID() {
		return traineeID;
	}

	public void setTraineeID(Long traineeID) {
		this.traineeID = traineeID;
	}

	public String getTraineeFirstName() {
		return traineeFirstName;
	}

	public void setTraineeFirstName(String traineeFirstName) {
		this.traineeFirstName = traineeFirstName;
	}

	public String getTraineeLastName() {
		return traineeLastName;
	}

	public void setTraineeLastName(String traineeLastName) {
		this.traineeLastName = traineeLastName;
	}

}
