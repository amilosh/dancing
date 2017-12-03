package by.it.academy.DAO;

import by.it.academy.entity.DancingProgram;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class DancingDAOImpl implements DancingDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void addDancingProgram(DancingProgram dancingProgram) {
        entityManager.persist(dancingProgram);
    }

    @Override
    public DancingProgram getDancingProgramBySequence(int[] danceSequence) {
        DancingProgram dancingProgram = entityManager.find(DancingProgram.class, danceSequence);
        return dancingProgram;
    }
}
