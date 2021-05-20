package com.bug.apibug.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bug.apibug.model.BugModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/bug")
@Slf4j
public class BugController {

	@PostMapping
	public ResponseEntity<Void> createBug(@RequestBody BugModel bug) throws JsonProcessingException {
		log.info(new ObjectMapper().writeValueAsString(bug));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/{idBug}")
	public ResponseEntity<BugModel> getBug(@PathVariable int idBug) {
		return new ResponseEntity<>(new BugModel(), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<BugModel>> getAllBug(@PathVariable int idBug) {
		return new ResponseEntity<>(Arrays.asList(new BugModel()), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Void> updateBug(@RequestBody BugModel bug) throws JsonProcessingException {
		log.info(new ObjectMapper().writeValueAsString(bug));
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
