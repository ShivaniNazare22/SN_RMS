package com.project.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.web.models.Userslist;



public interface userlist_info extends JpaRepository<Userslist, Integer> {

	public Userslist findByusername(String username);

		
	}