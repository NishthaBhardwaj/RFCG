package com.nishthasoft.genericfunctions;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {

    R execute(T x);
}
