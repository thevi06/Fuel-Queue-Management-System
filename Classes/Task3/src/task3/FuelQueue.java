package task3;

import java.util.ArrayList;

public class FuelQueue {
    Passenger[] queue;
    ArrayList<Passenger> waitingList;
    int id;

    public FuelQueue(int id) {
        this.queue = new Passenger[6];
        this.waitingList = new ArrayList<>();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void addPassenger(Passenger passenger) {
        if(isFull()){
            System.out.println("Queue is full, added to waiting list");
            this.waitingList.add(passenger);
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
