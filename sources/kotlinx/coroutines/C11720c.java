package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.C11079d2;
import kotlin.internal.C11110f;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.c */
public final class C11720c {
    @C12580l

    /* renamed from: a */
    public static C11715b f29063a;

    @C11110f
    /* renamed from: a */
    public static final long m46158a() {
        C11715b b = m46159b();
        return b != null ? b.mo23724a() : System.currentTimeMillis();
    }

    @C12580l
    /* renamed from: b */
    public static final C11715b m46159b() {
        return f29063a;
    }

    @C11110f
    /* renamed from: c */
    public static final long m46160c() {
        C11715b b = m46159b();
        return b != null ? b.mo23725b() : System.nanoTime();
    }

    @C11110f
    /* renamed from: d */
    public static final void m46161d(Object obj, long j) {
        C11079d2 d2Var;
        C11715b b = m46159b();
        if (b != null) {
            b.mo23726c(obj, j);
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            LockSupport.parkNanos(obj, j);
        }
    }

    @C11110f
    /* renamed from: e */
    public static final void m46162e() {
        C11715b b = m46159b();
        if (b != null) {
            b.mo23727d();
        }
    }

    /* renamed from: f */
    public static final void m46163f(@C12580l C11715b bVar) {
        f29063a = bVar;
    }

    @C11110f
    /* renamed from: g */
    public static final void m46164g() {
        C11715b b = m46159b();
        if (b != null) {
            b.mo23728e();
        }
    }

    @C11110f
    /* renamed from: h */
    public static final void m46165h() {
        C11715b b = m46159b();
        if (b != null) {
            b.mo23729f();
        }
    }

    @C11110f
    /* renamed from: i */
    public static final void m46166i(Thread thread) {
        C11079d2 d2Var;
        C11715b b = m46159b();
        if (b != null) {
            b.mo23730g(thread);
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            LockSupport.unpark(thread);
        }
    }

    @C11110f
    /* renamed from: j */
    public static final void m46167j() {
        C11715b b = m46159b();
        if (b != null) {
            b.mo23731h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.mo23732i(r1);
     */
    @kotlin.internal.C11110f
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Runnable m46168k(java.lang.Runnable r1) {
        /*
            kotlinx.coroutines.b r0 = m46159b()
            if (r0 == 0) goto L_0x000e
            java.lang.Runnable r0 = r0.mo23732i(r1)
            if (r0 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r1 = r0
        L_0x000e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C11720c.m46168k(java.lang.Runnable):java.lang.Runnable");
    }
}
