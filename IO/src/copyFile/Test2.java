package copyFile;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws Exception {
        // 源文件路径
        String sourceFilePath = "C:\\Users\\Administrator\\Desktop\\Test.txt";
        // 目标文件路径
        String destFilePath = "C:\\Users\\Administrator\\Desktop\\Test1.txt";
        copyFile(sourceFilePath, destFilePath);
    }

    public static void copyFile(String sourceFilePath, String destFilePath) throws Exception {
        // 1. 取得源文件与目标文件的File对象
        File sourceFile = new File(sourceFilePath);
        File destFile = new File(destFilePath);
        // 2. 取得输入与输出流
        InputStream in = new FileInputStream(sourceFile);
        OutputStream out = new FileOutputStream(destFile);
        // 3. 数据的输入输出(以字节为单位拷贝)
        int len = 0;
        long start = System.currentTimeMillis();
        while ((len = in.read()) != -1) {
            out.write(len);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + "毫秒");

//        // 3. 数据的输入输出(以缓冲区为单位拷贝)
//        int len = 0;
//        byte[] data = new byte[1024];
//        long start = System.currentTimeMillis();
//        while ((len = in.read(data)) != -1) {
//            out.write(data, 0, len);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("共耗时：" + (end - start) + "毫秒");
    }
}
