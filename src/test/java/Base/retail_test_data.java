package Base;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

public class retail_test_data {
    static Faker fkr = new Faker();
    public static String customer_email= fkr.internet().emailAddress();
    public static String customer_firstname= fkr.name().firstName();
    public static String customer_lastname=fkr.name().lastName();
    public static String customer_password = "Test123456";
    public static String customer_address=fkr.address().streetAddress();
    public static String customer_city=fkr.address().cityName();

//    public static String customer_zip=fkr.address().zipCodeByState("LA");
    public static String customer_zip= "12144";
    public static String customer_phone= fkr.phoneNumber().cellPhone();
}
