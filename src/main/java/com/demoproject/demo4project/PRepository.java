package com.demoproject.demo4project;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class PRepository {
    HashMap<Integer,Lift> liftdb=new HashMap<>();
    HashMap<Integer,Passenger> passengerdb=new HashMap<>();

    void addLift(Lift lift){
        liftdb.put(lift.getLiftno(),lift);
    }
    void addPassenger(Passenger passenger){
        passengerdb.put(passenger.getPassengerid(),passenger);
    }
    void delete(){
       int x=5;
        for(int id: passengerdb.keySet()){
            if(id<x)
                passengerdb.remove(id);
        }
    }

    int peoplewithxweight(int liftno){
        int totalpeople=0;
        int totalweight=0;
        Lift lift=liftdb.get(liftno);
        for(Passenger passenger:passengerdb.values()) {
            if (passenger.getWeight() > 50) {
                totalpeople++;
                totalweight+=passenger.getWeight();

                while (totalpeople > lift.getCapacityinperson() || totalweight > lift.getCapacityinweight()) {
                    totalpeople--;
                    totalweight -= passenger.getWeight();
                }
            }
            }
        return totalpeople;
    }

    int maximumpeoplewithxweight(int wt,int liftno){
        int totalpeople=0;
        int totalweight=0;
        Lift lift=liftdb.get(liftno);
        for(Passenger passenger:passengerdb.values()) {
            if (passenger.getWeight() ==wt) {
                totalpeople++;
                totalweight+=passenger.getWeight();

                while (totalpeople > lift.getCapacityinperson() || totalweight > lift.getCapacityinweight()) {
                    totalpeople--;
                    totalweight -= passenger.getWeight();
                }
            }
        }
        return totalpeople;
    }
}
