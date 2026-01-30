package com.mphasis.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.cms.repo.MenuRepository;
import com.mphasis.cms.exception.MenuNotFoundException;
import com.mphasis.cms.model.Menu;

@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;
	
	public List<Menu> showMenu() {
		return menuRepository.findAll();
	}
	
	public Menu searchById(int menuId) {
		  return menuRepository.findById(menuId)
		            .orElseThrow(() -> new MenuNotFoundException("Menu No Not Found..."));
	}
}
