package com.qa.persistence.repository;

public interface TraineeRepository {
	// C
	String createTrainee(String trainee);

	// R
	String getAllTrainees();

	// U
	String updateTrainee(Long traineeID, String trainee);

	// D
	String deleteTrainee(Long traineeID);

}
