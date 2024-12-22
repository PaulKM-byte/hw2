
package co2123.hw2.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pupil {
    @Id
    private String address;

    @ManyToMany
    @JoinTable(
            name = "school_pupil",
            joinColumns = @JoinColumn(name = "pupil_address"),
            inverseJoinColumns = @JoinColumn(name = "school_id")
    )
    private List<School> schools;

    @OneToMany(mappedBy = "pupil", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Grade> grades;

    @OneToOne
    @JoinColumn(name = "best_grade_identifier")
    private Grade best;

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

    @Override
    public String toString() {
        return "Pupil{address='" + address + "', grades=" + grades + ", best=" + best + "}";
    }
}
