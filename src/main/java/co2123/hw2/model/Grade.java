package co2123.hw2.model;

import jakarta.persistence.*;

@Entity
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID
    private int identifier;

    private int score;

    @ManyToOne
    @JoinColumn(name = "pupil_address") // Foreign key for the Pupil entity
    private Pupil pupil;

    // Getters and Setters
    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Pupil getPupil() {
        return pupil;
    }

    public void setPupil(Pupil pupil) {
        this.pupil = pupil;
    }

    // toString Method
    @Override
    public String toString() {
        return "identifier=" + identifier + ", score=" + score;
    }
}
