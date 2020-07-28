package com.sonmiq.demo.movie;

import com.sonmiq.demo.staff.Actor;
import com.sonmiq.demo.staff.Producer;
import com.sonmiq.demo.staff.Writer;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Movie {

   private String title;
   private String description;
   private LocalDate premierDate;
   private List<Producer> producers;
   private List<Writer> writers;
   private List<Actor> actors;

    public Movie(String title, String description,LocalDate premierDate,
                 List<Producer> producers,
                 List<Writer> writers,
                 List<Actor> actors) {

        this.title = title;
        this.description = description;
        this.premierDate = premierDate;
        this.producers = producers;
        this.writers = writers;
        this.actors = actors;
    }

}
