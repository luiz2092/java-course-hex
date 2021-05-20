package com.bug.apibug.model;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BugModel {

	private String email;
	private String owner;
	private String priority;
	private String status;
	private String ownerProject;

	private Date createdDate;
	private Date completionDate;
	private String description;

	private List<String> attachedFiles;	
	
}
