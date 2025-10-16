package dev.ohhoonim.demo_ssr_react_graalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class DemoSsrReactGraalvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSsrReactGraalvmApplication.class, args);
	}
}
