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

import com.qa.persistence.domain.Trainer;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public abstract class TrainerDBRepository implements TrainerRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	
	@Transactional(REQUIRED)
	public String createTrainer(String trainer) {
		Trainer aTrainer = util.getObjectForJSON(trainer, Trainer.class);
		manager.persist(aTrainer);
		return "{\"message\": \"trainer has been sucessfully created\"}";
	}

	public String getAllTrainers() {
		Query query = manager.createQuery("Select a FROM Trainer a");
		Collection<Trainer> trainers = (Collection<Trainer>) query.getResultList();
		return util.getJSONForObject(trainers);
	}

	@Transactional(REQUIRED)
	public String updateTrainer(Long classroomID, String trainer) {
		if (manager.contains(manager.find(Trainer.class, classroomID))) {
			deleteTrainer(classroomID);
			createTrainer(trainer);
		}
		return "{\"message\": \"trainer sucessfully updated\"}";
	}

	@Transactional(REQUIRED)
	public String deleteTrainer(Long classroomID) {
		if (manager.contains(manager.find(Trainer.class, classroomID))) {
			manager.remove(manager.find(Trainer.class, classroomID));
		}

		return "{\"message\": \"trainer sucessfully deleted\"}";
	}

	public JSONUtil getUtil() {
		return util;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

}
