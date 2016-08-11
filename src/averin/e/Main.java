package averin.e;

import averin.e.Calculator.CalculateFactor;
import averin.e.Calculator.ICalculateFactory;
import averin.e.Parser.ConcreteParser;
import averin.e.Parser.IParser;
import averin.e.Validator.ConcreteValidator;
import averin.e.Validator.IValidator;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        IParser calculatorParser = new ConcreteParser();
        IValidator calculatorValidator = new ConcreteValidator();
        ICalculateFactory calculatorFactory = new CalculateFactor();
        Logic calculatorLogic = new Logic(calculatorParser, calculatorValidator, calculatorFactory);

        System.out.println("Possible operations:");
        for (String operation : Consts.OPERATIONS_LIST) {
            System.out.println(operation);
        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            String inputString = scan.nextLine();

            calculatorLogic.printCalcResult(inputString);
        }
    }
}
