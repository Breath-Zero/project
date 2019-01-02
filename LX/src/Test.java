
/**
 * 1. 使用for循环打印乘法口诀表
 * 2. 递归实现20!
 * 3. 使用递归实现快速排序(Java实现)
 * 4. 使用数组静态初始化方式初始化一个大小为10的整型数组并输出。
 * <p>
 * 1.创建一个Test类，包含有一个public权限的int型成员变量与一个char类型的成员变量，观察在main方法中的初始值。
 * <p>
 * 2.编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类的某个特定的static成员变量只有一个属性。
 * <p>
 * 3.一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字(从第三个数字起)
 * 都是前两个数字的和。创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个
 * 数所构成的所有斐波那契数字。例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该
 * 是1、1、2、3、5。
 * <p>
 * 4.创建一个带默认构造方法（即无参构造）的类，在构造方法中打印一条消息"Hello Constructor";
 * 再为这个类添加一个重载构造方法，令其接收一个字符串参数，并在这个有参构造方法中把
 * "Hello Constructor"和接收的参数一起打印出来。
 * <p>
 * 1.创建一个Test类，包含有一个public权限的int型成员变量与一个char类型的成员变量，观察在main方法中的初始值。
 * <p>
 * 2.编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类的某个特定的static成员变量只有一个属性。
 * <p>
 * 3.一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字(从第三个数字起)
 * 都是前两个数字的和。创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个
 * 数所构成的所有斐波那契数字。例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该
 * 是1、1、2、3、5。
 * <p>
 * 4.创建一个带默认构造方法（即无参构造）的类，在构造方法中打印一条消息"Hello Constructor";
 * 再为这个类添加一个重载构造方法，令其接收一个字符串参数，并在这个有参构造方法中把
 * "Hello Constructor"和接收的参数一起打印出来。
 * <p>
 * 1.创建一个Test类，包含有一个public权限的int型成员变量与一个char类型的成员变量，观察在main方法中的初始值。
 * <p>
 * 2.编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类的某个特定的static成员变量只有一个属性。
 * <p>
 * 3.一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字(从第三个数字起)
 * 都是前两个数字的和。创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个
 * 数所构成的所有斐波那契数字。例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该
 * 是1、1、2、3、5。
 * <p>
 * 4.创建一个带默认构造方法（即无参构造）的类，在构造方法中打印一条消息"Hello Constructor";
 * 再为这个类添加一个重载构造方法，令其接收一个字符串参数，并在这个有参构造方法中把
 * "Hello Constructor"和接收的参数一起打印出来。
 */

//public class Test {
//    public static void main(String[] args) {
//        int sum = 0; // 乘积
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                sum = i * j;
//                System.out.print(j + "*" + i + "=" + sum + "\t");
//            }
//            System.out.println();
//        }
//    }
//}

//// 2、---------------------------------------

//public class Test {
//    public static void main(String[] args) {
//        System.out.println(print_sum(20));
//    }
//
//    public static long print_sum(long n) {
//        if (n == 1) {
//            return 1;
//        }else {
//            return n * print_sum(n - 1);
//        }
//    }
//}

//// 3、---------------------------------------

//public class Test {
//    public static void main(String[] args) {
//        int[] data = new int[]{1,3,2,9,7,4,6,8,20,17,25,21};
//        quickSort(data,0,data.length-1);
//        for (int temp : data) {
//            System.out.print(temp+"、");
//        }
//    }
//    private static void Swap(int[] array, int x, int y){
//        int xx = array[x];
//        int yy = array[y];
//        array[x] = yy;
//        array[y] = xx;
//    }
//    private static int GetMidIndex(int[] arr,int left,int right){
//        int mid = left + ((right - left) >>1 );
//
//        if(arr[left] < arr[right]){
//            if(arr[mid] < arr[left])
//                return left;
//            if(arr[mid] > arr[right])
//                return right;
//            else
//                return mid;
//        }else {
//            if(arr[mid] > arr[left])
//                return left;
//            if(arr[mid] < arr[right])
//                return right;
//            else
//                return mid;
//        }
//    }
//
//    private static int Partition(int[] arr, int left, int right){
//        int begin =left;
//        int end = right;
//        int mid = GetMidIndex(arr,begin,end);
//        int key ; // 设置标准值
//        Swap(arr,mid,end); // 交换基准值到最右边
//        key = arr[end];
//        while (begin < end){
//            while (begin < end && arr[begin] <= key){
//                ++begin;
//            }
//            while (begin < end && arr[end] >= key){
//                --end;
//            }
//            if(begin < end){
//                Swap(arr,begin,end);
//            }
//        }
//        if(begin != right){
//            Swap(arr,begin,right);
//        }
//        return begin;
//    }
//
//    public static void quickSort(int[] arr, int start, int end) {
//        if (start < end) {
//            int index = Partition(arr, start, end);
//            quickSort(arr, start, index - 1);
//            quickSort(arr, index + 1, end);
//        }
//    }
//}

//// 4、---------------------------------------


//public class Test{
//    public static void main(String[] args) {
//        int[] sum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println("数组大小为：" + sum.length);
//        for (int temp : sum) {
//            System.out.print(temp + "、");
//        }
//    }
//}

////===================================

/**
 * 1.创建一个Test类，包含有一个public权限的int型成员变量与一个char类型的成员变量，观察在main方法中的初始值。
 *
 * 2.编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类的某个特定的static成员变量只有一个属性。
 *
 * 3.一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字(从第三个数字起)
 *    都是前两个数字的和。创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个
 *    数所构成的所有斐波那契数字。例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该
 *    是1、1、2、3、5。
 *
 * 4.创建一个带默认构造方法（即无参构造）的类，在构造方法中打印一条消息"Hello Constructor";
 *  再为这个类添加一个重载构造方法，令其接收一个字符串参数，并在这个有参构造方法中把
 *  "Hello Constructor"和接收的参数一起打印出来。
 */

//class Person{
//    public int a;
//    public char b;
//}
//
//public class Test{
//    public static void main(String[] args) {
//        Person person = new Person();
//        System.out.println(person.a);
//        System.out.println(person.b);
//    }
//}

//// 2、-------------------------------------

/**
 * static关键字的作用：
 * （1）设置变量的存储域，函数体内static变量的作用范围为该函数体，不同于auto变量，
 * 该变量的内存只被分配一次，因此其值在下次调用时仍维持上次的值；
 * （2）限制变量的作用域，在模块内的static全局变量可以被模块内所用函数访问，
 * 但不能被模块外其它函数访问；
 * （3）限制函数的作用域，在模块内的static函数只可被这一模块内的其它函数调用，
 * 这个函数的使用范围被限制在声明它的模块内；
 * （4）在类中的static成员变量意味着它为该类的所有实例所共享，也就是说当某个类的实例修改了该静态成员变量，
 * 其修改值为该类的其它所有实例所见；
 * （5）在类中的static成员函数属于整个类所拥有，这个函数不接收this指针，因而只能访问类的static成员变量。
 */

//class Person {
//    private static String country;
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public static void setCountry(String country) {
//        Person.country = country;
//    }
//
//    public void getPersonInfo(){
//        System.out.println("姓名:"+this.name+",年龄:"+this.age+",国家:"+this.country);
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Person.setCountry("中国");
//        Person per = new Person("张三", 20);
//        Person per1 = new Person("李四", 18);
//        per.getPersonInfo();
//        per1.getPersonInfo();
//    }
//}


//// 3、-------------------------------------

//public class Test {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(fibonacci(i) + "、");
//        }
//    }
//
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }
//}

//// 4、------------------------------------

//class Person {
//    public Person() {
//        System.out.println("Hello Constructor!!!");
//    }
//
//    public Person(String str) {
//        this();
//        System.out.println(str);
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        Person person = new Person("Hello World!!!");
//    }
//}

//// =====================================================

//class Father {
//    private String name = "zhangjun";
//    class Child {
//        public void introFather() {
//            System.out.println("Father's name = " + name);
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Father.Child child = new Father().new Child();
//        child.introFather();
//    }
//}

// 4、------------------------------
//public class Test {
//    public static void main(String[] args) {
//        for (int i = 100; i <= 999; i++) {
//            if (isFlower(i)) {
//                System.out.printf(" %d", i);
//            }
//        }
//    }
//
//    public static boolean isFlower(int num) {
//        int a1 = (num % 10) % 10; //个位数
//        int a2 = (num / 10) % 10; //十位数
//        int a3 = num / 100; //百位数
//
//        if (num == (Math.pow(a1, 3) + Math.pow(a2, 3) + Math.pow(a3, 3))) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}

//----------------------------------

//abstract class Role {
//    private String name;
//    private int age;
//    private String sex;
//
//    public Role(String name, int age, String sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
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
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    abstract void play();
//
//    public Role(){
//        System.out.println("Role的无参构造！！");
//    }
//
//    public Role(String str){
//        System.out.println("Role的有参构造！！");
//    }
//}
//
//class Employee extends Role{
//    private double salary;
//    private static int ID;
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public static int getID() {
//        return ID;
//    }
//
//    public static void setID(int ID) {
//        Employee.ID = ID;
//    }
//
//    public Employee(String name, int age, String sex, double salary, int ID) {
//        super(name, age, sex);
//        this.salary = salary;
//        this.ID = ID;
//    }
//
//    public Employee(double salary) {
//        this.salary = salary;
//    }
//
//    public Employee(String str, double salary) {
//        super(str);
//        this.salary = salary;
//    }
//
//    @Override
//    void play() {
//        System.out.println("play的覆写方法！！");
//    }
//
//    final void sing(){
//        System.out.println("姓名:" + getName() + ",年龄:" + getAge() + ",性别:"
//                + getSex() + ",工资:" + getSalary() + ",ID:" + getID());
//    }
//}
//
//class Manager extends Employee{
//    final String vehicle;
//
//    public Manager(String name, int age, String sex, double salary, int ID, String vehicle) {
//        super(name, age, sex, salary, ID);
//        this.vehicle = vehicle;
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Employee e = new Employee("张三", 27, "男", 3000,888888);
//        e.play();
//        e.sing();
//        Manager m = new Manager("李四", 29, "男", 4000, 444444, "奥迪");
//        m.play();
//        m.sing();
//        System.out.println("李四坐骑是:"+m.vehicle);
//    }
//}


