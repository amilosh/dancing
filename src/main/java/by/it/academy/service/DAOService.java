package by.it.academy.service;

import by.it.academy.DAO.DancingDAO;
import by.it.academy.entity.DancingProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DAOService implements StepServiceInterface {

    @Autowired
    DancingDAO dancingDAO;

    @Override
    @Transactional
    public void addDancingProgram(DancingProgram dancingProgram) {
        dancingDAO.addDancingProgram(dancingProgram);
    }

    @Override
    @Transactional
    public DancingProgram getDancingProgramBySequence(int[] danceSequence) {
        return dancingDAO.getDancingProgramBySequence(danceSequence);
    }

}
