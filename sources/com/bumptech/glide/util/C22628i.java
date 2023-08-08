package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* renamed from: com.bumptech.glide.util.i */
public final class C22628i {

    /* renamed from: a */
    public static final double f58016a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: a */
    public static double m102602a(long j) {
        return ((double) (m102603b() - j)) * f58016a;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m102603b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
