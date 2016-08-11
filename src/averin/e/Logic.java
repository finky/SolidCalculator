package averin.e;


import averin.e.Calculator.ICalculateFactory;
import averin.e.Parser.IParser;
import averin.e.Validator.IValidator;

import java.util.List;

public class Logic {
    private final IParser mParser;
    private final IValidator mValidator;
    private final ICalculateFactory mCalculateFactory;

    public Logic(IParser parser, IValidator validator, ICalculateFactory factory) {
        this.mParser = parser;
        this.mValidator = validator;
        this.mCalculateFactory = factory;
    }

    public void printCalcResult(String inputString) {
        List<String> calculatorInput = mParser.parse(inputString);
        if (calculatorInput.size() > 1) {//без операндов операций нет
            String operation = calculatorInput.get(Consts.OPERATION_INDEX);
            List<String> operands = calculatorInput.subList(Consts.OPERANDS_START_INDEX, calculatorInput.size());
            if (mValidator.isValidOperator(operation) &&
                    mValidator.isValidOperands(operands)) {
                Double result = mCalculateFactory.calculateOperation(operation).calc(operands);
                if (result != null)
                    System.out.println(result);
                else System.out.println("Wrong number of operands for given operation");

            } else System.out.println("Wrong data provided");
        } else System.out.println("Wrong data provided");
    }
}
