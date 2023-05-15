package mytube.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mytube.DriveApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DriveApplication.class })
public class CucumberSpingConfiguration {}
