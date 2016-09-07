package com.anil.jobs.service;

import java.util.List;

import com.anil.jobs.model.Job;

public interface JobService {

	String addJob(Job job);
	List<Job> getJobsBySector(String sector);
	List<Job> getJobsByCourse(String course);
	List<Job> getJobsByLocation(String location);
	List<Job> getJobsByExp(int exp);
	Job getJob(String jobId);
}
