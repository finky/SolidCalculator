package averin.e.Validator;

import java.util.List;

public interface IValidator {
    boolean isValidOperator(String operator);

    boolean isValidOperands(List<String> operands);
}
