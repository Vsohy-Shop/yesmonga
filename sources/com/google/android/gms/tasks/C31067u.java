package com.google.android.gms.tasks;

import androidx.annotation.C0359n0;
import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.u */
public final class C31067u<T> implements C31065t<T> {

    /* renamed from: a */
    public final Object f74333a = new Object();

    /* renamed from: b */
    public final int f74334b;

    /* renamed from: c */
    public final C31060q0 f74335c;
    @GuardedBy("mLock")

    /* renamed from: d */
    public int f74336d;
    @GuardedBy("mLock")

    /* renamed from: e */
    public int f74337e;
    @GuardedBy("mLock")

    /* renamed from: f */
    public int f74338f;
    @GuardedBy("mLock")

    /* renamed from: g */
    public Exception f74339g;
    @GuardedBy("mLock")

    /* renamed from: h */
    public boolean f74340h;

    public C31067u(int i, C31060q0 q0Var) {
        this.f74334b = i;
        this.f74335c = q0Var;
    }

    /* renamed from: a */
    public final void mo82228a(T t) {
        synchronized (this.f74333a) {
            this.f74336d++;
            mo87765b();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final void mo87765b() {
        if (this.f74336d + this.f74337e + this.f74338f != this.f74334b) {
            return;
        }
        if (this.f74339g != null) {
            C31060q0 q0Var = this.f74335c;
            int i = this.f74337e;
            int i2 = this.f74334b;
            q0Var.mo87759y(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.f74339g));
        } else if (this.f74340h) {
            this.f74335c.mo87752A();
        } else {
            this.f74335c.mo87760z((Object) null);
        }
    }

    public final void onCanceled() {
        synchronized (this.f74333a) {
            this.f74338f++;
            this.f74340h = true;
            mo87765b();
        }
    }

    public final void onFailure(@C0359n0 Exception exc) {
        synchronized (this.f74333a) {
            this.f74337e++;
            this.f74339g = exc;
            mo87765b();
        }
    }
}
