package co2123.hw2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID
    private int id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "school_pupil", // The join table to map the relationship
            joinColumns = @JoinColumn(name = "school_id"), // Foreign key for the School entity
            inverseJoinColumns = @JoinColumn(name = "pupil_address") // Foreign key for the Pupil entity
    )
    private List<Pupil> pupils;

    @ManyToOne
    @JoinColumn(name = "representative_address") // Foreign key to the Pupil entity (representative)
    private Pupil representative;

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

    public List<Pupil> getPupils() {
        return pupils;
    }

    public void setPupils(List<Pupil> pupils) {
        this.pupils = pupils;
    }

    public Pupil getRepresentative() {
        return representative;
    }

    public void setRepresentative(Pupil representative) {
        this.representative = representative;
    }

    // toString Method
    @Override
    public String toString() {
        return "School{id=" + id + ", name='" + name + "', pupils=" + pupils + ", representative=" + representative + "}";
    }
}
