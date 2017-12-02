package by.it.academy.action;

import by.it.academy.entity.DancingProgram;
import org.springframework.stereotype.Service;

@Service
public class StepCounter {

    private DancerAction dancerAction;
    private FloorAction floorAction;

    private int count = 0;

    public StepCounter() {
        dancerAction = new DancerAction();
        floorAction = new FloorAction();
    }

    public final void init(final Integer[] steps) {
        dancerAction.createDancer(steps);
        floorAction.createFloor(steps.length);

        start();
    }

    private void start() {
        count = 0;
        move();
    }

    private void move() {
        while (!floorAction.isStop()) {
            int position = floorAction.getPosition();
            int step = dancerAction.move(position);

            floorAction.move(step);
            count += floorAction.getStepChange();
        }
        floorAction.backToStart();
        count += floorAction.getStepChange();

        finish(floorAction.isCycle());
    }

    private void finish(final boolean isCycle) {
        if (isCycle) {
            count = -1;
        }
    }

    public final DancingProgram getCount() {
        return new DancingProgram(count);
    }
}
