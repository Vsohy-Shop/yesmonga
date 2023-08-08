package com.google.firebase.concurrent;

import com.google.firebase.inject.C33058b;
import java.util.concurrent.Executors;

/* renamed from: com.google.firebase.concurrent.x */
public final /* synthetic */ class C32641x implements C33058b {
    public final Object get() {
        return ExecutorsRegistrar.m131792u(Executors.newCachedThreadPool(ExecutorsRegistrar.m131781j("Firebase Blocking", 11)));
    }
}
