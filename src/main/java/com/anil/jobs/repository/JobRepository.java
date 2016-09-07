package com.anil.jobs.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.anil.jobs.model.Job;
@Repository
public interface JobRepository extends MongoRepository<Job, String> {

	@Query(value="{'jobSector':?0}",fields="{'jobDesc':1,'minExp':1,'maxExp':1,'companyName':1,'city':1,'jobSector':1}")
	List<Job> getAllJobsBySector(String sector);
	@Query(value="{'jobCourse':?0}",fields="{'jobDesc':1,'minExp':1,'maxExp':1,'companyName':1,'city':1,'jobCourse':1}")
	List<Job> getAllJobsByCourse(String jobCourse);
	@Query(value="{'city':?0}",fields="{'jobDesc':1,'minExp':1,'maxExp':1,'companyName':1,'city':1}")
	List<Job> getAllJobsByLocation(String city);
	@Query(value="{'minExp':?0}",fields="{'jobDesc':1,'minExp':1,'maxExp':1,'companyName':1,'city':1}")
	List<Job> getAllJobsByExp(int exp);
}
