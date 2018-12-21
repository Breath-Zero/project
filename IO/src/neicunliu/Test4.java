package neicunliu;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


//// 内存流实现小写转大写
public class Test4 {
    public static void main(String[] args) throws Exception{
        String msg = "hello world";
        // 将字符串读取到内存
        InputStream in = new ByteArrayInputStream(msg.getBytes());
        OutputStream out = new ByteArrayOutputStream();
        int len = 0;
        while ((len = in.read()) != -1) {
            // 首字母大写(一个字节一个字节)
            out.write(Character.toUpperCase(len));
        }
        System.out.println(out);
    }
}
