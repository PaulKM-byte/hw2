
package co2123.hw2.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "schools")
    private List<Pupil> pupils;

    @ManyToOne
    @JoinColumn(name = "representative_address")
    private Pupil representative;

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

    @Override
    public String toString() {
        return "School{id=" + id + ", name='" + name + "', pupils=" + pupils + ", representative=" + representative + "}";
    }
}
