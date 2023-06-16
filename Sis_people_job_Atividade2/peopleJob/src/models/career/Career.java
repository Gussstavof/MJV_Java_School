package models.career;

import java.math.BigDecimal;
import java.util.List;

public class Career {
    private String job;
    private List<String> companies;
    private BigDecimal salary;
    private String currentJob;
    private List<String> skills;

    public Career(String job, List<String> companies, BigDecimal salary, String currentJob, List<String> skills) {
        this.job = job;
        this.companies = companies;
        this.salary = salary;
        this.currentJob = currentJob;
        this.skills = skills;
    }

    public String getJob() {
        return job;
    }

    public List<String> getCompanies() {
        return companies;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getCurrentJob() {
        return currentJob;
    }

    public List<String> getSkills() {
        return skills;
    }
}
