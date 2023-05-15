package mytube.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mytube.NotificationApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotificationApplication.class })
public class CucumberSpingConfiguration {}
