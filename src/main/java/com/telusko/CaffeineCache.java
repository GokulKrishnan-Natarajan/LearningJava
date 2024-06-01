package com.telusko;

public class CaffeineCache {
    public static void main(String[] args) {
        //CaffeineCache caffeineCache = new CaffeineCache();
        CaffeineCache caffeineCache = CaffeineCache.getInstance();
        System.out.println(caffeineCache);

        assert caffeineCache != null;
        Class<? extends CaffeineCache> caffeineCacheClass = caffeineCache.getClass();

    }

    private static CaffeineCache getInstance() {
        return null;
    }
}
