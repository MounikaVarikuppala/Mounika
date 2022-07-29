package com.cg.sprint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.sprint.model.Remainder;


	@Repository
	public interface RemainderRepository extends JpaRepository<Remainder,Integer>  {




}
