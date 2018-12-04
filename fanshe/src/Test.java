import java.lang.reflect.Constructor;
import java.util.Date;

class Person{
    private Person(){}
}

public class Test {
    public static void main(String[] args) throws Exception{
        Date date = new Date();
        // 1. 取得data对象的class对象
        System.out.println(date.getClass());
        // 2. 类名称.class
        System.out.println(Date.class);
        // 3. 调用类的全名称 Class.forName
        System.out.println(Class.forName("java.util.Date"));

        //--------------------------------------

        Class<Date> cls = Date.class;
        // 通过反射产生Data类的对象
        // 相当于 Data data = new Data();
        Date date1 = cls.newInstance();
        System.out.println(date1);

        //--------------------------------------

        // 通过反射可以修改private的属性
        // 即使是封装的对象
        Class<Person> cls1 = Person.class;
        Constructor constructor = cls1.getDeclaredConstructor();
        constructor.setAccessible(true);
        Person person = (Person) constructor.newInstance();
        System.out.println(person);
    }
}
