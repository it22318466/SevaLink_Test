package com.sevalink.sevalinkbackend.controller;

import com.sevalink.sevalinkbackend.model.JobPost;
import com.sevalink.sevalinkbackend.service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/job-posts")
@CrossOrigin(origins = "*")
public class JobPostAliasController {

    @Autowired
    private JobPostService jobPostService;

    @GetMapping
    public List<JobPost> getAllOpenJobsAlias() {
        return jobPostService.getAllOpenJobs();
    }
}
