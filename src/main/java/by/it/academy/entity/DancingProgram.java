package by.it.academy.entity;


import javax.persistence.*;

// POJO class for DB

@Entity
@Table(name = "dancing", catalog = "APP_DB")
public class DancingProgram {

    private int id;
    private int countOfSteps;
    /* пришлось добавить, чтобы в таблице хранилась последовательность и соответствующее ей кол-во шагов
    * надо вставить куда-то код по присваиванию данной переменной входящей числовой последовательности
     */

    private int[] danceSequence;

    public DancingProgram(final int count) {
        countOfSteps = count;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "COUNT_OF_STEPS")
    public int getCount() {
        return countOfSteps;
    }

    public void setCountOfSteps(int countOfSteps) {
        this.countOfSteps = countOfSteps;
    }

    @Column(name = "DANCE_SEQUENCE")
    public int[] getDanceSequence() {
        return danceSequence;
    }

    public void setDanceSequence(int[] danceSequence) {
        this.danceSequence = danceSequence;
    }
}
