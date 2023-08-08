package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.C0323b0;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.internal.mlkit_common.C42303a;
import com.google.android.gms.internal.mlkit_common.C42479q;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.h */
public class C33943h {

    /* renamed from: b */
    public static final Object f82362b = new Object();
    @C0363p0
    @C0323b0("lock")

    /* renamed from: c */
    public static C33943h f82363c;

    /* renamed from: a */
    public Handler f82364a;

    public C33943h(Looper looper) {
        this.f82364a = new C42303a(looper);
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    public static C33943h m136576b() {
        C33943h hVar;
        synchronized (f82362b) {
            if (f82363c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f82363c = new C33943h(handlerThread.getLooper());
            }
            hVar = f82363c;
        }
        return hVar;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: g */
    public static Executor m136577g() {
        return zzh.INSTANCE;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public Handler mo98711a() {
        return this.f82364a;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: c */
    public <ResultT> C31047k<ResultT> mo98712c(@RecentlyNonNull Callable<ResultT> callable) {
        C31049l lVar = new C31049l();
        mo98713d(new C33978w(callable, lVar));
        return lVar.mo87741a();
    }

    @C40473a
    /* renamed from: d */
    public void mo98713d(@RecentlyNonNull Runnable runnable) {
        m136577g().execute(runnable);
    }

    @C40473a
    /* renamed from: e */
    public void mo98714e(@RecentlyNonNull Runnable runnable, long j) {
        this.f82364a.postDelayed(runnable, j);
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: f */
    public <ResultT> C31047k<ResultT> mo98715f(@RecentlyNonNull Callable<C31047k<ResultT>> callable) {
        return mo98712c(callable).mo87732p(C42479q.m171596a(), C33977v.f82483a);
    }
}
