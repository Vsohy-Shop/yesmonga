package com.google.android.gms.common.util.concurrent;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@C40473a
/* renamed from: com.google.android.gms.common.util.concurrent.c */
public class C40971c implements ThreadFactory {

    /* renamed from: a */
    public final String f104214a;

    /* renamed from: b */
    public final AtomicInteger f104215b = new AtomicInteger();

    /* renamed from: c */
    public final ThreadFactory f104216c = Executors.defaultThreadFactory();

    @C40473a
    public C40971c(@C0359n0 String str) {
        C40843u.m166203m(str, "Name must not be null");
        this.f104214a = str;
    }

    @C0359n0
    public final Thread newThread(@C0359n0 Runnable runnable) {
        Thread newThread = this.f104216c.newThread(new C40972d(runnable, 0));
        String str = this.f104214a;
        int andIncrement = this.f104215b.getAndIncrement();
        newThread.setName(str + "[" + andIncrement + "]");
        return newThread;
    }
}
