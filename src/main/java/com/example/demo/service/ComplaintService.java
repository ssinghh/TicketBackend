package com.example.demo.service;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Complaint;

public interface ComplaintService extends CrudRepository<Complaint, Integer> {

}
