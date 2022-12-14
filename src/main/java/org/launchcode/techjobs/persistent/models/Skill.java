package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

@ManyToMany(mappedBy="skills")

    private List<Job> jobs = new ArrayList<>();

@Size(max = 150)
    private String description;

    public Skill(List<Job> jobs, String description) {
        super();
        this.jobs = jobs;
        this.description = description;
    }
    public Skill() {
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }


}