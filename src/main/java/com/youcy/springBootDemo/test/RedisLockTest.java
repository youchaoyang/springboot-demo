//package com.youcy.springBootDemo.test;
//
//
//
//import org.junit.Before;
//import org.junit.Test;
//import org.redisson.Redisson;
//import org.redisson.api.RedissonClient;
//import org.redisson.config.Config;
//
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.Executor;
//import java.util.concurrent.Executors;
//import java.util.concurrent.TimeUnit;
//
///**
// * @Description:
// * @Author cy
// * @Date 2022/10/21
// */
//
//public class RedisLockTest {
//
//    private RedissonClient redissonClient;
//
//    //请求的key
//    private static final String demo = "u001";
//
//    //模拟短时间内的并发请求量
//
//    private static final int threadNum = 5;
//
//    @Before
//    public void init() {
//        Config config = new Config();
//        config.useSingleServer().setAddress("redis://120.78.144.70:6379");
//        this.redissonClient = Redisson.create(config);
//
//        System.out.println(Thread.currentThread().getName() + "是否存在key" + redissonClient.getLock(demo).isExists());
//    }
//
//    private class UserRequest implements Runnable {
//
//        private CountDownLatch cdl;
//
//        public UserRequest(CountDownLatch latch) {
//            this.cdl = latch;
//        }
//
//        @Override
//        public void run() {
//            try {
//                if (redissonClient.getLock(demo).tryLock(0L, -1L, TimeUnit.SECONDS)) {
//                    System.out.println(Thread.currentThread().getName() + "获取锁成功");
//                    Thread.sleep(5000);
//                    redissonClient.getLock(demo).unlock();
//                    System.out.println(Thread.currentThread().getName() + "释放锁成功");
//                } else {
//                    System.out.println(Thread.currentThread().getName() + "获取锁失败" + "是否存在key" + redissonClient.getLock(demo).isExists());
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                //倒计时计数一次
//                cdl.countDown();
//            }
//        }
//    }
//
//    @Test
//    public void testRedissonLock() {
//        CountDownLatch cdl = new CountDownLatch(threadNum);
//        Executor executor = Executors.newFixedThreadPool(threadNum);
//        try {
//            for (int i = 0; i < threadNum; i++) {
//                if (i == 2) {
//                    //模拟在业务代码没执行完毕时另一个线程获取锁
//                    Thread.sleep(1500);
//                }
//                executor.execute(new UserRequest(cdl));
//            }
//            //阻塞主线程，等待所有的子线程执行完毕
//            cdl.await();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//
