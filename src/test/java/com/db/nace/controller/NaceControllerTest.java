package com.db.nace.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.db.nace.model.Activities;
import com.db.nace.service.NaceService;
import com.db.nace.testhelper.TestHelper;

@RunWith(MockitoJUnitRunner.class)
public class NaceControllerTest {

	@InjectMocks
	private NaceController mockNaceController;
	@Mock
	private NaceService mockNaceService;

	@Test
	public void testGetNaceDetailsByOrder_order_found() {

		ResponseEntity<Activities> value = new ResponseEntity<>(TestHelper.getActivities(), HttpStatus.OK);
		Mockito.when(mockNaceService.findNaceDetailsByOrder(Mockito.anyString())).thenReturn(value);
		ResponseEntity<Activities> naceDetailsByOrder = mockNaceController.getNaceDetailsByOrder("1234");
		assertEquals("This order should be equal ", naceDetailsByOrder.getBody().getOrder(), "1234");
	}

	@Test
	public void testAddNaceDetails_details_added() {
		ResponseEntity<Activities> value = new ResponseEntity<>(TestHelper.getActivities(), HttpStatus.CREATED);
		Mockito.when(mockNaceService.addNaceDetails(Mockito.any(Activities.class))).thenReturn(value);
		ResponseEntity<Activities> addNaceDetails = mockNaceController.addNaceDetails(TestHelper.getActivities());
		assertEquals("This status should be equal ", addNaceDetails.getStatusCode(), HttpStatus.CREATED);
	}
}
