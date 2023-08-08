package com.google.firebase.concurrent;

import com.google.firebase.inject.C33058b;
import java.util.concurrent.Executors;

/* renamed from: com.google.firebase.concurrent.w */
public final /* synthetic */ class C32640w implements C33058b {
    public final Object get() {
        return ExecutorsRegistrar.m131792u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.m131782k("Firebase Lite", 0, ExecutorsRegistrar.m131791t())));
    }
}
