package net.software.backendcursojava.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.software.backendcursojava.Models.Request.UserDetailRequestModel;
import net.software.backendcursojava.Models.Responses.UserRest;

@RestController
@RequestMapping("/users") //http://localhost:8080/users
public class UserControlerr {

    @GetMapping
    public String getUser(){
        return "Obtener Usuarios";
    }

    @PostMapping
    public UserRest createuser(@RequestBody UserDetailRequestModel userDetails){
        return null;
    }



}
