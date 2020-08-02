class Car {

    int yearModel;
    String make;
    int speed;

    void accelerate() {
        speed = speed + 5;
    }

    void brake() {

        if (speed > 0) {
            speed = speed - 5;
        }

    }

}