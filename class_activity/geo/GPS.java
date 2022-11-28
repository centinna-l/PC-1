package geo;

public class GPS {
    double x, y;
    int t;

    GPS(double x, double y, int t) {
        this.x = x;
        this.y = y;
        this.t = t;
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }

    int getT() {
        return this.t;
    }

    String getCorrdinates() {
        return this.x + "," + this.y;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    void setT(int t) {
        this.t = t;
    }

}
