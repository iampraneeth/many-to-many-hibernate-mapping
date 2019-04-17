package com.example.manytomany.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytomany.entity.Projects;

@Repository
public interface ProjectsDao extends JpaRepository<Projects, Integer>{

}
