package com.web.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.project.entity.PassengerInfo;

public interface PassengerRepository extends JpaRepository<PassengerInfo, Long> {

}
