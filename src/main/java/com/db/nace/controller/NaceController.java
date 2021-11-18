package com.db.nace.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.nace.model.Activities;
import com.db.nace.service.NaceService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * @author Mohit
 *
 */
@RestController
@RequestMapping("/api")
public class NaceController {

	@Autowired
	private NaceService naceService;

	/**
	 * This API will help to fetch NACE details by order ID.
	 * 
	 * @param id order id
	 * @return Nance Activities details
	 */
	@GetMapping("/activite/{id}")
	public ResponseEntity<Activities> getNaceDetailsByOrder(@PathVariable("id") String id) {
		return naceService.findNaceDetailsByOrder(id);
	}

	/**
	 * This API will help to create/add new NACE details.
	 * 
	 * @param activities details
	 * @return Https status
	 */
	@PostMapping("/activite/add")
	public ResponseEntity<Activities> addNaceDetails(@Valid @RequestBody Activities activities) {
		return naceService.addNaceDetails(activities);
	}

}
