package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Complaint;
import com.example.demo.service.ComplaintService;

@RestController
@CrossOrigin
public class ComplaintController {
	
	@Autowired
	ComplaintService ser;
    
	@GetMapping("/complaint")
	private Iterable<Complaint> getAllComplaints() {
	Iterable<Complaint> complaints = ser.findAll();
		return complaints;
	}
	
	@PostMapping("/complaint")
	private Complaint createComplaint(@RequestBody Complaint comp) {
		System.out.println(comp);
		ser.save(comp);
		return comp;
	}
	
	@PutMapping("/complaint")
	private Complaint updateComplaint(@RequestBody Complaint comp) {
		return ser.save(comp);
	}
	
	@DeleteMapping("/complaint/{comNo}")
	private void deleteComplaint(@PathVariable Integer comNo) {
		ser.deleteById(comNo);
	}
	
	
	
	
	

}
