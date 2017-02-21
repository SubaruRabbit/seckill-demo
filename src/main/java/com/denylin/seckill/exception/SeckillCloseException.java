package com.denylin.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by DYL on 2017/2/10.
 */
public class SeckillCloseException extends SeckillException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}