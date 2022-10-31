package ss19_string_and_reger.exrcise.validate_phone;

public class Test {
    private static ValidatePhone validatePhone;
    public static final String[] validPhone = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidPhone = new String[]{"(a8)-(22222222)"};

    public static void main(String args[]) {
        validatePhone = new ValidatePhone();
        for (String phone : validPhone) {
            boolean isvalid = validatePhone.validate(phone);
            System.out.println("Số điện thoại hợp lệ là: " + phone + ": " + isvalid);
        }
        for (String phone : invalidPhone) {
            boolean isvalid = validatePhone.validate(phone);
            System.out.println("Số điện thoại không hợp lệ là: " + phone + ": " + isvalid);
        }
    }
}
