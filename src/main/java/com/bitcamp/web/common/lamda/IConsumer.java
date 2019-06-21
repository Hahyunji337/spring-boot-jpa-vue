package com.bitcamp.web.common.lamda;

/**
 * IConsumer
 */
@FunctionalInterface
public interface IConsumer {
    public abstract void accept(Object o);
}