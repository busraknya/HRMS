package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/job-titles")
public class JobTitleControllers {

	private JobTitleService jobTitleService;

	//public JobTitleControllers() {}

	@Autowired
	public JobTitleControllers(JobTitleService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public List<JobTitle> getAll() {
		return jobTitleService.getAll();
	}
}
