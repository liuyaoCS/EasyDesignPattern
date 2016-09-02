package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 【推荐】normal mode
 * 其实只要整个应用会使用这个实例，就需要构造，所以虽然这个方式不是使用时才构造，但其实是没有问题的。
 */
public class MySingleton {
    public static MySingleton mySingleton=new MySingleton();
    private MySingleton(){
    }
    public static MySingleton getInstance(){
        return mySingleton;
    }
}

/**
 * 懒汉模式 效率较低
 */
class MySingleton2{
    public static MySingleton2 mySingleton;
    private MySingleton2(){
    }
    public static synchronized  MySingleton2 getInstance(){
        if(mySingleton==null){
            mySingleton=new MySingleton2();
        }
        return mySingleton;
    }
}
/**
 * DCL mode jdk1.5以前会有dcl失效问题
 */
class MySingleton3{
    public static volatile  MySingleton3 mySingleton;
    private MySingleton3(){
    }
    public static  MySingleton3 getInstance(){
        if(mySingleton==null){
            synchronized(MySingleton3.class) {
                if(mySingleton==null){
                    //实际这句并不是原子操作，会被编译成3条汇编指令；由于Java编译器允许处理器乱序执行，2,3无法保证顺序。易产生DCL失效。
                    //jdk 1.5以后可以使用volatile声明mySingleton，确保mySingleton每次都从主内存中读取。
                    // 1 给MySingleton2分配内存
                    // 2 调用其构造函数，初始化成员字段
                    // 3 将mySingleton指向分配的内存空间
                    mySingleton=new MySingleton3();
                }
            }

        }
        return mySingleton;
    }
}
/**
 * 【推荐】静态内部类
 * 根据jvm原理，类的运行需要
 *  1 装载
 *  2 初始化 而静态类只有在使用的时候才初始化，静态块也在类被使用的时候才执行。
 */
class MySingleton4{

    public static  MySingleton4 getInstance(){

        return SingletonHolder.instance;
    }
    private static class SingletonHolder{
        //之所以把它声明为私有的，是因为外部类可以访问内部类（静态|非静态）的属性和方法(private|public),因为它就是外部类的一个字段。
        //只有非静态内部类可以访问外部类的属性和方法

        private static MySingleton4 instance=new MySingleton4();

    }

}

/**
 * 【推荐】容器模式 方便多单例的统一管理 android的实现方式
 * 因为使用的时候必然会调用registerService注册一次，之后都是用getService。所以没有多线程生成实例的线程安全问题。
 */
class SingletonManager {
    private static Map<String, Object> objMap = new HashMap<String,Object>();
    private SingletonManager() {}
    public static void registerService(String key, Object instance) {
        if (!objMap.containsKey(key) ) {
            objMap.put(key, instance);
        }
    }
    public static Object getService(String key) {
       return objMap.get(key) ;
    }
}