package com.example.blink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlinkApplication {

    private String databaseConnector = "";

    public static void main(String[] args) {
        SpringApplication.run(BlinkApplication.class, args);
    }

    String sqlQuery = "INSERT INTO blink_db.users.tables.user_informations (id, name, surname, password, email) VALUES (1, 'Tarkan', 'Batar', '12345', 'tarkanbatar4@gmail.com')";

}
