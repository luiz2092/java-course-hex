package com.bug.apibug.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bug.apibug.entity.BugEntity;
import com.bug.apibug.model.BugModel;
import com.bug.apibug.repository.BugRepository;
import com.bug.apibug.service.BugService;

@Service
public class BugServiceImpl implements BugService {

	@Autowired
	private BugRepository bugRepository;

	@Override
	public void createBug(BugModel bug) {
		ModelMapper mapper = new ModelMapper();
		BugEntity bugEntity = mapper.map(bug, BugEntity.class);
		bugRepository.save(bugEntity);
	}

}
