public class Vehicle {
    protected Driver driver;


    public Vehicle() {
    }


    public void drive() {
    }

public void setDriver(Driver driver){   // overridas inne i car
        this.driver = driver;
}

    public Driver getDriver() {
        return driver;
    }
}
