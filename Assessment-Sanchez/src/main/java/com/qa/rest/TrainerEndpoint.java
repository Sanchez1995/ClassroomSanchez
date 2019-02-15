package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.business.service.TrainerService;

@Path("trainer")
public class TrainerEndpoint {

	@Inject
	private TrainerService service;

	// C
	@Path("/createTrainer")
	@GET
	@Produces({ "application/json" })
	public String createTrainer(String trainer) {
		return service.createTrainer(trainer);
	}

	// R
	@Path("/getAllTrainers")
	@GET
	@Produces({ "application/json" })
	public	String getAllTrainers() {
		return service.getAllTrainers();
	}

	// U
	@Path("/updateTrainer")
	@GET
	@Produces({ "application/json" })
	public String updateTrainer(Long trainerID, String trainer) {
		return service.updateTrainer(trainerID, trainer);
	}

	// D
	@Path("/deleteTrainer")
	@GET
	@Produces({ "application/json" })
	public String deleteTrainer(Long classroomID) {
		return service.deleteTrainer(classroomID);
	}

	public void setService(TrainerService service) {
		this.service = service;
		
	}

}
