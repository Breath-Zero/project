package fanshe1;
//
///**
// * @ClassName: Test1
// * @Author: Mr.Ye
// * @Data: 2018-12-03 16:51
// **/
//
//interface IFruit {
//    void eat();
//}
//
//class Apple implements IFruit {
//
//    @Override
//    public void eat() {
//        System.out.println("吃苹果");
//    }
//}
//
//class Orange implements IFruit {
//
//    @Override
//    public void eat() {
//        System.out.println("吃橘子");
//    }
//}
//
//// 反射改造工厂模式
//class Factory {
//    public static IFruit getInstance(String name) {
//        IFruit fruit = null;
//        try {
//            Class<?> cls = Class.forName(name);
//            try {
//                fruit = (IFruit) cls.newInstance();
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return fruit;
//    }
//}
//
//public class Test1 {
//    public static void main(String[] args) {
//        IFruit fruit = Factory.getInstance("fanshe1.Apple");
//        fruit.eat();
//    }
//}



