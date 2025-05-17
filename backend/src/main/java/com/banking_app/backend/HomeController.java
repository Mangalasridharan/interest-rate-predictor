package com.banking_app.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "✅ Interest Rate Predictor is running!";
    }

    // Optional: sample prediction endpoint
    @GetMapping("/predict")
    public String predict() {
        return "This is your prediction endpoint.";
    }
}
