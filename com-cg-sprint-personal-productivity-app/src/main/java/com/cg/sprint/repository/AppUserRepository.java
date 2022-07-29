package com.cg.sprint.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.sprint.model.AppUser;
@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Integer> {

	
	AppUser findByUserName(String userName);

}
