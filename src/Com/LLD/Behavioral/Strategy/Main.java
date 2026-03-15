package Com.LLD.Behavioral.Strategy;

import java.util.*;

interface RideMatchingAlgorithm {
    void matchRide(String location);
}

class HighWayAlgo implements RideMatchingAlgorithm{

    public void matchRide(String location) {
        System.out.println("highway" + location);
    }
}

class TrafficAlgo implements RideMatchingAlgorithm{

    public void matchRide(String location) {
        System.out.println("Traffic" + location);
    }
}

class StrategicImplementor {
    RideMatchingAlgorithm rideMatchingAlgorithm;

    StrategicImplementor(RideMatchingAlgorithm rideMatchingAlgorithm) {
        this.rideMatchingAlgorithm= rideMatchingAlgorithm;
    }

    void setRideMatchingAlgorithm(RideMatchingAlgorithm rideMatchingAlgorithm) {
        this.rideMatchingAlgorithm = rideMatchingAlgorithm;
    }

    void rideMatching(String location) {
        rideMatchingAlgorithm.matchRide(location);
    }
}

class Main {
    public static void main(String[] args) {
        RideMatchingAlgorithm traffic = new TrafficAlgo();                      //algos are different but same work.
        StrategicImplementor s1 = new StrategicImplementor(traffic);            //instead of if ,else use strategy
        s1.rideMatching("airport");

        RideMatchingAlgorithm highway = new HighWayAlgo();
        s1.setRideMatchingAlgorithm(highway);
        s1.rideMatching("chennai");
    }
}

