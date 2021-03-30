package com.loader.sw.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loader.sw.ms.model.Starships;

public interface StarshipsRepository extends JpaRepository<Starships, Integer>{}
