package factory;


/**
 * 如果产品的构造没有太大差异，就不需要先创建工厂类
 */
public class CarFactory {
    public static <T extends Car>T createCar(Class<T> clz){
        T car= null;
        try {
            car = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return car;
    }
}
/**
 * 如果产品构造差异较大，可以为工厂类先创建抽象类（或者设计公共接口）
 * 这是标准的工厂模式，包含：抽象工厂，具体工厂，抽象产品，具体产品。
 */
abstract class Factory{
    abstract Car createCar();
}
class AudiCarFactory extends Factory{

    @Override
    Car createCar() {
        return new AudiCar();
    }
}
/**
 * 只要是统一了产品的创建，就是工厂类。
 */
class CarFactory2 {
    public Car createCar(String carName){
        Car car=null;
        switch (carName){
            case "AudiCar":
                car=new AudiCar();
                break;
            case "BwmCar":
                car=new BwmCar();
                break;
            default:
                break;
        }
        return car;
    }
}
class CarFactory3{
    public Car createAudiCar(){
        return new AudiCar();
    }
    public Car createBwmCar(){
        return new BwmCar();
    }
}
