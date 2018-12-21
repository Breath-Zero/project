package zifubianma;

<<<<<<< HEAD
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test3 {
    public static void main(String[] args) throws Exception{
        System.getProperties().list(System.out);

        File file = new File("C:\\Users\\Administrator\\Desktop\\Test.txt");
        String str = "你好！！！";
        OutputStream out = new FileOutputStream(file);
        // 编码
        out.write(str.getBytes(),0,5);
//        out.write(str.getBytes("ISO-8859-1"));
=======
public class Test3 {
    public static void main(String[] args) {

>>>>>>> 93068615e54b55853a52241f46d747e8e5860661
    }
}
