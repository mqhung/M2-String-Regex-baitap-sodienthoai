public class Main {
    private static PhoneNumber phoneNumber;
    public static final String[] validClass = new String[] { "(84)-(0942381593)", "(84)-(0349609711)"};
    public static final String[] invalidClass = new String[] { "(84)-(09784896)", "(84)-(1978489648)", "(a9)-(0978489648)"};
    public static void main(String[] args) {
        for (String phone: validClass) {
            phoneNumber = new PhoneNumber();
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("PhoneNumber is " + phone + " is valid " + isValid);
        }
        for (String phone: invalidClass) {
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("PhoneNumber is " + phone + " is valid " + isValid);
        }
    }
}
