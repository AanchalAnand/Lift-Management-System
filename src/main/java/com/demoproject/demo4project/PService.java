package com.demoproject.demo4project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PService {
    @Autowired
    PRepository repository;

    void addLift(Lift lift){
        repository.addLift(lift);
    }
    void addPassenger(Passenger passenger){
       repository.addPassenger(passenger);
    }
    void delete(){
        repository.delete();
    }
    int peoplewithxweight(int liftno){
        return repository.peoplewithxweight(liftno);
    }
    int maximumpeoplewithxweight(int wt,int liftno){
        return repository.maximumpeoplewithxweight(wt,liftno);
    }
}
