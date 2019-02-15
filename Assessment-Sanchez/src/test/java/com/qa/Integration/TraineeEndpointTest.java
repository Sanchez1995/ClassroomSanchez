package com.qa.Integration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.business.service.TraineeService;
import com.qa.rest.TraineeEndpoint;

@RunWith(MockitoJUnitRunner.class)
public class TraineeEndpointTest {

	private static final String MOCK_VALUE = "test_value";

	private static final String MOCK_VALUE2 = "test_value_2";

	@InjectMocks
	private TraineeEndpoint endpoint;

	@Mock
	private TraineeService service;

	@Before
	public void setup() {
		endpoint.setService(service);
	}

	@Test
	public void testGetAllTrainees() {
		Mockito.when(service.getAllTrainees()).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.getAllTrainees());
	}

	@Test
	public void testCreateTrainee() {
		Mockito.when(service.createTrainee(MOCK_VALUE)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.createTrainee(MOCK_VALUE));
		Mockito.verify(service).createTrainee(MOCK_VALUE);

	}

	@Test
	public void testUpdateTrainee() {

	}

	@Test
	public void testDeleteTrainee() {
		Mockito.when(service.deleteTrainee(1L)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.deleteTrainee(1L));
		Mockito.verify(service).deleteTrainee(1L);

	}

}
