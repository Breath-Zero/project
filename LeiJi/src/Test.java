import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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

//class Person {
//    private String name;
//    private Integer age;
//
//    public Person(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        } else if (obj == null) {
//            return false;
//        } else if (!(obj instanceof Person)) {
//            return false;
//        }
//        // 向下转型还原为Person对象
//        Person per = (Person) obj;
//        return this.name.equals(per.name) && this.age.equals(per.age);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        List<Person> list = new ArrayList<>();
//        list.add(new Person("张三", 20));
//        list.add(new Person("李四", 30));
//        list.add(new Person("黑子", 18));
//
//        System.out.println(list);
//        System.out.println(list.contains(new Person("李四", 30)));
//        System.out.println(list.size());
//        System.out.println(list);
//    }
//}


//============================
//// 自定义比较  Comparable接口

//class Person implements Comparable<Person> {
//    private String name;
//    private Integer age;
//
//    public Person(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        } else if (obj == null) {
//            return false;
//        } else if (!(obj instanceof Person)) {
//            return false;
//        }
//        // 向下转型还原为Person对象
//        Person per = (Person) obj;
//        return this.name.equals(per.name) && this.age.equals(per.age);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    /**
//     * 自定义类Person类如何比较大小
//     *
//     * @param o
//     * @return
//     */
//    @Override
//    public int compareTo(Person o) {
//        if (this.age > o.age) {
//            return 1;
//        } else if (this.age < o.age) {
//            return -1;
//        } else {
//            return this.name.compareTo(o.name);
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        // TreeSet会自动排序
//        Set<Person> set = new TreeSet<>();
//        set.add(new Person("张三", 20));
//        set.add(new Person("李四", 30));
//        set.add(new Person("黑子", 18));
//
//        System.out.println(set);
//    }
//}


//=========================================
//// 需要Compartor接口与

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

    // 升序比较器
    class AscAgeComparator implements Comparable<Person> {

        @Override
        public int compareTo(Person o) {
            return 0;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        // TreeSet会自动排序
        Set<Person> set = new TreeSet<>();
        set.add(new Person("张三", 20));
        set.add(new Person("李四", 30));
        set.add(new Person("黑子", 18));

        System.out.println(set);
    }
}
