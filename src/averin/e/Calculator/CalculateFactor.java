package averin.e.Calculator;

import averin.e.Consts;


public class CalculateFactor implements ICalculateFactory {

    public BaseCalc calculateOperation(String operation) {
        BaseCalc operationClass = null;
        switch (operation) {
            case Consts.OPERATION_PLUS:
                operationClass = new Plus();
                break;
            case Consts.OPERATION_MINUS:
                operationClass = new Minus();
                break;
            case Consts.OPERATION_MULTIPLY:
                operationClass = new Multiplication();
                break;
            case Consts.OPERATION_DIVIDE:
                operationClass = new Division();
                break;
            case Consts.OPERATION_MOD:
                operationClass = new Mod();
                break;
            case Consts.OPERATION_POWER:
                operationClass = new Power();
                break;
            case Consts.OPERATION_PERCENT:
                operationClass = new Percent();
                break;
            case Consts.OPERATION_ROOT:
                operationClass = new Root();
                break;
        }
        return operationClass;
    }
}
