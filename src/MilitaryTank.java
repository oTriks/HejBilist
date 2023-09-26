public class MilitaryTank extends Vehicle {
    public MilitaryTank() {
        super();
        System.out.println("Tank created, 2000 miles to go");
    }

    @Override
    public void drive() {
        if (this.driver == null) {
            System.out.println("Tank didn´t drive, there´s no driver");
        } else {
            System.out.println("Tank drove 5 miles - 1995 miles to go");
        }
    }

    @Override
    public void setDriver(Driver driver) {
        if (driver.getAge() < 25) {
            System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() + ", but must be 25 or older to drive military tank");
        } else {
            System.out.println("Driver changed to " + driver.getName());
            this.driver = driver;
        }
    }
}
