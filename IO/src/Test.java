import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: Test
 * @Author: Mr.Ye
 * @Data: 2018-12-07 19:02
 **/

//// 1、取得文件目录的操作

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


//// 2、取得文件信息=============================================

//public class Test{
//    public static void main(String[] args) {
//        // 取得File对象
//        File file = new File("C:" + File.separator + "Users" + File.separator
//                + "Administrator" + File.separator + "Desktop" + File.separator + "test.java");
//        // 判断文件是否存在
//        System.out.println(file.exists());
//        // 判断是否是一个文件
//        System.out.println(file.isFile());
//        // 判断父路径是否是一个文件夹
//        System.out.println(file.getParentFile().isDirectory());
//
//        // 判断文件是否存在的方法
//        if (file.exists() && file.isFile()){
//            // 取得大小
//            System.out.println(file.length());
//            // 取得上次修改时间（1970 1 1）
//            System.out.println(file.lastModified());
//
//            Date date = new Date(file.lastModified());
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            System.out.println(simpleDateFormat.format(date));
//
//            // 取得目录的组成
//            File[] files = file.listFiles();
//            for (File file1 : files) {
//                System.out.println(file1);
//            }
//        }
//    }
//}

//// 3、列出一个目录的全部组成(桌面)=============================================

//public class Test {
//    public static void main(String[] args) {
//        // 1 取得File对象
//        File file = new File("C:" + File.separator + "Users" + File.separator
//                + "Administrator" + File.separator + "Desktop");
//        // 2 将IO存在放在子线程中进行
//        new Thread(() -> {
//            long start = System.currentTimeMillis();
//            listAllFiles(file);
//            long end = System.currentTimeMillis();
//            System.out.println("桌面文件遍历结束，耗时：" + (end - start) + "毫秒");
//        }).start();
//        System.out.println("main线程结束");
//    }
//
//    public static void listAllFiles(File file) {
//        if (file.isFile()) {
//            System.out.println(file);
//        } else {
//            if (file.exists() && file.isDirectory()) {
//                File[] files = file.listFiles();
//                for (File file1 : files) {
//                    listAllFiles(file1);
//                }
//            }
//        }
//    }
//}

































