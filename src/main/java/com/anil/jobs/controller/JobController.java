package com.anil.jobs.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.anil.jobs.model.Job;
import com.anil.jobs.service.JobService;

@RestController
@RequestMapping(value="/job")
public class JobController {

	private static final Logger logger=Logger.getLogger(JobController.class.getName());
	@Autowired
	private JobService jobService;
	
	@PostMapping("")
	@ResponseStatus(code=HttpStatus.CREATED)
	public String addJob(@RequestBody Job job){
		logger.info(job);
		return jobService.addJob(job);
	}
	@GetMapping("/sector/{sector}")
	public List<Job> getAllJobsBySector(@PathVariable("sector") String sector){
		logger.info("Selected Sector: "+sector);
		return jobService.getJobsBySector(sector);
	}
	@GetMapping("/course/{course}")
	@ResponseStatus(code=HttpStatus.FOUND)
	public List<Job> getAllJobsByCourse(@PathVariable("course") String course){
		logger.info("Selected course: "+course);
		return jobService.getJobsByCourse(course);
	}
	@GetMapping("/location/{location}")
	public List<Job> getAllJobsByLocation(@PathVariable("location") String location){
		logger.info("Selected Location: "+location);
		return jobService.getJobsByLocation(location);
	}
	@GetMapping("/exp/{exp}")
	public List<Job> getAllJobsByExperience(@PathVariable("exp") int exp){
		logger.info("Experience: "+exp);
		return jobService.getJobsByExp(exp);
	}
	@GetMapping("/{jobId}")
	public Job getJob(@PathVariable("jobId") String jobId){
		logger.info(jobId);
		return jobService.getJob(jobId);
	}
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR,reason="Something went wrong")
	private String handleException(Exception e){
		return e.getMessage();
	}
	
	
}
