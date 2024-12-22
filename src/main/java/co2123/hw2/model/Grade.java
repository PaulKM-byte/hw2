package co2123.hw2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Grade {
    @Id
    @GeneratedValue
    private int identifier;
    private int score;

    // Getters and Setters
    public int getIdentifier() { return identifier; }
    public void setIdentifier(int identifier) { this.identifier = identifier; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    // toString Method
    @Override
    public String toString() {
        return "identifier=" + identifier + ", score=" + score;
    }
}
