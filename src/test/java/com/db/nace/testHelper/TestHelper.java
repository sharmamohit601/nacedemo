package com.db.nace.testhelper;

import com.db.nace.dto.ActivitiesDto;
import com.db.nace.model.Activities;

public class TestHelper {

	public static Activities getActivities() {
		Activities activities = new Activities();
		activities.setOrder("1234");
		return activities;

	}
	
	public static ActivitiesDto getActivitiesDto() {
		ActivitiesDto activitiesDto = new ActivitiesDto();
		activitiesDto.setOrder("1234");
		return activitiesDto;

	}
}
