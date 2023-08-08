package com.urbanairship.util;

import android.net.TrafficStats;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.d */
public class C9643d implements ThreadFactory {

    /* renamed from: b */
    public static final int f26420b = 11797;

    /* renamed from: c */
    public static final C9643d f26421c = new C9643d("UrbanAirship");

    /* renamed from: d */
    public static final AtomicInteger f26422d = new AtomicInteger(1);

    /* renamed from: a */
    public final String f26423a;

    /* renamed from: com.urbanairship.util.d$a */
    public class C9644a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f26424a;

        public C9644a(Runnable runnable) {
            this.f26424a = runnable;
        }

        public void run() {
            TrafficStats.setThreadStatsTag(C9643d.f26420b);
            Runnable runnable = this.f26424a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C9643d(@C0359n0 String str) {
        this.f26423a = str;
    }

    @C0359n0
    public Thread newThread(@C0363p0 Runnable runnable) {
        C9644a aVar = new C9644a(runnable);
        Thread thread = new Thread(aVar, this.f26423a + "#" + f26422d.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
