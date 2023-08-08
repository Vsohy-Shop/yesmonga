package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* renamed from: com.google.firebase.concurrent.b */
public class C32616b implements ThreadFactory {

    /* renamed from: e */
    public static final ThreadFactory f79145e = Executors.defaultThreadFactory();

    /* renamed from: a */
    public final AtomicLong f79146a = new AtomicLong();

    /* renamed from: b */
    public final String f79147b;

    /* renamed from: c */
    public final int f79148c;

    /* renamed from: d */
    public final StrictMode.ThreadPolicy f79149d;

    public C32616b(String str, int i, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.f79147b = str;
        this.f79148c = i;
        this.f79149d = threadPolicy;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m131802b(Runnable runnable) {
        Process.setThreadPriority(this.f79148c);
        StrictMode.ThreadPolicy threadPolicy = this.f79149d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = f79145e.newThread(new C32615a(this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f79147b, Long.valueOf(this.f79146a.getAndIncrement())}));
        return newThread;
    }
}
