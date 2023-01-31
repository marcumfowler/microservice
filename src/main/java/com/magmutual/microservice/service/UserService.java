package com.magmutual.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private final LocalDateTime date = LocalDateTime.now();

    @Bean
    public CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new User("William", "Fowler", "marcum.fowler@gmail.com","Software Engineer", "Atlanta", "GA", dtf.format(date))));
            log.info("Preloading " + repository.save(new User("Lexi", "Dolby", "lexi.dolby@lexidolby.com", "Recruiter", "Dunwoody", "GA", dtf.format(date))));
            log.info("Preloading " + repository.save((new User("William", "Parrish", "william.parrish@magmutual.com", "Manager", "Canton", "GA", dtf.format(date)))));
            log.info("Preloading " + repository.save((new User("Raleigh", "Barden", "raleigh.barden@magmutual.com", "Sr. Software Engineer", "Bangkok", "Thialand", dtf.format(date)))));
            repository.findAll().forEach(user -> log.info("Preloaded " + user));
        };
    }
}
