package com.tts.techtalenttwitter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.techtalenttwitter.model.UserProfile;

@Repository
public interface UserRepository extends CrudRepository<UserProfile, Long>{
	UserProfile findByUsername(String username);
	
	@Override
	List<UserProfile>findAll();
}
