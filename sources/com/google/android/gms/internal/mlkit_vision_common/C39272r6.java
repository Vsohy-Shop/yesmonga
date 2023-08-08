package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.r6 */
public class C39272r6 implements Closeable {

    /* renamed from: v */
    public static final Map<String, C39272r6> f100304v = new HashMap();

    /* renamed from: a */
    public final String f100305a;

    /* renamed from: b */
    public int f100306b;

    /* renamed from: c */
    public double f100307c;

    /* renamed from: d */
    public long f100308d;

    /* renamed from: e */
    public long f100309e;

    /* renamed from: f */
    public long f100310f;

    /* renamed from: g */
    public long f100311g;

    public C39272r6(String str) {
        this.f100310f = 2147483647L;
        this.f100311g = -2147483648L;
        this.f100305a = str;
    }

    /* renamed from: f */
    public static long m161334f() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    /* renamed from: g */
    public static C39272r6 m161335g(String str) {
        C39264q7.m161322a();
        if (!C39264q7.m161323b()) {
            return C39263q6.f100278w;
        }
        Map<String, C39272r6> map = f100304v;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C39272r6("detectorTaskWithResource#run"));
        }
        return map.get("detectorTaskWithResource#run");
    }

    /* renamed from: a */
    public final void mo123328a() {
        this.f100306b = 0;
        this.f100307c = 0.0d;
        this.f100308d = 0;
        this.f100310f = 2147483647L;
        this.f100311g = -2147483648L;
    }

    /* renamed from: b */
    public C39272r6 mo123317b() {
        this.f100308d = m161334f();
        return this;
    }

    /* renamed from: c */
    public void mo123318c(long j) {
        long f = m161334f();
        long j2 = this.f100309e;
        if (j2 != 0 && f - j2 >= 1000000) {
            mo123328a();
        }
        this.f100309e = f;
        this.f100306b++;
        this.f100307c += (double) j;
        this.f100310f = Math.min(this.f100310f, j);
        this.f100311g = Math.max(this.f100311g, j);
        if (this.f100306b % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", new Object[]{this.f100305a, Long.valueOf(j), Integer.valueOf(this.f100306b), Long.valueOf(this.f100310f), Long.valueOf(this.f100311g), Integer.valueOf((int) (this.f100307c / ((double) this.f100306b)))});
            C39264q7.m161322a();
        }
        if (this.f100306b % 500 == 0) {
            mo123328a();
        }
    }

    public void close() {
        long j = this.f100308d;
        if (j != 0) {
            mo123320d(j);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    /* renamed from: d */
    public void mo123320d(long j) {
        mo123318c(m161334f() - j);
    }
}
