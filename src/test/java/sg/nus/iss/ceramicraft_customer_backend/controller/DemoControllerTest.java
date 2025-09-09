package sg.nus.iss.ceramicraft_customer_backend.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoControllerTest {

    @Test
    void getDemoData() {
        DemoController demoController = new DemoController();
        assertNotNull(demoController.getDemoData());
        assertEquals("This is demo data", demoController.getDemoData().get("message"));
    }
}