package br.com.aquitabom.web;

import java.time.Instant;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/ping")
    public Map<String, Object> ping() {
        return Map.of(
                "app", "aqui-ta-bom-backend",
                "status", "UP",
                "timestamp", Instant.now().toString()
        );
    }

}
