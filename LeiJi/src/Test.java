import java.util.ArrayList;
import java.util.List;

//public class Test {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(9);
//
//        System.out.println(list);
//        System.out.println(list.contains(3));
//        System.out.println(list.size());
//        System.out.println(list.remove(3));
//        System.out.println(list.set(0, 11));
//        System.out.println(list);
//    }
//}

////===========================

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (!(obj instanceof Person)) {
            return false;
        }
        // 向下转型还原为Person对象
        Person per = (Person) obj;
        return this.name.equals(per.name) && this.age.equals(per.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("张三", 20));
        list.add(new Person("李四", 30));
        list.add(new Person("黑子", 18));

        System.out.println(list);
        System.out.println(list.contains(new Person("李四", 30)));
        System.out.println(list.size());
        System.out.println(list);
    }
}
