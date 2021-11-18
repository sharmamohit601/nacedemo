package com.db.nace.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.db.nace.dto.ActivitiesDto;

@Component
public interface NaceRepository extends JpaRepository<ActivitiesDto, String> {

}
