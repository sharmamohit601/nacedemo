package com.db.nace.service;

import org.springframework.http.ResponseEntity;

import com.db.nace.model.Activities;

public interface NaceService {

	ResponseEntity<Activities> findNaceDetailsByOrder(String id);

	ResponseEntity<Activities> addNaceDetails(Activities activities);

}
