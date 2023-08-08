package com.google.firebase.concurrent;

import com.google.firebase.inject.C33058b;
import java.util.concurrent.Executors;

/* renamed from: com.google.firebase.concurrent.y */
public final /* synthetic */ class C32642y implements C33058b {
    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.m131781j("Firebase Scheduler", 0));
    }
}
