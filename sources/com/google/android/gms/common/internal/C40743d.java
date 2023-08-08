package com.google.android.gms.common.internal;

import android.os.Looper;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.firebase.messaging.C33168b1;
import javax.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@C40473a
/* renamed from: com.google.android.gms.common.internal.d */
public final class C40743d {
    public C40743d() {
        throw new AssertionError("Uninstantiable");
    }

    @C40473a
    /* renamed from: a */
    public static void m165777a(@C0359n0 String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder();
            sb.append("checkMainThread: current thread ");
            sb.append(valueOf);
            sb.append(" IS NOT the main thread ");
            sb.append(valueOf2);
            sb.append(C33168b1.f80509d);
            throw new IllegalStateException(str);
        }
    }

    @C40473a
    /* renamed from: b */
    public static void m165778b(@C0359n0 String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder();
            sb.append("checkNotMainThread: current thread ");
            sb.append(valueOf);
            sb.append(" IS the main thread ");
            sb.append(valueOf2);
            sb.append(C33168b1.f80509d);
            throw new IllegalStateException(str);
        }
    }

    @C40473a
    @EnsuresNonNull({"#1"})
    /* renamed from: c */
    public static void m165779c(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @C40473a
    @EnsuresNonNull({"#1"})
    /* renamed from: d */
    public static void m165780d(@Nullable Object obj, @C0359n0 Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @C40473a
    /* renamed from: e */
    public static void m165781e(@C0359n0 Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @C40473a
    /* renamed from: f */
    public static void m165782f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @C40473a
    /* renamed from: g */
    public static void m165783g(boolean z, @C0359n0 Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
