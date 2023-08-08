package com.google.android.gms.analytics;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.analytics.y */
public final class C40413y implements ThreadFactory {

    /* renamed from: a */
    public static final AtomicInteger f102992a = new AtomicInteger();

    public /* synthetic */ C40413y(C40412x xVar) {
    }

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = f102992a.incrementAndGet();
        StringBuilder sb = new StringBuilder(23);
        sb.append("measurement-");
        sb.append(incrementAndGet);
        return new C40414z(runnable, sb.toString());
    }

    public C40413y() {
    }
}
