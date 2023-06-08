package task2;

import java.util.ArrayList;

public class FuelQueue {
    Passenger[] queue;
    int id;

    public FuelQueue(int id) {
        this.queue = new Passenger[6];
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void addPassenger(Passenger passenger) {
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }

        for (int i=0; i<this.queue.length; i++) {
            if (queue[i] == null) {
                queue[i] = passenger;
                break;
            }
        }
    }
}
