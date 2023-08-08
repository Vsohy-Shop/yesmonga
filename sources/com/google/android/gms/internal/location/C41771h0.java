package com.google.android.gms.internal.location;

import android.os.Looper;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.location.h0 */
public final class C41771h0 {
    /* renamed from: a */
    public static Looper m169042a(@C0363p0 Looper looper) {
        return looper != null ? looper : m169043b();
    }

    /* renamed from: b */
    public static Looper m169043b() {
        boolean z;
        if (Looper.myLooper() != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166209s(z, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
