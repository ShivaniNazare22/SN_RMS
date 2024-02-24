package com.project.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.web.models.ListofUsers;



public interface userlist_info extends JpaRepository<ListofUsers, Integer> {

	public ListofUsers findByusername(String username);

		
	}