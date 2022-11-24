package lab_9;

public class Counter {
    protected int counter;

    Counter() {
        counter = 0;
    }

    public void increase() {
        counter++;
    }

    public void decrease() {
        if (counter < 0) {
            counter = 0;
        } else {
            counter--;
        }
    }

    public int getCounterValue() {
        return this.counter;
    }

    public void displayOutput() {
        System.out.println("The value of counter is: " + counter);
    }

    public String toString() {
        return (Integer.toString(counter));
    }

    public boolean equals(Counter otherCounter) {
        return (counter == otherCounter.counter);
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increase();
        counter.increase();
        counter.decrease();
        System.out.println("Value of Counter is " + counter.getCounterValue());
    }
}
