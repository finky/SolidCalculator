package averin.e.Calculator;

import java.util.List;

public class Division extends BaseBinaryCalc {
    @Override
    public Double calc(List<String> operands) {
        if (operands.size() != allowedNumberOfOperands) return null;
        else {
            return Double.valueOf(operands.get(0)) / Double.valueOf(operands.get(1));
        }
    }
}
