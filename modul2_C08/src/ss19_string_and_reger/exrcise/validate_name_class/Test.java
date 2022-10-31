package ss19_string_and_reger.exrcise.validate_name_class;

public class Test {
    private static ValidateNameClass validateNameClass;
    public static final String[] validClassName = new String[]{"C0822G"};
    public static final String[] invalidClassName = new String[]{"A00@09B8"};

    public static void main(String args[]) {
        validateNameClass = new ValidateNameClass();
        for (String name : validClassName) {
            boolean isvalid = validateNameClass.validate(name);
            System.out.println("Tên lớp hợp lệ là: " + name + ": " + isvalid);
        }
        for (String name : invalidClassName) {
            boolean isvalid = validateNameClass.validate(name);
            System.out.println("Tên lớp không hợp lệ là: " + name + ": " + isvalid);
        }
    }
}
