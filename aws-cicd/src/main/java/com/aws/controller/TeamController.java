package com.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.model.Team;
import com.aws.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService  service;
	
	 @PostMapping("/team")
	    public Team save(Team team)
	    {
	        return service.save(team);
	    }
	 
	    @GetMapping("/list")
	    public List<Team> getall()
	    {
	        return service.getall();
	    }
	 
}
