package ss19_string_and_reger.exrcise.validate_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_REGEX =   "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";

    public ValidatePhone() {
        pattern = Pattern.compile(PHONE_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
