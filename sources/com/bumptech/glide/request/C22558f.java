package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.C22583o;
import com.bumptech.glide.request.target.C22584p;
import com.bumptech.glide.request.transition.C22598f;
import com.bumptech.glide.util.C22635o;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.request.f */
public class C22558f<R> implements C22556d<R>, C22560g<R> {

    /* renamed from: y */
    public static final C22559a f57874y = new C22559a();

    /* renamed from: a */
    public final int f57875a;

    /* renamed from: b */
    public final int f57876b;

    /* renamed from: c */
    public final boolean f57877c;

    /* renamed from: d */
    public final C22559a f57878d;
    @C0363p0
    @C0323b0("this")

    /* renamed from: e */
    public R f57879e;
    @C0363p0
    @C0323b0("this")

    /* renamed from: f */
    public C22557e f57880f;
    @C0323b0("this")

    /* renamed from: g */
    public boolean f57881g;
    @C0323b0("this")

    /* renamed from: v */
    public boolean f57882v;
    @C0323b0("this")

    /* renamed from: w */
    public boolean f57883w;
    @C0363p0
    @C0323b0("this")

    /* renamed from: x */
    public GlideException f57884x;

    @C0344h1
    /* renamed from: com.bumptech.glide.request.f$a */
    public static class C22559a {
        /* renamed from: a */
        public void mo66834a(Object obj) {
            obj.notifyAll();
        }

        /* renamed from: b */
        public void mo66835b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public C22558f(int i, int i2) {
        this(i, i2, true, f57874y);
    }

    /* renamed from: a */
    public void mo65585a() {
    }

    /* renamed from: b */
    public void mo65586b() {
    }

    /* renamed from: c */
    public void mo65587c() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            r3 = 0
            return r3
        L_0x000a:
            r0 = 1
            r2.f57881g = r0     // Catch:{ all -> 0x0021 }
            com.bumptech.glide.request.f$a r1 = r2.f57878d     // Catch:{ all -> 0x0021 }
            r1.mo66834a(r2)     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r3 == 0) goto L_0x001a
            com.bumptech.glide.request.e r3 = r2.f57880f     // Catch:{ all -> 0x0021 }
            r2.f57880f = r1     // Catch:{ all -> 0x0021 }
            r1 = r3
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0020
            r1.clear()
        L_0x0020:
            return r0
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22558f.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public void mo65588d(@C0359n0 C22583o oVar) {
    }

    /* renamed from: e */
    public synchronized boolean mo66826e(@C0363p0 GlideException glideException, Object obj, C22584p<R> pVar, boolean z) {
        this.f57883w = true;
        this.f57884x = glideException;
        this.f57878d.mo66834a(this);
        return false;
    }

    /* renamed from: f */
    public synchronized boolean mo66827f(R r, Object obj, C22584p<R> pVar, DataSource dataSource, boolean z) {
        this.f57882v = true;
        this.f57879e = r;
        this.f57878d.mo66834a(this);
        return false;
    }

    /* renamed from: g */
    public void mo65589g(@C0363p0 Drawable drawable) {
    }

    public R get() throws InterruptedException, ExecutionException {
        try {
            return mo66830h((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @C0363p0
    public synchronized C22557e getRequest() {
        return this.f57880f;
    }

    /* renamed from: h */
    public final synchronized R mo66830h(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f57877c && !isDone()) {
            C22635o.m102626a();
        }
        if (this.f57881g) {
            throw new CancellationException();
        } else if (this.f57883w) {
            throw new ExecutionException(this.f57884x);
        } else if (this.f57882v) {
            return this.f57879e;
        } else {
            if (l == null) {
                this.f57878d.mo66835b(this, 0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f57878d.mo66835b(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f57883w) {
                throw new ExecutionException(this.f57884x);
            } else if (this.f57881g) {
                throw new CancellationException();
            } else if (this.f57882v) {
                return this.f57879e;
            } else {
                throw new TimeoutException();
            }
        }
    }

    public synchronized boolean isCancelled() {
        return this.f57881g;
    }

    public synchronized boolean isDone() {
        boolean z;
        if (this.f57881g || this.f57882v || this.f57883w) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: k */
    public void mo65591k(@C0363p0 Drawable drawable) {
    }

    /* renamed from: l */
    public synchronized void mo65592l(@C0359n0 R r, @C0363p0 C22598f<? super R> fVar) {
    }

    /* renamed from: n */
    public synchronized void mo65593n(@C0363p0 C22557e eVar) {
        this.f57880f = eVar;
    }

    /* renamed from: o */
    public synchronized void mo65594o(@C0363p0 Drawable drawable) {
    }

    /* renamed from: p */
    public void mo65595p(@C0359n0 C22583o oVar) {
        oVar.mo66710e(this.f57875a, this.f57876b);
    }

    public String toString() {
        C22557e eVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            eVar = null;
            if (this.f57881g) {
                str = "CANCELLED";
            } else if (this.f57883w) {
                str = "FAILURE";
            } else if (this.f57882v) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                eVar = this.f57880f;
            }
        }
        if (eVar != null) {
            return str2 + str + ", request=[" + eVar + "]]";
        }
        return str2 + str + "]";
    }

    public C22558f(int i, int i2, boolean z, C22559a aVar) {
        this.f57875a = i;
        this.f57876b = i2;
        this.f57877c = z;
        this.f57878d = aVar;
    }

    public R get(long j, @C0359n0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo66830h(Long.valueOf(timeUnit.toMillis(j)));
    }
}
