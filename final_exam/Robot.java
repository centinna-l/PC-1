/*
 * 
 * Final Exam
 * Jerry Joy
 * 2203196
 */

class Robot {
    private String model;
    private int location;
    private int currentSpeed;
    private boolean movingForward;
    private int maxSpeed;

    // default Constructor
    Robot() {
        this.model = "Model";
        this.location = 0;
        this.currentSpeed = 0;
        this.movingForward = true;
        this.maxSpeed = 0;
    }

    // Parameterised Constructor
    Robot(String model, int location, int currentSpeed, boolean movingForward, int maxSpeed) {
        this.model = model;
        this.location = location;
        this.currentSpeed = currentSpeed;
        this.movingForward = movingForward;
        this.maxSpeed = maxSpeed;
    }

    // Parameterised Constructor
    Robot(String model, int location, int maxSpeed) {
        this.model = model;
        this.location = location;
        this.currentSpeed = 0;
        this.movingForward = true;
        this.maxSpeed = maxSpeed;
    }

    // Getters
    public String getModel() {
        return this.model;
    }

    public boolean direction() {
        return this.movingForward;
    }

    public int getLocation() {
        return this.location;
    }

    public void go() {
        this.currentSpeed = this.maxSpeed;
    }

    public void stop() {
        this.currentSpeed = 0;
    }

    public void turnAround() {
        this.movingForward = !this.movingForward;
    }

    public void move() {
        if (this.movingForward == true) {
            this.location = this.location + this.currentSpeed;
        }
        if (this.movingForward == false) {
            this.location = this.location - this.currentSpeed;
        }
    }

    public String toString() {
        String direction = this.movingForward ? "forward," : "backwards";
        String moving = this.currentSpeed > 0 ? " and moving at " + this.currentSpeed + " speed." : " not moving.";
        return this.model + " : Located at " + this.location + ", facing " + direction + moving;
    }
}