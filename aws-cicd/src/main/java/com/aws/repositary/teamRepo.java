package com.aws.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aws.model.Team;

@Repository
public interface teamRepo  extends JpaRepository<Team,Integer>{

}
