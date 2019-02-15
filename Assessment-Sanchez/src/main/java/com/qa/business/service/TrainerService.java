package com.qa.business.service;

public interface TrainerService {
	
	// C
	String createTrainer(String trainer);

	// R
	String getAllTrainers();

	// U
	String updateTrainer(Long classroomID, String trainer);

	// D
	

	String deleteTrainer(Long classroomID);


}
