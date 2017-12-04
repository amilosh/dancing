package by.it.academy.service;

import by.it.academy.DAO.DancingDAO;
import by.it.academy.action.StepCounter;
import by.it.academy.entity.DancingProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StepService{

    @Autowired
    private StepCounter stepCounter;

    public DancingProgram getNumberOfStep(final Integer[] sequence) {
        stepCounter.init(sequence);
        return stepCounter.getCount();
    }
}
