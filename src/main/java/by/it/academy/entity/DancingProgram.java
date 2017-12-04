package by.it.academy.entity;


import javax.persistence.*;

// POJO class for DB

@Entity
@Table(name="competition")
public class DancingProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "program")
    private String countOfSteps;

    public DancingProgram(int countOfSteps) {
        this.countOfSteps = String.valueOf(countOfSteps);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountOfSteps() {

        return countOfSteps;
    }

    public void setCountOfSteps(String countOfSteps) {
        this.countOfSteps = countOfSteps;
    }
}
