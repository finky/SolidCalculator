package averin.e;

import java.util.ArrayList;
import java.util.List;

public class Consts {
    public static final String SEPARATOR = " ";
    public static final int OPERATION_INDEX = 0;
    public static final int OPERANDS_START_INDEX = 1;

    public final static String OPERATION_PLUS = "plus";
    public final static String OPERATION_MINUS = "minus";
    public final static String OPERATION_MULTIPLY = "multiplication";
    public final static String OPERATION_DIVIDE = "division";
    public final static String OPERATION_MOD = "mod";
    public final static String OPERATION_PERCENT = "percent";
    public final static String OPERATION_ROOT = "root";
    public final static String OPERATION_POWER = "power";
    public static List<String> OPERATIONS_LIST = new ArrayList<String>() {
        {
            add(OPERATION_PLUS);
            add(OPERATION_MINUS);
            add(OPERATION_MULTIPLY);
            add(OPERATION_DIVIDE);
            add(OPERATION_MOD);
            add(OPERATION_PERCENT);
            add(OPERATION_ROOT);
            add(OPERATION_POWER);
        }
    };
}
