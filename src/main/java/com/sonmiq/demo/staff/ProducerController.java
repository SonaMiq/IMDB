package com.sonmiq.demo.staff;

import com.sonmiq.demo.initalization.sqlConnection;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class ProducerController {

    private Connection connection= sqlConnection.getInstance().getConnection();

    @PostMapping("/producers")
    public void addProducer(@RequestBody Producer producer){
        try {
            connection.createStatement().execute("insert into Producers(name, surname) values('"+producer.getName()+"', '"+producer.getSurname()+"');");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

