package sg.nus.iss.ceramicraft_customer_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping
    public Map<String, String> getDemoData() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "This is demo data");
        return response;
    }
}
