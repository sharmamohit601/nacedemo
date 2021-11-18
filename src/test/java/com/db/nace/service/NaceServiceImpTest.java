package com.db.nace.service;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.db.nace.dto.ActivitiesDto;
import com.db.nace.model.Activities;
import com.db.nace.repo.NaceRepository;
import com.db.nace.testhelper.TestHelper;

@RunWith(MockitoJUnitRunner.class)
public class NaceServiceImpTest {

	@InjectMocks
	private NaceServiceImp mockNaceServiceImp;
	@Mock
	private NaceRepository mockMaceRepository;

	@Test
	public void testFindNaceDetailsByOrder_record_found() {

		Optional<ActivitiesDto> value = Optional.of(TestHelper.getActivitiesDto());
		Mockito.when(mockMaceRepository.findById(Mockito.anyString())).thenReturn(value);
		ResponseEntity<Activities> findNaceDetailsByOrder = mockNaceServiceImp.findNaceDetailsByOrder("1234");
		assertEquals("This order should be equal ", findNaceDetailsByOrder.getBody().getOrder(), "1234");
	}

	@Test
	public void testAddNaceDetails_record_add() {
		Mockito.when(mockMaceRepository.save(Mockito.any(ActivitiesDto.class)))
				.thenReturn(TestHelper.getActivitiesDto());
		ResponseEntity<Activities> addNaceDetails = mockNaceServiceImp.addNaceDetails(TestHelper.getActivities());
		assertEquals("This status should be equal ", addNaceDetails.getStatusCode(), HttpStatus.CREATED);
	}

}
