package org.lotus.servemonitor;

import org.lotus.servemonitor.mail.EmailServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServemonitorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ServemonitorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
