package tests.properties;

import org.junit.jupiter.api.Test;

public class SystemProperties {
    @Test
    void someTest1() {
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }
}
