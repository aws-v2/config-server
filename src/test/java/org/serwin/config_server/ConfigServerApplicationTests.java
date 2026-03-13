package org.serwin.config_server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.serwin.config_server.controller.HealthController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ConfigServerApplicationTests {

	@Autowired
	private HealthController healthController;

	@Test
	void contextLoads() {
		assertThat(healthController).isNotNull();
	}

}
