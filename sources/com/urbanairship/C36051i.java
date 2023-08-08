package com.urbanairship;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.urbanairship.i */
public class C36051i implements C36050h, Runnable {

    /* renamed from: a */
    public boolean f89067a;

    /* renamed from: b */
    public boolean f89068b;

    /* renamed from: c */
    public boolean f89069c;

    /* renamed from: d */
    public final Handler f89070d;

    /* renamed from: e */
    public final Runnable f89071e;

    /* renamed from: f */
    public final List<C36050h> f89072f;

    /* renamed from: g */
    public final List<Runnable> f89073g;

    /* renamed from: com.urbanairship.i$a */
    public class C36052a implements Runnable {
        public C36052a() {
        }

        public void run() {
            synchronized (C36051i.this) {
                if (!C36051i.this.isDone()) {
                    C36051i.this.mo17473h();
                    boolean unused = C36051i.this.f89067a = true;
                    for (Runnable run : C36051i.this.f89073g) {
                        run.run();
                    }
                    C36051i.this.f89072f.clear();
                    C36051i.this.f89073g.clear();
                }
            }
        }
    }

    /* renamed from: com.urbanairship.i$b */
    public class C36053b implements Runnable {
        public C36053b() {
        }

        public void run() {
            C36051i.this.mo19674g();
        }
    }

    public C36051i() {
        this((Looper) null);
    }

    public final boolean cancel() {
        return cancel(false);
    }

    @C0359n0
    /* renamed from: d */
    public C36051i mo107800d(@C0359n0 C36050h hVar) {
        synchronized (this) {
            if (isCancelled()) {
                hVar.cancel();
            }
            if (!isDone()) {
                this.f89072f.add(hVar);
            }
        }
        return this;
    }

    @C0359n0
    /* renamed from: e */
    public C36051i mo107801e(@C0359n0 Runnable runnable) {
        synchronized (this) {
            if (this.f89067a) {
                runnable.run();
            } else {
                this.f89073g.add(runnable);
            }
        }
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public Handler mo107802f() {
        return this.f89070d;
    }

    /* renamed from: g */
    public void mo19674g() {
    }

    /* renamed from: h */
    public void mo17473h() {
    }

    public final boolean isCancelled() {
        boolean z;
        synchronized (this) {
            z = this.f89069c;
        }
        return z;
    }

    public final boolean isDone() {
        boolean z;
        synchronized (this) {
            if (!this.f89067a) {
                if (!this.f89069c) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x0018
            boolean r0 = r2.f89068b     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000c
            goto L_0x0018
        L_0x000c:
            r0 = 1
            r2.f89068b = r0     // Catch:{ all -> 0x001a }
            android.os.Handler r0 = r2.f89070d     // Catch:{ all -> 0x001a }
            java.lang.Runnable r1 = r2.f89071e     // Catch:{ all -> 0x001a }
            r0.post(r1)     // Catch:{ all -> 0x001a }
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            return
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.C36051i.run():void");
    }

    public C36051i(@C0363p0 Looper looper) {
        Handler handler;
        this.f89067a = false;
        this.f89068b = false;
        this.f89069c = false;
        this.f89072f = new ArrayList();
        this.f89073g = new ArrayList();
        if (looper != null) {
            this.f89070d = new Handler(looper);
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            this.f89070d = handler;
        }
        this.f89071e = new C36052a();
    }

    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f89069c = true;
            this.f89070d.removeCallbacks(this.f89071e);
            this.f89070d.post(new C36053b());
            for (C36050h cancel : this.f89072f) {
                cancel.cancel(z);
            }
            this.f89072f.clear();
            this.f89073g.clear();
            return true;
        }
    }
}
