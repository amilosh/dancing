package by.it.academy.DAO;

import by.it.academy.entity.DancingProgram;

public interface DancingDAO {

    void addDancingProgram (DancingProgram dancingProgram);
    DancingProgram getDancingProgramBySequence (int[] danceSequence);

}
