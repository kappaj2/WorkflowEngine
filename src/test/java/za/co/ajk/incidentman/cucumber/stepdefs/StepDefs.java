package za.co.ajk.incidentman.cucumber.stepdefs;

import za.co.ajk.incidentman.WorkflowEngineApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = WorkflowEngineApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
