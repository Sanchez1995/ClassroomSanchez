package com.qa.persistence.repository;

public interface TrainerRepository {
	// C
	String createTrainer(String trainer);

	// R
	String getAllTrainers();

	// U
	String updateTrainer(Long classroomID, String trainer);

	// D
	

	String deleteTrainer(Long classroomID);

}
