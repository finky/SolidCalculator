package averin.e.Calculator;

import java.util.List;

public class Plus extends BaseBinaryCalc {
    @Override
    public Double calc(List<String> operands) {
        Double result = 0d;
        if (operands.size() != allowedNumberOfOperands) return null;
        else {
            for (int i = 0; i < operands.size(); i++) {
                result += Double.valueOf(operands.get(i));
            }
            return result;
        }
    }
}
