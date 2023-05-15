package mytube.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mytube.VideoProcessingApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { VideoProcessingApplication.class })
public class CucumberSpingConfiguration {}
