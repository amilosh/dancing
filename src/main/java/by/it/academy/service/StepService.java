package by.it.academy.service;

import by.it.academy.DAO.DancingDAO;
import by.it.academy.action.StepCounter;
import by.it.academy.entity.DancingProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StepService implements StepServiceInterface{

    @Autowired
    private StepCounter stepCounter;
    @Autowired
    private DancingDAO dancingDAO;


    @Override
    public void addDancingProgram(DancingProgram dancingProgram) {
        dancingDAO.addDancingProgram(dancingProgram);
    }

    @Override
    public DancingProgram getDancingProgramBySequence(int[] danceSequence) {
        return dancingDAO.getDancingProgramBySequence(danceSequence);
    }

    public DancingProgram getNumberOfStep(final Integer[] sequence) {
        stepCounter.init(sequence);
        return stepCounter.getCount();
    }
}
