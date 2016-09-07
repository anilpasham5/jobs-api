package com.anil.jobs.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="jobs")
public class Job {

	@Id
	private String jobId;
	private String jobDesc;
	private String jobSector;
	private String jobCourse;
	private int minExp;
	private int maxExp;
	private String companyName;
	private String city;
	private String jobProfile;
	private String specialization;
	private String qualification;
	private String keySkills;
	private String companyProfile;
	private String companyAddess;
	private String companyEmailId;
	private long companyContactNumber;
	private Date jobPostingDate;
	private String howToApply;
	public Job() {}
	public Job(String jobId, String jobDesc, String jobSector, String jobCourse, int minExp, int maxExp,
			String companyName, String city, String jobProfile, String specialization, String qualification,
			String keySkills, String companyProfile, String companyAddess, String companyEmailId,
			long companyContactNumber, Date jobPostingDate, String howToApply) {
		super();
		this.jobId = jobId;
		this.jobDesc = jobDesc;
		this.jobSector = jobSector;
		this.jobCourse = jobCourse;
		this.minExp = minExp;
		this.maxExp = maxExp;
		this.companyName = companyName;
		this.city = city;
		this.jobProfile = jobProfile;
		this.specialization = specialization;
		this.qualification = qualification;
		this.keySkills = keySkills;
		this.companyProfile = companyProfile;
		this.companyAddess = companyAddess;
		this.companyEmailId = companyEmailId;
		this.companyContactNumber = companyContactNumber;
		this.jobPostingDate = jobPostingDate;
		this.howToApply = howToApply;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public String getJobSector() {
		return jobSector;
	}
	public void setJobSector(String jobSector) {
		this.jobSector = jobSector;
	}
	public String getJobCourse() {
		return jobCourse;
	}
	public void setJobCourse(String jobCourse) {
		this.jobCourse = jobCourse;
	}
	public int getMinExp() {
		return minExp;
	}
	public void setMinExp(int minExp) {
		this.minExp = minExp;
	}
	public int getMaxExp() {
		return maxExp;
	}
	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getJobProfile() {
		return jobProfile;
	}
	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getKeySkills() {
		return keySkills;
	}
	public void setKeySkills(String keySkills) {
		this.keySkills = keySkills;
	}
	public String getCompanyProfile() {
		return companyProfile;
	}
	public void setCompanyProfile(String companyProfile) {
		this.companyProfile = companyProfile;
	}
	public String getCompanyAddess() {
		return companyAddess;
	}
	public void setCompanyAddess(String companyAddess) {
		this.companyAddess = companyAddess;
	}
	public String getCompanyEmailId() {
		return companyEmailId;
	}
	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}
	public long getCompanyContactNumber() {
		return companyContactNumber;
	}
	public void setCompanyContactNumber(long companyContactNumber) {
		this.companyContactNumber = companyContactNumber;
	}
	public Date getJobPostingDate() {
		return jobPostingDate;
	}
	public void setJobPostingDate(Date jobPostingDate) {
		this.jobPostingDate = jobPostingDate;
	}
	public String getHowToApply() {
		return howToApply;
	}
	public void setHowToApply(String howToApply) {
		this.howToApply = howToApply;
	}
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobDesc=" + jobDesc + ", jobSector=" + jobSector + ", jobCourse=" + jobCourse
				+ ", minExp=" + minExp + ", maxExp=" + maxExp + ", companyName=" + companyName + ", city=" + city
				+ ", jobProfile=" + jobProfile + ", specialization=" + specialization + ", qualification="
				+ qualification + ", keySkills=" + keySkills + ", companyProfile=" + companyProfile + ", companyAddess="
				+ companyAddess + ", companyEmailId=" + companyEmailId + ", companyContactNumber="
				+ companyContactNumber + ", jobPostingDate=" + jobPostingDate + ", howToApply=" + howToApply + "]";
	}
	
	
}
