package by.it.academy.service;

import by.it.academy.action.StepCounter;
import by.it.academy.entity.DancingProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StepService implements StepServiceInterface{

    @Autowired
    private StepCounter stepCounter;

    @Override
    public void addCountOfSteps(int countOfSteps) {
        
    }

    @Override
    public void addSequence(int[] cells) {

    }

    @Override
    public int getCountOfStepsById(int id) {
        return 0;
    }

    @Override
    public int getCountOfStepsBySequence(int[] cells) {
        return 0;
    }

    public DancingProgram getNumberOfStep(final Integer[] sequence) {
        stepCounter.init(sequence);
        return stepCounter.getCount();
    }
}
