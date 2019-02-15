package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public abstract class TraineeDBRepository implements TraineeRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public String createTrainee(String trainee) {

		Trainee aTrainee = util.getObjectForJSON(trainee, Trainee.class);
		manager.persist(aTrainee);
		return "{\"message\": \"trainee has been sucessfully created\"}";

	}

	public String getAllTrainees() {
		Query query = manager.createQuery("Select a FROM Trainee a");
		Collection<Trainee> trainees = (Collection<Trainee>) query.getResultList();
		return util.getJSONForObject(trainees);

	}

	@Transactional(REQUIRED)
	public String updateTrainee(Long traineeID, String trainee) {
		if (manager.contains(manager.find(Trainee.class, traineeID))) {
			deleteTrainee(traineeID);
			createTrainee(trainee);
		}
		return "{\"message\": \"trainee sucessfully updated\"}";
	}

	@Transactional(REQUIRED)
	public String deleteTrainee(Long traineeID) {
		if (manager.contains(manager.find(Trainee.class, traineeID))) {
			manager.remove(manager.find(Trainee.class, traineeID));
		}

		return "{\"message\": \"trainee sucessfully deleted\"}";

	}

	public JSONUtil getUtil() {
		return util;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
		
	}

}
