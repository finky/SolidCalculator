package averin.e.Parser;

import averin.e.Consts;

import java.util.ArrayList;
import java.util.List;

public class ConcreteParser implements IParser {

    @Override
    public List<String> parse(String in) {
        List<String> parsedInputString = new ArrayList<>();
        String[] splittedInput = in.split(Consts.SEPARATOR);
        for (int i = 0; i < splittedInput.length; i++) {
            parsedInputString.add(splittedInput[i]);
        }
        return parsedInputString;
    }
}
