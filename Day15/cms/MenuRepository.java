package com.mphasis.cms.repo;

import com.mphasis.cms.model.Menu;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends 
	CrudRepository<Menu, Integer> {

}
