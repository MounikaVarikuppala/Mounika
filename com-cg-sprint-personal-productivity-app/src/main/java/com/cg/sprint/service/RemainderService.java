package com.cg.sprint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sprint.exception.RemainderNotFoundException;
import com.cg.sprint.model.Remainder;
import com.cg.sprint.model.Todo;
import com.cg.sprint.repository.RemainderRepository;


@Service
public  class RemainderService implements IRemainderService
{

	@Autowired
	private RemainderRepository remainderRepository;

	@Override
	public Remainder addRemainder(Remainder remainder) {
		return remainderRepository.save(remainder);
	}
		
@Override
	public void deleteRemainder(int remainderId) {
		 remainderRepository.deleteById(remainderId);
	}


	
}
