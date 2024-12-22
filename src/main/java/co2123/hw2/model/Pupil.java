package co2123.hw2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pupil {
    @Id
    private String address;

    @ManyToMany
    @JoinTable(
            name = "school_pupil", // The join table that maps School and Pupil entities
            joinColumns = @JoinColumn(name = "pupil_address"), // Foreign key for the Pupil entity
            inverseJoinColumns = @JoinColumn(name = "school_id") // Foreign key for the School entity
    )
    private List<School> schools;

    @OneToMany
    @JoinColumn(name = "pupil_address") // Foreign key for the Pupil entity in the Grade table
    private List<Grade> grades;

    @OneToOne
    @JoinColumn(name = "best_grade_identifier") // Foreign key for the "best" grade
    private Grade best;

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<School> getSchools() {
        return schools;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public Grade getBest() {
        return best;
    }

    public void setBest(Grade best) {
        this.best = best;
    }

    // toString Method
    @Override
    public String toString() {
        return "address='" + address + "', grades=" + grades + ", best=" + best;
    }
}
