package com.aws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws.model.Team;
import com.aws.repositary.teamRepo;

@Service
public class TeamService {

	@Autowired
	private teamRepo repo;
	
	
	public List <Team> getall(){
		 return repo.findAll();
		
	}
	
	public Team save(Team team) {
		return repo.save(team);
	}
	
}
