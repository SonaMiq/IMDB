package com.sonmiq.demo.staff;

import java.sql.Connection;
import java.sql.SQLException;

import com.sonmiq.demo.initalization.sqlConnection;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {

  private Connection connection=sqlConnection.getInstance().getConnection();

  @PostMapping("/actors")
    public void addActor(@RequestBody Actor actor) throws SQLException {
      connection.createStatement().execute("insert into Actors(name, surname) values('"+actor.getName()+"','"+actor.getSurname()+"');");
  }
}
