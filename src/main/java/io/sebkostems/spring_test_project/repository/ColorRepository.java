package io.sebkostems.spring_test_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.sebkostems.spring_test_project.model.Color;

public interface ColorRepository extends JpaRepository<Color, Integer> {}
