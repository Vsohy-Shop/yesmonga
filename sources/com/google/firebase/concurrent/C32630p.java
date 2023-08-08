package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SuppressLint({"RestrictedApi"})
/* renamed from: com.google.firebase.concurrent.p */
public class C32630p<V> extends AbstractResolvableFuture<V> implements ScheduledFuture<V> {

    /* renamed from: w */
    public final ScheduledFuture<?> f79190w;

    /* renamed from: com.google.firebase.concurrent.p$a */
    public class C32631a implements C32632b<V> {
        public C32631a() {
        }

        /* renamed from: a */
        public void mo94804a(Throwable th) {
            boolean unused = C32630p.this.mo48107m0(th);
        }

        public void set(V v) {
            boolean unused = C32630p.this.mo48106j0(v);
        }
    }

    /* renamed from: com.google.firebase.concurrent.p$b */
    public interface C32632b<T> {
        /* renamed from: a */
        void mo94804a(Throwable th);

        void set(T t);
    }

    /* renamed from: com.google.firebase.concurrent.p$c */
    public interface C32633c<T> {
        /* renamed from: a */
        ScheduledFuture<?> mo94775a(C32632b<T> bVar);
    }

    public C32630p(C32633c<V> cVar) {
        this.f79190w = cVar.mo94775a(new C32631a());
    }

    /* renamed from: A0 */
    public int compareTo(Delayed delayed) {
        return this.f79190w.compareTo(delayed);
    }

    /* renamed from: g */
    public void mo48099g() {
        this.f79190w.cancel(mo48110p0());
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f79190w.getDelay(timeUnit);
    }
}
