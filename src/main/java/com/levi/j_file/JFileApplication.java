package com.levi.j_file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.levi.j_file.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class JFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(JFileApplication.class, args);
	}

}
