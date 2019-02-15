package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.business.service.TraineeService;

@Path("trainee")
public class TraineeEndpoint {

		@Inject
		private TraineeService service;

		// C
		@Path("/createTrainee")
		@GET
		@Produces({ "application/json" })
		public String createTrainee(String trainee) {
			return service.createTrainee(trainee);
		}

		// R
		@Path("/getAllTrainees")
		@GET
		@Produces({ "application/json" })
		public String getAllTrainees() {
			return service.getAllTrainees();
		}

		// U
		@Path("/updateTrainee")
		@GET
		@Produces({ "application/json" })
		public String updateTrainee(Long traineeID, String trainee) {
			return service.updateTrainee(traineeID, trainee);
		}

		// D
		@Path("/deleteTrainee")
		@GET
		@Produces({ "application/json" })
		public String deleteTrainee(Long traineeID) {
			return service.deleteTrainee(traineeID);
		}

		public void setService(TraineeService service) {
			this.service = service;
			
		}


}
