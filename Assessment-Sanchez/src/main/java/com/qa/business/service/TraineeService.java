package com.qa.business.service;

public interface TraineeService {
	
	// C
		String createTrainee(String trainee);

		// R
		String getAllTrainees();

		// U
		String updateTrainee(Long traineeID, String trainee);

		// D
		String deleteTrainee(Long traineeID);


}
