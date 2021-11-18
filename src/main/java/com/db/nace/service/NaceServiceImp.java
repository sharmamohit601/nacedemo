package com.db.nace.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.db.nace.dto.ActivitiesDto;
import com.db.nace.model.Activities;
import com.db.nace.repo.NaceRepository;

@Service
public class NaceServiceImp implements NaceService {

	private static final Logger log = LoggerFactory.getLogger(NaceServiceImp.class);

	@Autowired
	private NaceRepository naceRepository;

	/**
	 *
	 */
	@Override
	public ResponseEntity<Activities> findNaceDetailsByOrder(String id) {

		Optional<ActivitiesDto> activiteData = naceRepository.findById(id);
		Activities activities = new Activities();
		log.info("id : " + id );
		if (activiteData.isPresent()) {
			BeanUtils.copyProperties(activiteData.get(), activities);
			return new ResponseEntity<>(activities, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(activities, HttpStatus.NOT_FOUND);
		}
	}

	/**
	 *
	 */
	@Override
	public ResponseEntity<Activities> addNaceDetails(Activities activities) {
		try {
			ActivitiesDto activitiesDto = new ActivitiesDto();
			BeanUtils.copyProperties(activities, activitiesDto);
			naceRepository.save(activitiesDto);
			return new ResponseEntity<>(null, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
