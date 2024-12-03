package com.arunkumars.portfolio.model;

public class Project {
    
    private int id;
    private String name;
    private String description;
    private String technologiesUsed;
    private String projectType;
    private String url;

    // Constructor
    public Project(int id, String name, String description, String technologiesUsed, String projectType, String url) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.technologiesUsed = technologiesUsed;
        this.projectType = projectType;
        this.url = url;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnologiesUsed() {
        return technologiesUsed;
    }

    public void setTechnologiesUsed(String technologiesUsed) {
        this.technologiesUsed = technologiesUsed;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Optional: toString method for easy debugging and logging
    @Override
    public String toString() {
        return "Project [id=" + id + ", name=" + name + ", description=" + description + ", technologiesUsed="
                + technologiesUsed + ", projectType=" + projectType + ", url=" + url + "]";
    }
}

