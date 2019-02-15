package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.TraineeRepository;

public class TraineeServiceImpl implements TraineeService {

	@Inject
	private TraineeRepository repo;

	public String createTrainee(String trainee) {
		return repo.createTrainee(trainee);
	}

	public String getAllTrainees() {
		return repo.getAllTrainees();
	}

	public String updateTrainee(Long traineeID, String trainee) {
		return repo.updateTrainee(traineeID, trainee);
	}

	public String deleteTrainee(Long traineeID) {
		return repo.deleteTrainee(traineeID);
	}

}
