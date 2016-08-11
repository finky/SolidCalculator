package averin.e.Validator;

import averin.e.Consts;

import java.util.List;

public class ConcreteValidator implements IValidator {
    @Override
    public boolean isValidOperator(String operator) {

        return Consts.OPERATIONS_LIST.contains(operator);
    }

    @Override
    public boolean isValidOperands(List<String> params) {
        boolean isValid = false;
        try {
            for (String param: params) {
                Double.valueOf(param);
                isValid = true;
            }
        } catch (Exception e) { // NumberFormatException
            e.printStackTrace();
            isValid = false;
        }
        return isValid;
    }
}
