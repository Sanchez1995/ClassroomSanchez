package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;

public class TraineeMapRepository implements TraineeRepository {

	@Inject
	private JSONUtil util = new JSONUtil();

	Map<Long, Trainee> traineeMap = new HashMap<Long, Trainee>();

	public String createTrainee(String trainee) {
		Trainee aTrainee = util.getObjectForJSON(trainee, Trainee.class);
		traineeMap.put(aTrainee.getTraineeID(), aTrainee);
		return "Trainer created";
	}

	public String getAllTrainees() {

		return util.getJSONForObject(traineeMap.values());

	}

	public String updateTrainee(Long traineeID, String trainee) {
		Trainee aTrainee = util.getObjectForJSON(trainee, Trainee.class);
		traineeMap.replace(traineeID, aTrainee);
		return "Trainee has been updated";
	}

	public String deleteTrainee(Long traineeID) {
		traineeMap.remove(traineeID);
		return "Trainee has been deleted";
	}

}
