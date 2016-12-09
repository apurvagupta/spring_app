package com;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    public static final String INDEX = "index.html";

    @RequestMapping(path = "/hellos/{id}", method = RequestMethod.GET)
    public ResponseEntity hello() {
        return new ResponseEntity("{\"hello\": {\"id\":\"1\"}}", HttpStatus.OK);
    }

//
//    @RequestMapping(value = "/first", method = RequestMethod.GET)
//    public String emberRoute1() {
//        return INDEX;
//    }

//    @RequestMapping(value = "/ember-route-2", method = RequestMethod.GET)
//    public String emberRoute2() {
//        return INDEX;
//    }
}
