public class Car extends Vehicle {

    public Car() {
        super();
        System.out.println("Car created, 100 miles to go");
    }
    @Override
    public void drive() {
        if (this.driver == null) {
            System.out.println("Car didn´t drive, there´s no driver");
        } else {
            System.out.println("Car drove 10 miles, 90 miles to go");
        }
    }
@Override
    public void setDriver(Driver driver){
        if(driver.getAge() < 18) {
            System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() + ", but must be 18 or older to drive car");
        } else {
            System.out.println("Driver changed to " + driver.getName());
            this.driver = driver;
        }
    }
}
