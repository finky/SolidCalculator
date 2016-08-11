package averin.e.Calculator;

import java.util.List;

public class Power extends BaseBinaryCalc {
    @Override
    public Double calc(List<String> operands) {
        if (operands.size() != allowedNumberOfOperands) return null;
        else {
            return Math.pow(Double.valueOf(operands.get(0)), Double.valueOf(operands.get(1)));
        }
    }
}
