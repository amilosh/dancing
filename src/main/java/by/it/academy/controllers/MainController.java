package by.it.academy.controllers;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    public int getNumberOfStep() {

        int[] sequence = {4, 1, 2, 3, 1};

        int numberOfSteps = mainService.getNumberOfStep(sequence);

    }

}
