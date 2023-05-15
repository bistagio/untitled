package mytube.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mytube.IndexerApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { IndexerApplication.class })
public class CucumberSpingConfiguration {}
