package by.it.academy.service;

import by.it.academy.entity.DancingProgram;

public interface StepServiceInterface {

    void addDancingProgram (DancingProgram dancingProgram);
    DancingProgram getDancingProgramBySequence (int[] danceSequence);

}
