package org.serwin.config_server.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HealthControllerTest {

    @Autowired
    private HealthController healthController;

    @Test
    void healthControllerIsNotNull() {
        assertThat(healthController).isNotNull();
    }

    @Test
    void healthReturnsCorrectStatus() {
        Map<String, String> response = healthController.health();
        assertThat(response.get("status")).isEqualTo("UP");
        assertThat(response.get("message")).isEqualTo("Config Server is running");
    }
}
