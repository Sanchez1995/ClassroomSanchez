package com.qa.DBRTests;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.qa.persistence.repository.TrainerDBRepository;
import com.qa.util.JSONUtil;

public class TrainerDBRepositoryTest {
	
	@InjectMocks
	private TrainerDBRepository repo;

	@Mock
	private EntityManager manager;

	@Mock
	private Query query;

	private JSONUtil util;
	
	/*@Test
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
*/
}
