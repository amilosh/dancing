package by.it.academy.controllers;

import by.it.academy.entity.DancingProgram;
import by.it.academy.service.StepServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private StepServiceInterface stepServiceInterface;

    @RequestMapping(value = "/dp/{sequence}", method = RequestMethod.GET)
    public DancingProgram getSequence(@PathVariable("sequence") String sequence) {

        String[] words = sequence.split("\\s");

        Integer[] intNumbers = new Integer[words.length];
        for (int i = 0; i < intNumbers.length; i++) {
            intNumbers[i] = Integer.parseInt(words[i]);
        }

        DancingProgram dp = stepServiceInterface.getNumberOfStep(intNumbers);

        return dp;
    }

}
