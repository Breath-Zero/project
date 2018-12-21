package zifuLiu;

import java.io.*;

////  1、OutPutStream字节输出流
//public class Test1 {
//    public static void main(String[] args) throws Exception{
//        // 1 取得File对象
//        File file = new File("C:" + File.separator + "Users" + File.separator
//                + "Administrator" + File.separator + "Desktop" + File.separator  + "Test.txt");
//        // 2 取得指定文件的输出流
//        OutputStream out = new FileOutputStream(file, true);
//        // 3 进行数据的输出
//        String str = "你好！hello world !!!";
//        out.write(str.getBytes(),0,15);
//        // 4 关闭流
//        out.close();
//    }
//}

////=========================================================================
////  2、InputStream字节输入流

public class Test1{
    public static void main(String[] args) throws Exception{
        // 1、取得终端对象
        File file = new File("C:" + File.separator + "Users" + File.separator
                + "Administrator" + File.separator + "Desktop" + File.separator  + "Test.txt");
        // 2、取得相应的输入流
        InputStream in = new FileInputStream(file);
        // 3、进行数据的读取
        byte[] data = new byte[1024];
        int len = in.read(data);
        System.out.println(new String(data, 0, len));
        // 4、关闭流
        in.close();
    }
}
