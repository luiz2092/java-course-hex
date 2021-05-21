package com.bug.apibug.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bug.apibug.entity.BugEntity;

public interface BugRepository extends JpaRepository<BugEntity, Integer> {

}
