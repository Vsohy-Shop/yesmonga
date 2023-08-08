package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.common.internal.C40843u;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.o */
public class C40599o {

    /* renamed from: a */
    public final Set f103515a = Collections.newSetFromMap(new WeakHashMap());

    @C40473a
    @C0359n0
    /* renamed from: a */
    public static <L> C40592n<L> m165304a(@C0359n0 L l, @C0359n0 Looper looper, @C0359n0 String str) {
        C40843u.m166203m(l, "Listener must not be null");
        C40843u.m166203m(looper, "Looper must not be null");
        C40843u.m166203m(str, "Listener type must not be null");
        return new C40592n<>(looper, l, str);
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public static <L> C40592n<L> m165305b(@C0359n0 L l, @C0359n0 Executor executor, @C0359n0 String str) {
        C40843u.m166203m(l, "Listener must not be null");
        C40843u.m166203m(executor, "Executor must not be null");
        C40843u.m166203m(str, "Listener type must not be null");
        return new C40592n<>(executor, l, str);
    }

    @C40473a
    @C0359n0
    /* renamed from: c */
    public static <L> C40592n.C40593a<L> m165306c(@C0359n0 L l, @C0359n0 String str) {
        C40843u.m166203m(l, "Listener must not be null");
        C40843u.m166203m(str, "Listener type must not be null");
        C40843u.m166199i(str, "Listener type must not be empty");
        return new C40592n.C40593a<>(l, str);
    }

    @C0359n0
    /* renamed from: d */
    public final C40592n mo134000d(@C0359n0 Object obj, @C0359n0 Looper looper, @C0359n0 String str) {
        C40592n a = m165304a(obj, looper, "NO_TYPE");
        this.f103515a.add(a);
        return a;
    }

    /* renamed from: e */
    public final void mo134001e() {
        for (C40592n a : this.f103515a) {
            a.mo133986a();
        }
        this.f103515a.clear();
    }
}
