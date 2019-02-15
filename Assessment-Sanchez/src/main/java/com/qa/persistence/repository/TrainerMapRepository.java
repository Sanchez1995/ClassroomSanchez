package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.qa.persistence.domain.Trainer;
import com.qa.util.JSONUtil;

@Alternative
public class TrainerMapRepository implements TrainerRepository {

	@Inject
	private JSONUtil util = new JSONUtil();

	Map<Long, Trainer> trainerMap = new HashMap<Long, Trainer>();

	public String createTrainer(String trainer) {
		Trainer aTrainer = util.getObjectForJSON(trainer, Trainer.class);
		trainerMap.put(aTrainer.getTrainerID(), aTrainer);
		return "Trainer created";
	}

	public String getAllTrainers() {
		return util.getJSONForObject(trainerMap.values());
	}

	public String updateTrainer(Long trainerID, String trainer) {
		Trainer aTrainer = util.getObjectForJSON(trainer, Trainer.class);
		trainerMap.replace(trainerID, aTrainer);
		return "Trainer has been updated";
	}

	public String deleteTrainer(Long trainerID) {
		trainerMap.remove(trainerID);
		return "Trainer has been deleted";
	}

}
