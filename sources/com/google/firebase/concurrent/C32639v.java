package com.google.firebase.concurrent;

import com.google.firebase.inject.C33058b;
import java.util.concurrent.Executors;

/* renamed from: com.google.firebase.concurrent.v */
public final /* synthetic */ class C32639v implements C33058b {
    public final Object get() {
        return ExecutorsRegistrar.m131792u(Executors.newFixedThreadPool(4, ExecutorsRegistrar.m131782k("Firebase Background", 10, ExecutorsRegistrar.m131780i())));
    }
}
