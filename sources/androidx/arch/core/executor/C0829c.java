package androidx.arch.core.executor;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.arch.core.executor.c */
public class C0829c extends C0834f {

    /* renamed from: c */
    public static volatile C0829c f2649c;
    @C0359n0

    /* renamed from: d */
    public static final Executor f2650d = new C0827a();
    @C0359n0

    /* renamed from: e */
    public static final Executor f2651e = new C0828b();
    @C0359n0

    /* renamed from: a */
    public C0834f f2652a;
    @C0359n0

    /* renamed from: b */
    public final C0834f f2653b;

    public C0829c() {
        C0830d dVar = new C0830d();
        this.f2653b = dVar;
        this.f2652a = dVar;
    }

    @C0359n0
    /* renamed from: g */
    public static Executor m3970g() {
        return f2651e;
    }

    @C0359n0
    /* renamed from: h */
    public static C0829c m3971h() {
        if (f2649c != null) {
            return f2649c;
        }
        synchronized (C0829c.class) {
            if (f2649c == null) {
                f2649c = new C0829c();
            }
        }
        return f2649c;
    }

    @C0359n0
    /* renamed from: i */
    public static Executor m3972i() {
        return f2650d;
    }

    /* renamed from: a */
    public void mo3795a(@C0359n0 Runnable runnable) {
        this.f2652a.mo3795a(runnable);
    }

    /* renamed from: c */
    public boolean mo3796c() {
        return this.f2652a.mo3796c();
    }

    /* renamed from: d */
    public void mo3797d(@C0359n0 Runnable runnable) {
        this.f2652a.mo3797d(runnable);
    }

    /* renamed from: l */
    public void mo3798l(@C0363p0 C0834f fVar) {
        if (fVar == null) {
            fVar = this.f2653b;
        }
        this.f2652a = fVar;
    }
}
