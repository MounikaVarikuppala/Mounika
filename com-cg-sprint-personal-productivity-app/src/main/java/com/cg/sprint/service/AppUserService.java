package com.cg.sprint.service;


import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sprint.exception.AppUserNotFoundException;
import com.cg.sprint.model.AppUser;
import com.cg.sprint.repository.AppUserRepository;

//
//import com.cg.sprint.model.User;
//import com.cg.sprint.repository.UserRepository;

@Service
public class AppUserService implements IAppUserService
{

	@Autowired
	private AppUserRepository appUserRepository;
	
	@Override
	public AppUser saveRegistration(AppUser appUser) {
		
		return appUserRepository.save(appUser);
	}

	@Override
	public AppUser getUserAllDataById(int userId) {
		Optional<AppUser> userOptional = appUserRepository.findById(userId);
		if (userOptional.isPresent()) {

			return userOptional.get();
		} else {
			String exceptionMessage = "AppUser with userName  not found!";
			System.out.println("+++++++++++++++++++++++++++++");
			throw new AppUserNotFoundException(exceptionMessage);
		}
	}

	@Override
	public AppUser loginUser(AppUser appUser) {
		AppUser userOptional = appUserRepository.findByUserName(appUser.getUserName());
		if (userOptional != null) {
			if (appUser.getUserName().equalsIgnoreCase(userOptional.getUserName())) {

			}
		}
		return userOptional;

	}
}


