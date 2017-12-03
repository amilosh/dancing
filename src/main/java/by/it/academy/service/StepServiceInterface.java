package by.it.academy.service;

public interface StepServiceInterface {
    /**
     * метод добавления {@link by.it.academy.entity.DancingProgram}
     * @param countOfSteps
     */
    void addCountOfSteps (int countOfSteps);

    /**
     * метод добавления {@link by.it.academy.entity.Floor}
     * @param cells
     */
    void addSequence (int[] cells);

    /**
     * метод получения countOfSteps по id
     * @return countOfSteps
     */
    int getCountOfStepsById(int id);

    /**
     * метод получения countOfSteps по cells
     * @return countOfSteps
     */
    int getCountOfStepsBySequence (int[] cells);


}
