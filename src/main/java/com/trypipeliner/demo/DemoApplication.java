package com.trypipeliner.demo;

import an.awesome.pipelinr.Pipeline;
import com.trypipeliner.demo.domain.Ping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	Pipeline pipeline;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	public void run(String... args) {

		pipeline.send(new Ping("champs"));


	}
}
