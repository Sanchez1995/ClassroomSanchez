package com.qa.Integration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.business.service.TrainerService;
import com.qa.rest.TrainerEndpoint;

@RunWith(MockitoJUnitRunner.class)
public class TrainerEndpointTest {

	private static final String MOCK_VALUE = "test_value";


	@InjectMocks
	private TrainerEndpoint endpoint;

	@Mock
	private TrainerService service;

	@Before
	public void setup() {
		endpoint.setService(service);
	}

	@Test
	public void testGetAllTrainers() {
		Mockito.when(service.getAllTrainers()).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.getAllTrainers());
	}

	@Test
	public void testCreateTrainer() {
		Mockito.when(service.createTrainer(MOCK_VALUE)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.createTrainer(MOCK_VALUE));
		Mockito.verify(service).createTrainer(MOCK_VALUE);

	}

	@Test
	public void testUpdateTrainee() {

	}

	@Test
	public void testDeleteTrainee() {
		Mockito.when(service.deleteTrainer(1L)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.deleteTrainer(1L));
		Mockito.verify(service).deleteTrainer(1L);

	}
}
