package com.google.firebase;

import android.os.SystemClock;
import androidx.annotation.C0359n0;
import com.google.auto.value.C32455c;

@C32455c
/* renamed from: com.google.firebase.p */
public abstract class C33277p {
    @C0359n0
    /* renamed from: a */
    public static C33277p m134170a(long j, long j2, long j3) {
        return new C32512a(j, j2, j3);
    }

    @C0359n0
    /* renamed from: e */
    public static C33277p m134171e() {
        return m134170a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* renamed from: b */
    public abstract long mo94598b();

    /* renamed from: c */
    public abstract long mo94599c();

    /* renamed from: d */
    public abstract long mo94600d();
}
