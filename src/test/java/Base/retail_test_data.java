package Base;

import com.github.javafaker.Faker;

public class retail_test_data {
    static Faker fkr= new Faker();
    public static String customer_email= fkr.internet().emailAddress();
    public static String customer_firstname= fkr.name().firstName();
    public static String customer_lastname= fkr.name().lastName();
    public static String customer_password= "123456";
    public static String customer_address= fkr.address().streetAddress();
    public static String customer_city= fkr.address().city();
    public static String customer_zip= "16423";
    public static String customer_phoneNumber= fkr.phoneNumber().cellPhone();

}
