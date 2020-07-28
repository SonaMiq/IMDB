package com.sonmiq.demo.initalization;

import java.sql.Connection;
import java.sql.SQLException;

public class createTables {
 private static Connection connection= sqlConnection.getInstance().getConnection();

    public boolean createTableUsers(){

        try {
            connection.createStatement().execute("create table Users(\n" +
                    "idUsers int not null primary key  auto_increment,\n" +
                    "username varchar(45) not null,\n" +
                    "password varchar(45) not null\n" +
                    ");");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }


    public boolean createTableMovies(){

        try {
            connection.createStatement().execute("create table Movies(\n" +
                    "idMovie int not null primary key  auto_increment,\n" +
                    "title varchar(70) not null,\n" +
                    "description varchar(1000),\n" +
                    "premierDate DATE\n"+
                    ");");
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean createTableActors(){

        try {
            connection.createStatement().execute("create table Actors(\n" +
                    "idActor int not null primary key  auto_increment,\n" +
                    "name varchar(45) not null,\n" +
                    "surname varchar(100) not null\n" +
                    ");");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    public boolean createTableWriters(){

        try {
            connection.createStatement().execute("create table Writers(\n" +
                    "idWriter int not null primary key  auto_increment,\n" +
                    "name varchar(45) not null,\n" +
                    "surname varchar(100) not null\n" +
                    ");");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    public boolean createTableProducers(){

        try {
            connection.createStatement().execute("create table Producers(\n" +
                    "idProducer int not null primary key  auto_increment,\n" +
                    "name varchar(45) not null,\n" +
                    "surname varchar(100) not null\n" +
                    ");");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean createTableMovieActors(){
        try {
            connection.createStatement().execute("create table MovieActors(\n" +
                    "idMovieActors int not null primary key  auto_increment,\n" +
                    "idMovie int not null,\n" +
                    "idActor int not null,\n" +
                    "foreign key (idMovie) REFERENCES movies(idMovie),\n"+
                            "foreign key (idActor) REFERENCES actors(idActor)\n"+
                    ");");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean createTableMovieWriters(){
        try {
            connection.createStatement().execute("create table MovieWriters(\n" +
                    "idMovieWriters int not null primary key  auto_increment,\n" +
                    "idMovie int not null,\n" +
                    "idWriter int not null,\n" +
                    "foreign key (idMovie) REFERENCES movies(idMovie),\n"+
                    "foreign key (idWriter) REFERENCES Writers(idWriter)\n"+
                    ");");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean createTableMovieProducers(){
        try {
            connection.createStatement().execute("create table MovieProducers(\n" +
                    "idMovieProducers int not null primary key  auto_increment,\n" +
                    "idMovie int not null,\n" +
                    "idProducer int not null,\n" +
                    "foreign key (idMovie) REFERENCES movies(idMovie),\n"+
                    "foreign key (idProducer) REFERENCES Producers(idProducer)\n"+
                    ");");
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}
