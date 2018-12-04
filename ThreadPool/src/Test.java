import java.util.concurrent.*;


//class MyThead implements Runnable{
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + "、"+ i);
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        MyThead myThead = new MyThead();
//        // 手工创线程池
//        // 参数1：核心大小  2：最大数量  3：2000个单位 4：时间  5：使用的阻塞队列
//        ExecutorService executorService = new ThreadPoolExecutor(3, 5, 2000, TimeUnit.MICROSECONDS, new LinkedBlockingDeque<>());
//
//        /**
//         * 此时只会创建三个线程，并且交替进行。不会超过最大数量5。因为每个线程执行的时间非常短，
//         * 所以不会达到最大值
//         */
//        for (int i = 0; i < 5; i++) {
//            executorService.execute(myThead);
//        }
//        // 关闭线程池
//        executorService.shutdown();
//    }
//}


////-----Callable----------------------

class MyThead implements Callable<String> { // Callable有返回值

    @Override
    public String call() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "、"+ i);
        }
        return Thread.currentThread().getName()+"执行完毕";
    }
}

public class Test {
    public static void main(String[] args) throws Exception{
        MyThead myThead = new MyThead();
        // 手工创线程池
        // 参数1：核心大小  2：最大数量  3：2000个单位 4：时间  5：使用的阻塞队列
        ExecutorService executorService = new ThreadPoolExecutor(3, 5, 2000, TimeUnit.MICROSECONDS, new LinkedBlockingDeque<>());

        /**
         * 此时只会创建三个线程，并且交替进行。不会超过最大数量5。因为每个线程执行的时间非常短，
         * 所以不会达到最大值
         */
//        for (int i = 0; i < 5; i++) {
//           executorService.submit(myThead);
//        }

        /**
         * 当调用future的get方法，不会交替进行。会阻塞其他线程，直到取得当前线程执行完毕后的返回值。
         */
        for (int i = 0; i < 5; i++) {
            Future future = executorService.submit(myThead);
            System.out.println(future.get());
        }
        // 关闭线程池
        executorService.shutdown();
    }
}
