package com.poc.one.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.one.model.Hand;
import com.poc.one.repository.HandRepository;

@Service
public class GameService {
	
	@Autowired
	HandRepository handRepo;
	
	public Hand getOne(Integer id) {

		Hand h = handRepo.findById(id).orElse(null);
		return h;
		
	}
	
	public List<Hand> getAll() { 
		
		List<Hand> aList = new ArrayList<>();
		
		handRepo.findAll().forEach(e->aList.add(e));
		
		return aList; }
	
	public Hand add(Hand h) {

		handRepo.save(h);
		
		return h;
	}
	
	public Hand updateHand(Integer id, String card) {

		Hand h = handRepo.findById(id).orElse(null);
		if (h != null) {
			h.setCard1(card);
			handRepo.save(h);
		}
		return h;
		
	}	
	
	public String removeOne(Integer id) {
 
		handRepo.deleteById(id);
		
		return "Hand " + id + " is deleted!";
	}
	
}
