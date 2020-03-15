package com.chonggakne.project.demo;

import com.chonggakne.project.demo.model.Event;
import com.chonggakne.project.demo.model.EventRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class Initializer implements CommandLineRunner {
    private final EventRepository repository;

    public Initializer(EventRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) {
        Stream.of("React Study", "SpringBoot Study", "Go Home").forEach(context ->
                repository.save(new Event(context, true))
        );

        repository.findAll().forEach(System.out::println);
    }
}
