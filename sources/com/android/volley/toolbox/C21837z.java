package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.C21771p;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.android.volley.toolbox.z */
public class C21837z<T> implements Future<T>, C21771p.C21773b<T>, C21771p.C21772a {

    /* renamed from: a */
    public Request<?> f56485a;

    /* renamed from: b */
    public boolean f56486b = false;

    /* renamed from: c */
    public T f56487c;

    /* renamed from: d */
    public VolleyError f56488d;

    /* renamed from: e */
    public static <E> C21837z<E> m100309e() {
        return new C21837z<>();
    }

    /* renamed from: b */
    public synchronized void mo20311b(T t) {
        this.f56486b = true;
        this.f56487c = t;
        notifyAll();
    }

    /* renamed from: c */
    public synchronized void mo20312c(VolleyError volleyError) {
        this.f56488d = volleyError;
        notifyAll();
    }

    public synchronized boolean cancel(boolean z) {
        if (this.f56485a == null) {
            return false;
        }
        if (isDone()) {
            return false;
        }
        this.f56485a.mo64811q();
        return true;
    }

    /* renamed from: d */
    public final synchronized T mo65066d(Long l) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.f56488d != null) {
            throw new ExecutionException(this.f56488d);
        } else if (this.f56486b) {
            return this.f56487c;
        } else {
            if (l == null) {
                while (!isDone()) {
                    wait(0);
                }
            } else if (l.longValue() > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long longValue = l.longValue() + uptimeMillis;
                while (!isDone() && uptimeMillis < longValue) {
                    wait(longValue - uptimeMillis);
                    uptimeMillis = SystemClock.uptimeMillis();
                }
            }
            if (this.f56488d != null) {
                throw new ExecutionException(this.f56488d);
            } else if (this.f56486b) {
                return this.f56487c;
            } else {
                throw new TimeoutException();
            }
        }
    }

    /* renamed from: f */
    public void mo65067f(Request<?> request) {
        this.f56485a = request;
    }

    public T get() throws InterruptedException, ExecutionException {
        try {
            return mo65066d((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public boolean isCancelled() {
        Request<?> request = this.f56485a;
        if (request == null) {
            return false;
        }
        return request.mo64791O0();
    }

    public synchronized boolean isDone() {
        boolean z;
        if (this.f56486b || this.f56488d != null || isCancelled()) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo65066d(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }
}
