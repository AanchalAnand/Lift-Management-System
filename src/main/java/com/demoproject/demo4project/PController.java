package com.demoproject.demo4project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class PController {
    @Autowired
    PService service;

    @PostMapping("/add-lift")
    ResponseEntity addLift(@RequestBody Lift lift){
        service.addLift(lift);
        return new ResponseEntity<>("Added", HttpStatus.OK);
    }
    @PostMapping("/add-passenger")
    ResponseEntity addPassenger(@RequestBody Passenger passenger){
        service.addPassenger(passenger);
        return new ResponseEntity<>("Added", HttpStatus.OK);
    }
    @DeleteMapping("/delete")
    ResponseEntity delete(){
        service.delete();
        return new ResponseEntity<>("deleted",HttpStatus.OK);
    }

    @GetMapping("/people-with-x-weight/{lift}")
    ResponseEntity<Integer> peoplewithxweight(@PathVariable("lift") int liftno){
        int count= service.peoplewithxweight(liftno);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }

    @GetMapping("/maximum-of-x-wt")
    ResponseEntity maximumpeoplewithxweight(@RequestParam("wt") int wt,@RequestParam("lift") int liftno){
        int x=service.maximumpeoplewithxweight(wt,liftno);
        return new ResponseEntity<>(x,HttpStatus.OK);
    }
}
