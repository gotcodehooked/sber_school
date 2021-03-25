package com.gotcodehooked.homework_lesson_6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.*;

public class CalcHandler implements InvocationHandler {

    private final Object delegate;
    private final Map<Object, Object> result = new HashMap<>();

    public CalcHandler(Calculator delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object invoke;

        if (!method.isAnnotationPresent(Cache.class)) return method.invoke(delegate, args);

        if (!result.containsKey(key(method, args))) {
            invoke = method.invoke(delegate, args);
            result.put(key(method, args), invoke);
        }

        System.out.println("Cache: " + result.get(key(method, args)));

        return result.get(key(method, args));

    }

    private Object key(Method method, Object[] args) {
        List<Object> key = new ArrayList<>();
        key.add(method);
        key.add(Arrays.asList(args));
        return key;
    }
}
