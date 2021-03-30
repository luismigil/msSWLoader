package com.loader.sw.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loader.sw.ms.model.People;

public interface PeopleRepository extends JpaRepository<People, Integer>{}

