package com.cg.sprint.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.sprint.model.AppUser;
import com.cg.sprint.repository.AppUserRepository;

public interface IAppUserService {


	public AppUser saveRegistration(AppUser appUser);
	

	public AppUser getUserAllDataById(int userId);
	

	public AppUser loginUser(AppUser appUser);

}
