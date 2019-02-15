package com.qa.DBRTests;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.qa.persistence.domain.Trainee;
import com.qa.persistence.repository.TraineeDBRepository;
import com.qa.util.JSONUtil;

public class TraineeDBRepositoryTest {

	@InjectMocks
	private TraineeDBRepository repo;

	@Mock
	private EntityManager manager;

	@Mock
	private Query query;

	private JSONUtil util;

	private static final String MOCK_DATA_ARRAY = "[{\"title\":\"Alien\",\"ageRating\":\"15\"}]";

	private static final String MOCK_OBJECT = "{\"title\":\"Alien\",\"ageRating\":\"15\"}";

	@Before
	public void setup() {
		repo.setManager(manager);
		util = new JSONUtil();
		repo.setUtil(util);
	}

	@Test
	public void testGetAllTrainees() {
		Mockito.when(manager.createQuery(Mockito.anyString())).thenReturn(query);
		List<Trainee> trainees = new ArrayList<Trainee>();
		trainees.add(new Trainee(null, "Alien", "15", 0));
		Mockito.when(query.getResultList()).thenReturn(trainees);
		System.out.println(repo.getAllTrainees());
		Assert.assertEquals(MOCK_DATA_ARRAY, repo.getAllTrainees());
	}
}

/*
 * @Test public void testCreateTrainee() {
 * Mockito.when(service.createTrainee(MOCK_VALUE)).thenReturn(MOCK_VALUE);
 * Assert.assertEquals(MOCK_VALUE, endpoint.createTrainee(MOCK_VALUE));
 * Mockito.verify(service).createTrainee(MOCK_VALUE);
 * 
 * }
 * 
 * @Test public void testUpdateTrainee() {
 * 
 * }
 * 
 * @Test public void testDeleteTrainee() {
 * Mockito.when(service.deleteTrainee(1L)).thenReturn(MOCK_VALUE);
 * Assert.assertEquals(MOCK_VALUE, endpoint.deleteTrainee(1L));
 * Mockito.verify(service).deleteTrainee(1L);
 * 
 * }
 * 
 * 
 * }
 */