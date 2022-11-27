package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Employer extends AbstractEntity {

    @NotNull
    @Size(max =50)
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer(String location) {
        this.location = location;
    }

    public Employer() {
    }



    }

