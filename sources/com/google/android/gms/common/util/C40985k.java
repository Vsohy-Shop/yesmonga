package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
/* renamed from: com.google.android.gms.common.util.k */
public class C40985k implements C40979g {

    /* renamed from: a */
    public static final C40985k f104229a = new C40985k();

    @C40473a
    @C0359n0
    /* renamed from: d */
    public static C40979g m166636d() {
        return f104229a;
    }

    /* renamed from: a */
    public final long mo134768a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo134769b() {
        return SystemClock.currentThreadTimeMillis();
    }

    /* renamed from: c */
    public final long mo134770c() {
        return SystemClock.elapsedRealtime();
    }

    public final long nanoTime() {
        return System.nanoTime();
    }
}
