package com.urbanairship;

import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.urbanairship.p */
public class C36062p<T> implements C36050h, Future<T> {

    /* renamed from: a */
    public boolean f89109a;

    /* renamed from: b */
    public boolean f89110b;

    /* renamed from: c */
    public boolean f89111c = true;
    @C0363p0

    /* renamed from: d */
    public T f89112d;

    /* renamed from: e */
    public final List<C36050h> f89113e = new ArrayList();

    /* renamed from: f */
    public final List<C36051i> f89114f = new ArrayList();

    /* renamed from: com.urbanairship.p$a */
    public class C36063a extends C36051i {

        /* renamed from: v */
        public final /* synthetic */ C36098y f89115v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36063a(Looper looper, C36098y yVar) {
            super(looper);
            this.f89115v = yVar;
        }

        /* renamed from: h */
        public void mo17473h() {
            synchronized (C36062p.this) {
                if (C36062p.this.f89111c) {
                    this.f89115v.onResult(C36062p.this.f89112d);
                }
            }
        }
    }

    @C0359n0
    /* renamed from: c */
    public C36062p<T> mo107824c(@C0359n0 C36050h hVar) {
        synchronized (this) {
            if (isCancelled()) {
                hVar.cancel();
            }
            if (!isDone()) {
                this.f89113e.add(hVar);
            }
        }
        return this;
    }

    public final boolean cancel() {
        return cancel(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return r1;
     */
    @androidx.annotation.C0359n0
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.urbanairship.C36062p<T> mo107825d(@androidx.annotation.C0363p0 android.os.Looper r2, @androidx.annotation.C0359n0 com.urbanairship.C36098y<T> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isCancelled()     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            boolean r0 = r1.f89111c     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.urbanairship.p$a r0 = new com.urbanairship.p$a     // Catch:{ all -> 0x0023 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0023 }
            boolean r2 = r1.isDone()     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x001a
            r0.run()     // Catch:{ all -> 0x0023 }
        L_0x001a:
            java.util.List<com.urbanairship.i> r2 = r1.f89114f     // Catch:{ all -> 0x0023 }
            r2.add(r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            return r1
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            return r1
        L_0x0023:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.C36062p.mo107825d(android.os.Looper, com.urbanairship.y):com.urbanairship.p");
    }

    @C0359n0
    /* renamed from: e */
    public C36062p<T> mo107826e(@C0359n0 C36098y<T> yVar) {
        return mo107825d(Looper.myLooper(), yVar);
    }

    @C0363p0
    /* renamed from: f */
    public T mo107827f() {
        T t;
        synchronized (this) {
            t = this.f89112d;
        }
        return t;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public void mo107828g(@C0363p0 T t) {
        synchronized (this) {
            if (!isDone()) {
                this.f89112d = t;
                this.f89110b = true;
                this.f89113e.clear();
                notifyAll();
                for (C36051i run : this.f89114f) {
                    run.run();
                }
                this.f89114f.clear();
            }
        }
    }

    @C0363p0
    public T get() throws InterruptedException, ExecutionException {
        synchronized (this) {
            if (isDone()) {
                T t = this.f89112d;
                return t;
            }
            wait();
            T t2 = this.f89112d;
            return t2;
        }
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this) {
            z = this.f89109a;
        }
        return z;
    }

    public boolean isDone() {
        boolean z;
        synchronized (this) {
            if (!this.f89109a) {
                if (!this.f89110b) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean cancel(boolean z) {
        synchronized (this) {
            if (isCancelled()) {
                return true;
            }
            this.f89111c = false;
            for (C36051i cancel : this.f89114f) {
                cancel.cancel(z);
            }
            this.f89114f.clear();
            if (isDone()) {
                return false;
            }
            this.f89109a = true;
            notifyAll();
            for (C36050h cancel2 : this.f89113e) {
                cancel2.cancel(z);
            }
            this.f89113e.clear();
            return true;
        }
    }

    @C0363p0
    public T get(long j, @C0359n0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        synchronized (this) {
            if (isDone()) {
                T t = this.f89112d;
                return t;
            }
            wait(timeUnit.toMillis(j));
            T t2 = this.f89112d;
            return t2;
        }
    }
}
