package com.cgg.asynnocouplinga.utils;

/**
 * @author cgg
 */
public class UuidUtil {

    public static Long uuid() {
        return IdSnowflakeWorker.getGenerateId();
    }

    public static void main(String[] args) {
        System.out.println(IdSnowflakeWorker.getGenerateId());
    }
}
