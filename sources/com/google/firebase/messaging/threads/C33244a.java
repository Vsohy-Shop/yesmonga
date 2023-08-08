package com.google.firebase.messaging.threads;

import com.google.errorprone.annotations.C32495d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.firebase.messaging.threads.a */
public interface C33244a {
    /* renamed from: a */
    ExecutorService mo96197a(ThreadPriority threadPriority);

    /* renamed from: b */
    ScheduledExecutorService mo96198b(int i, ThreadFactory threadFactory, ThreadPriority threadPriority);

    /* renamed from: c */
    ExecutorService mo96199c(ThreadPriority threadPriority);

    /* renamed from: d */
    Future<?> mo96200d(@C32495d String str, @C32495d String str2, ThreadPriority threadPriority, Runnable runnable);

    /* renamed from: e */
    void mo96201e(@C32495d String str, @C32495d String str2, ThreadPriority threadPriority, Runnable runnable);

    /* renamed from: f */
    ScheduledExecutorService mo96202f(int i, ThreadPriority threadPriority);

    /* renamed from: g */
    ExecutorService mo96203g(int i, ThreadFactory threadFactory, ThreadPriority threadPriority);

    /* renamed from: h */
    ExecutorService mo96204h(int i, ThreadPriority threadPriority);

    /* renamed from: i */
    ExecutorService mo96205i(ThreadFactory threadFactory, ThreadPriority threadPriority);

    /* renamed from: j */
    ExecutorService mo96206j(ThreadFactory threadFactory, ThreadPriority threadPriority);
}
