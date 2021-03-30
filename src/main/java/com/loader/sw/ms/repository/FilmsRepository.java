package com.loader.sw.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loader.sw.ms.model.Films;

public interface FilmsRepository extends JpaRepository<Films, Integer>{}
