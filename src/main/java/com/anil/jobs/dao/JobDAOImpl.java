package com.anil.jobs.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anil.jobs.model.Job;
import com.anil.jobs.repository.JobRepository;
@Repository("jobDAO")
public class JobDAOImpl implements JobDAO {

	@Autowired
	private JobRepository jobRepository;
	
	@Override
	public String addJob(Job job) {
		if(jobRepository.save(job)!=null)
		return "Job Added";
		else return "Failed to add";
	}

	@Override
	public List<Job> getJobsBySector(String sector) {
		return jobRepository.getAllJobsBySector(sector);
	}

	@Override
	public List<Job> getJobsByCourse(String course) {
		return jobRepository.getAllJobsByCourse(course);
	}

	@Override
	public List<Job> getJobsByLocation(String location) {
		return jobRepository.getAllJobsByLocation(location);
	}

	@Override
	public List<Job> getJobsByExp(int exp) {
		return jobRepository.getAllJobsByExp(exp);
	}

	@Override
	public Job getJob(String jobId) {
		return jobRepository.findOne(jobId);
	}

}
