package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.perf.util.g */
public class C33438g {

    /* renamed from: d */
    public static final /* synthetic */ boolean f81336d = false;

    /* renamed from: a */
    public long f81337a;

    /* renamed from: b */
    public long f81338b;

    /* renamed from: c */
    public TimeUnit f81339c;

    /* renamed from: com.google.firebase.perf.util.g$a */
    public static /* synthetic */ class C33439a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81340a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f81340a = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f81340a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f81340a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.util.C33438g.C33439a.<clinit>():void");
        }
    }

    public C33438g(long j, long j2, TimeUnit timeUnit) {
        this.f81337a = j;
        this.f81338b = j2;
        this.f81339c = timeUnit;
    }

    /* renamed from: a */
    public double mo96914a() {
        int i = C33439a.f81340a[this.f81339c.ordinal()];
        if (i == 1) {
            return (((double) this.f81337a) / ((double) this.f81338b)) * ((double) TimeUnit.SECONDS.toNanos(1));
        }
        if (i == 2) {
            return (((double) this.f81337a) / ((double) this.f81338b)) * ((double) TimeUnit.SECONDS.toMicros(1));
        }
        if (i != 3) {
            return ((double) this.f81337a) / ((double) this.f81339c.toSeconds(this.f81338b));
        }
        return (((double) this.f81337a) / ((double) this.f81338b)) * ((double) TimeUnit.SECONDS.toMillis(1));
    }
}
