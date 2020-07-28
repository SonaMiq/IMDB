package com.sonmiq.demo.user;

import com.sonmiq.demo.initalization.sqlConnection;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class UserController {

    private Connection connection= sqlConnection.getInstance().getConnection();

   /* @GetMapping("/users")
    public List<User> getAllUser() {
        return users;
    }
    */
    @PostMapping("/users")
    public void addUser(@RequestBody User user) throws SQLException {

        connection.createStatement().execute("insert into users(username, password) values('"+user.getUsername()+"','"+user.getPassword()+"');");
    }
    /*
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Integer id) {

       return users.stream().filter((user)->user.getId().equals(id)).findFirst().orElseThrow
               (()-> new RuntimeException("Resource not found"));

       // for (User user : users) {
       //     if(user.getId().equals(id)){
        //        return user;
         //   }
       // }
       // throw  new RuntimeException("Resource not found");
    }
    @PutMapping("/users")
    public void updateUser(@RequestBody User user){
        User remove_user = null;
        for (User u : users) {
            if(u.getId().equals(user.getId())){
                remove_user = u;
            }
        }
        if(remove_user != null) {
            users.remove(remove_user);
            users.add(user);
        }
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Integer id) {
        users.stream().filter((user)->{if(user.getId().equals(id))
                       return true; else return false;}).findFirst().get();
        User remove_user = null;
        for (User user : users) {
            if(user.getId().equals(id)){
                remove_user = user;
            }
        }
        if(remove_user != null) {
            users.remove(remove_user);
        }
    }

     */

}


