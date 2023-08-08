package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import com.google.android.gms.common.util.concurrent.C40970b;
import com.google.firebase.messaging.threads.C33245b;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.o */
public class C33217o {

    /* renamed from: a */
    public static final String f80763a = "Firebase-Messaging-Network-Io";

    /* renamed from: b */
    public static final String f80764b = "Firebase-Messaging-Task";

    /* renamed from: c */
    public static final String f80765c = "Firebase-Messaging-File";

    /* renamed from: d */
    public static final String f80766d = "Firebase-Messaging-Intent-Handle";

    /* renamed from: e */
    public static final String f80767e = "Firebase-Messaging-Topics-Io";

    /* renamed from: f */
    public static final String f80768f = "Firebase-Messaging-Init";

    /* renamed from: g */
    public static final String f80769g = "Firebase-Messaging-File-Io";

    /* renamed from: h */
    public static final String f80770h = "Firebase-Messaging-Rpc-Task";

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: a */
    public static Executor m134012a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C40970b(str));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: b */
    public static ExecutorService m134013b() {
        return Executors.newSingleThreadExecutor(new C40970b(f80765c));
    }

    /* renamed from: c */
    public static Executor m134014c() {
        return m134012a(f80769g);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: d */
    public static ScheduledExecutorService m134015d() {
        return new ScheduledThreadPoolExecutor(1, new C40970b(f80768f));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: e */
    public static ExecutorService m134016e() {
        return C33245b.m134091a().mo96205i(new C40970b(f80766d), ThreadPriority.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: f */
    public static ExecutorService m134017f() {
        return Executors.newSingleThreadExecutor(new C40970b(f80763a));
    }

    /* renamed from: g */
    public static Executor m134018g() {
        return m134012a(f80770h);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: h */
    public static ExecutorService m134019h() {
        return Executors.newSingleThreadExecutor(new C40970b(f80764b));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: i */
    public static ScheduledExecutorService m134020i() {
        return new ScheduledThreadPoolExecutor(1, new C40970b(f80767e));
    }
}
