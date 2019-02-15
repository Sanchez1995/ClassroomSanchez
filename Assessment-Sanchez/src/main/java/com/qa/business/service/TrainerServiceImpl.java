package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.TrainerRepository;

public class TrainerServiceImpl implements TrainerService {

	@Inject
	private TrainerRepository repo;

	public String createTrainer(String trainer) {
		return repo.createTrainer(trainer);
	}

	public String getAllTrainers() {
		return repo.getAllTrainers();
	}

	public String updateTrainer(Long classroomID, String trainer) {
		return repo.updateTrainer(classroomID, trainer);
	}

	public String deleteTrainer(Long classroomID) {
		return repo.deleteTrainer(classroomID);
	}

}
