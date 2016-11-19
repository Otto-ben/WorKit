package main.java.ch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"me.ramswaroop.jbot", "ch.jbot"})
public class WorKitApplication {
	public static void main(String[] args) {
        SpringApplication.run(WorKitApplication.class, args);
    }
}
