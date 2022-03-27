package StepDef;

import Base.setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends setup {

        public static String url;
        public static String existingStudentEmail;
        public static String existingStudentPass;
        public static String driverType = System.getProperty("browser");
        public static String envData = System.getProperty("env");

        @Before
        public void startTest(){

                if(Strings.isNullOrEmpty(driverType)){
                        driverType = "ch";
                }
                if (Strings.isNullOrEmpty(envData)){
                        envData = "qa";
                }
                driver = setupBrowser(driverType);

                switch(envData){
                        case "qa":
                                url = "http://qa.taltektc.com";
                                existingStudentEmail = "qaenv@gmail.com";
                                existingStudentPass = "Te$t1234";
                                break;
                        case "stage":
                                url = "http://stage.taltektc.com";
                                existingStudentEmail = "stgenv@gmail.com";
                                existingStudentPass = "$tudenT1234";
                                break;
                        case "prod":
                                url = "http://prod.taltektc.com";
                                existingStudentEmail = "";
                                existingStudentPass = "";
                                break;
                }

                driver.get(url);

        }

        @After
        public void tearDown() throws InterruptedException {

                Thread.sleep(10000);
                driver.quit();


        }

}
