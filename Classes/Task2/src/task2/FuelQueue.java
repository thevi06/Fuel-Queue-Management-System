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

    public boolean isFull() {
        if(queue[5] != null){
            return true;
        }
        return false;
    }

    public void removePassenger() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i=this.queue.length-1; i>=0; i--) {
            if (queue[i] != null) {
                queue[i] = null;
                break;
            }
        }
    }

    public boolean isEmpty() {
        if (queue[0] == null) {
            return true;
        }
        return false;
    }

    public void viewPassengers() {
        if (this.queue[0] == null) {
            System.out.println(String.format(
                    "queue %d\n" +
                            "passenger count: %d\n" +
                            "passenger list:\n" +
                            "This queue is empty",
                    this.id,
                    getQueueLength()
            ));

            return;
        }

        System.out.println(String.format("queue %d\n" +
                        "passenger count: %d\n" +
                        "passenger list:",
                this.id,
                getQueueLength()
        ));

        for (Passenger passenger: this.queue) {
            if (passenger == null) {
                break;
            }
            System.out.println(passenger.getFullName());
        }
    }

    public int getQueueLength() {
        int count = 0;

        for (Passenger passenger: this.queue) {
            if (passenger != null) {
                count++;
            }
            else {
                break;
            }
        }

        return count;
    }
}
