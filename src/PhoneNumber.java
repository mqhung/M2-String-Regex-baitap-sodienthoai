import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String PHONE_NUMBER = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public PhoneNumber() {
    }
    public boolean validate (String regex){
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public int getNumber(int number){
        if(number > 0){
            return 0;
        }

        return 1;
    }

    public String getAddress(){
        return "HA NOI";
    }
}
