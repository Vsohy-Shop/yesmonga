package com.contentsquare.android.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Arrays;

/* renamed from: com.contentsquare.android.sdk.xe */
public abstract class C14869xe implements C14501lb {

    /* renamed from: v */
    public static final Object[] f36881v = new Object[0];

    /* renamed from: a */
    public final C14653qc f36882a;

    /* renamed from: b */
    public final Object f36883b;

    /* renamed from: c */
    public final int f36884c;

    /* renamed from: d */
    public Object[] f36885d;

    /* renamed from: e */
    public int f36886e;

    /* renamed from: f */
    public long f36887f;

    /* renamed from: g */
    public boolean f36888g;

    public C14869xe() {
        this(0);
    }

    /* renamed from: c */
    public final void mo34978c(C14325f5 f5Var) {
        C14169a3.m60810c(Looper.myLooper() != null, "Can only be removed on a Looper thread");
        C14169a3.m60808a(f5Var);
        synchronized (this.f36883b) {
            mo36859f(f5Var);
            if (this.f36886e == 0) {
                this.f36882a.obtainMessage(1, this).sendToTarget();
                this.f36882a.removeMessages(2, this);
                this.f36888g = false;
            }
        }
    }

    /* renamed from: d */
    public final void mo34979d(C14325f5 f5Var) {
        boolean z = false;
        C14169a3.m60810c(Looper.myLooper() != null, "Can only be added on a Looper thread");
        C14169a3.m60808a(f5Var);
        synchronized (this.f36883b) {
            mo36858e(f5Var, C14653qc.m63204a());
            if (this.f36886e == 1) {
                if (this.f36882a.hasMessages(1, this)) {
                    this.f36882a.removeMessages(1, this);
                } else if (Looper.myLooper() == this.f36882a.getLooper()) {
                    z = true;
                } else {
                    this.f36882a.obtainMessage(0, this).sendToTarget();
                }
            }
        }
        if (z) {
            mo35377h();
        }
    }

    /* renamed from: e */
    public final void mo36858e(C14325f5 f5Var, Handler handler) {
        int i = 0;
        int i2 = -1;
        while (true) {
            Object[] objArr = this.f36885d;
            if (i < objArr.length) {
                Object obj = objArr[i];
                if (obj != f5Var) {
                    if (obj == null) {
                        i2 = i;
                    }
                    i += 2;
                } else {
                    throw new IllegalStateException("Updatable already added, cannot add.");
                }
            } else {
                if (i2 == -1) {
                    i2 = objArr.length;
                    int i3 = 2;
                    if (i2 >= 2) {
                        i3 = i2 * 2;
                    }
                    this.f36885d = Arrays.copyOf(objArr, i3);
                }
                Object[] objArr2 = this.f36885d;
                objArr2[i2] = f5Var;
                objArr2[i2 + 1] = handler;
                this.f36886e++;
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo36859f(C14325f5 f5Var) {
        int i = 0;
        while (true) {
            Object[] objArr = this.f36885d;
            if (i >= objArr.length) {
                throw new IllegalStateException("Updatable not added, cannot remove.");
            } else if (objArr[i] == f5Var) {
                int i2 = i + 1;
                ((C14653qc) objArr[i2]).mo36260b(f5Var, this.f36883b);
                Object[] objArr2 = this.f36885d;
                objArr2[i] = null;
                objArr2[i2] = null;
                this.f36886e--;
                return;
            } else {
                i += 2;
            }
        }
    }

    /* renamed from: g */
    public final void mo36860g() {
        synchronized (this.f36883b) {
            if (!this.f36888g) {
                this.f36888g = true;
                this.f36882a.obtainMessage(2, this).sendToTarget();
            }
        }
    }

    /* renamed from: h */
    public void mo35377h() {
    }

    /* renamed from: i */
    public void mo35378i() {
    }

    /* renamed from: j */
    public void mo36861j() {
        synchronized (this.f36883b) {
            if (this.f36888g) {
                if (this.f36884c > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f36887f;
                    if (j < ((long) this.f36884c)) {
                        C14653qc qcVar = this.f36882a;
                        qcVar.sendMessageDelayed(qcVar.obtainMessage(2, this), ((long) this.f36884c) - j);
                        return;
                    }
                    this.f36887f = elapsedRealtime;
                }
                int i = 0;
                this.f36888g = false;
                while (true) {
                    Object[] objArr = this.f36885d;
                    if (i < objArr.length) {
                        C14325f5 f5Var = (C14325f5) objArr[i];
                        C14653qc qcVar2 = (C14653qc) objArr[i + 1];
                        if (f5Var != null) {
                            qcVar2.mo36261c(f5Var, this.f36883b);
                        }
                        i += 2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public C14869xe(int i) {
        this.f36883b = new Object();
        this.f36888g = false;
        C14169a3.m60810c(Looper.myLooper() != null, "Can only be created on a Looper thread");
        this.f36884c = i;
        this.f36882a = C14653qc.m63204a();
        this.f36885d = f36881v;
        this.f36886e = 0;
    }
}
