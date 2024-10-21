package week_5B.Lab;

class Engine {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
class Car {
    private String model;
    private Engine engine;

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getEngineType() {
        return engine.getType();
    }
}
public class Demo {
    public static void main(String[] args) {
        Engine engineObject = new Engine();
        engineObject.setType("V6");

        Car car1 = new Car();
        car1.setModel("Toyota Camry");
        car1.setEngine(engineObject);

        Car car2 = new Car();
        car2.setModel("Honda Accord");
        car2.setEngine(engineObject);

        System.out.println("Car 1 Model: " + car1.getModel());
        System.out.println("Car 1 Engine Type: " + car1.getEngineType());

        System.out.println("Car 2 Model: " + car2.getModel());
        System.out.println("Car 2 Engine Type: " + car2.getEngineType());

        engineObject.setType("V8");
        System.out.println("After changing engine type:");
        System.out.println("Car 1 Engine Type: " + car1.getEngineType());
        System.out.println("Car 2 Engine Type: " + car2.getEngineType());
    }
}
