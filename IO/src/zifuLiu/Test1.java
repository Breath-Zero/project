package zifuLiu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test1 {
    public static void main(String[] args) throws Exception{
        // 1 取得File对象
        File file = new File("C:" + File.separator + "Users" + File.separator
                + "Administrator" + File.separator + "Desktop" + File.separator  + "Test.txt");
        // 2 取得指定文件的输出流
        OutputStream out = new FileOutputStream(file, true);
        // 3 进行数据的输出
        String str = "你好！hello world !!!";
        out.write(str.getBytes(),0,15);
        // 4 关闭流
        out.close();
    }
}
