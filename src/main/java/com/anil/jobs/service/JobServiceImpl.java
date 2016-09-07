package com.anil.jobs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.jobs.dao.JobDAO;
import com.anil.jobs.model.Job;
@Service("jobService")
public class JobServiceImpl implements JobService {

	@Autowired
	private JobDAO jobDAO;
	
	@Override
	public String addJob(Job job) {
		return jobDAO.addJob(job);
	}

	@Override
	public List<Job> getJobsBySector(String sector) {
		return jobDAO.getJobsBySector(sector);
	}

	@Override
	public List<Job> getJobsByCourse(String course) {
		return jobDAO.getJobsByCourse(course);
	}

	@Override
	public List<Job> getJobsByLocation(String location) {
		return jobDAO.getJobsByLocation(location);
	}

	@Override
	public List<Job> getJobsByExp(int exp) {
		return jobDAO.getJobsByExp(exp);
	}

	@Override
	public Job getJob(String jobId) {
		return jobDAO.getJob(jobId);
	}

}
