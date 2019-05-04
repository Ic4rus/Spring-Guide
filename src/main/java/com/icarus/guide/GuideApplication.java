package com.icarus.guide;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/com/icarus/guide/hello/integration.xml")
public class GuideApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext ctx = new SpringApplication(GuideApplication.class).run(args);
		System.out.println("Hit Enter to terminate");
		System.in.read();
		ctx.close();
	}

}
