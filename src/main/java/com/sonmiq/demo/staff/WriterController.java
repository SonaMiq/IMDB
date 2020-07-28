package com.sonmiq.demo.staff;

import com.sonmiq.demo.initalization.sqlConnection;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class WriterController {

    private Connection connection= sqlConnection.getInstance().getConnection();

    @PostMapping("/writers")
    public void addWriter(@RequestBody Writer writer) throws SQLException {
        connection.createStatement().execute("insert into Writers(name, surname) values('"+writer.getName()+"','"+writer.getSurname()+"');");
    }
}
