import java.io.File;
import java.io.IOException;

/**
 * @ClassName: Test
 * @Author: Mr.Ye
 * @Data: 2018-12-07 19:02
 **/


//public class Test {
//    public static void main(String[] args) {
//        // 1 取得File对象
//        File file = new File("C:" + File.separator + "Users" + File.separator
//                + "Administrator" + File.separator + "Desktop" + File.separator +
//                "www" + File.separator + "123" + File.separator + "Test.java");
//        // 2 判断父路径是否存在，不存在创建多级父路径
//        if (!file.getParentFile().exists()) {
//            file.getParentFile().mkdirs();
//        }
//        // 3 判断文件是否存在，不存在则创建文件
//        if (file.exists()) {
//            System.out.println("文件已存在");
//        } else {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}


////=============================================

public class Test {
    public static void main(String[] args) {
        // 1 取得File对象
        File file = new File("C:" + File.separator + "Users" + File.separator
                + "Administrator" + File.separator + "Desktop");
        // 2 将IO存在放在子线程中进行
        new Thread(() -> {
            long start = System.currentTimeMillis();
            listAllFiles(file);
            long end = System.currentTimeMillis();
            System.out.println("桌面文件遍历结束，耗时：" + (end - start) + "毫秒");
        }).start();
        System.out.println("main线程结束");
    }

    public static void listAllFiles(File file) {
        if (file.isFile()) {
            System.out.println(file);
        } else {
            if (file.exists() && file.isDirectory()) {
                File[] files = file.listFiles();
                for (File file1 : files) {
                    listAllFiles(file1);
                }
            }
        }
    }
}

































