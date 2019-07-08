package com.poc.one.controller;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.one.model.Hand;
import com.poc.one.services.GameService;

@RestController
public class GameController {
	
	@Autowired
	GameService gameSvc;

    @GetMapping("/seeAll")
    public List<Hand> seeAll() { return gameSvc.getAll(); }  
    
    @GetMapping("/dealme/{id}")
	public Hand getHand(@PathVariable Integer id) { return gameSvc.getOne(id); }    
    
    @PostMapping("/shuffle")
    public Hand dealMe(@RequestBody Hand h1) { return gameSvc.add(h1); }  
    
    @PutMapping("/swapcard/{id}/{card}")
    public Hand updateCard(
    		@PathVariable("id") Integer id,
    		@PathVariable("card") String card)
    	{ return gameSvc.updateHand(id, card); }  
    
    @DeleteMapping("/busted/{id}")
	public String removeHand(@PathVariable Integer id) { return gameSvc.removeOne(id); } 
    
}