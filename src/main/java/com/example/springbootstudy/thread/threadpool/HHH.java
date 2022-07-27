package com.example.springbootstudy.thread.threadpool;

public class HHH {

    /* *//**
     * @description:利用 Curator框架 生成唯一id （底层使用zk）
     * @author RenShiWei
     * Date: 2021/8/20 10:05
     *
     *//*
    @Slf4j
    public static class CuratorUniqueID {
        private static final CuratorFramework curatorFrameworkClient;
        private static RetryPolicy retryPolicy;
        private static final String IP = "127.0.0.1:2181";
        private static String ROOT = "/uniqueId-curator";
        private static String NODE_NAME = "/uniqueId";

        static {
            retryPolicy = new ExponentialBackoffRetry(1000, 3);
            curatorFrameworkClient = CuratorFrameworkFactory
                    .builder()
                    .connectString(IP)
                    .sessionTimeoutMs(5000)
                    .connectionTimeoutMs(5000)
                    .retryPolicy(retryPolicy).build();
            curatorFrameworkClient.start();

            try {
                //请先判断父节点/root节点是否存在Stat
                stat = curatorFrameworkClient.checkExists().forPath(ROOT);
                if (stat == null) {
                    curatorFrameworkClient.create().withMode(CreateMode.PERSISTENT).forPath(ROOT, null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        *//**
     * 生成唯一id
     *
     * @return 唯一id
     *//*
        public static String generateId() {
            String backPath = "";
            String fullPath = ROOT.concat(NODE_NAME);
            try {
                // 关键点：创建临时顺序节点
                backPath = curatorFrameworkClient.create().withMode(CreateMode.EPHEMERAL_SEQUENTIAL).forPath(fullPath, null);
                log.info("zk创建临时有序节点：{}", backPath);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return backPath.substring(ROOT.length() + NODE_NAME.length());
        }
    }*/
}
