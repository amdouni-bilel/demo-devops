package com.example.projetmpisi.steps;

import com.example.projetmpisi.DemoDevopsApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = DemoDevopsApplication.class)
public class CucumberSpringConfiguration {
}
