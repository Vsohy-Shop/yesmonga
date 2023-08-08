package com.google.android.gms.measurement.internal;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.internal.C40843u;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
public final class C30653a5 extends FutureTask implements Comparable {

    /* renamed from: a */
    public final long f73218a;

    /* renamed from: b */
    public final boolean f73219b;

    /* renamed from: c */
    public final String f73220c;

    /* renamed from: d */
    public final /* synthetic */ C30692d5 f73221d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30653a5(C30692d5 d5Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f73221d = d5Var;
        C40843u.m166202l(str);
        long andIncrement = C30692d5.f73287l.getAndIncrement();
        this.f73218a = andIncrement;
        this.f73220c = str;
        this.f73219b = z;
        if (andIncrement == Long.MAX_VALUE) {
            d5Var.f74136a.mo86903d().mo87489r().mo87463a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(@C0359n0 Object obj) {
        C30653a5 a5Var = (C30653a5) obj;
        boolean z = this.f73219b;
        if (z == a5Var.f73219b) {
            int i = (this.f73218a > a5Var.f73218a ? 1 : (this.f73218a == a5Var.f73218a ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            if (i > 0) {
                return 1;
            }
            this.f73221d.f74136a.mo86903d().mo87491t().mo87464b("Two tasks share the same index. index", Long.valueOf(this.f73218a));
            return 0;
        } else if (!z) {
            return 1;
        } else {
            return -1;
        }
    }

    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.f73221d.f74136a.mo86903d().mo87489r().mo87464b(this.f73220c, th);
        if ((th instanceof zzfw) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30653a5(C30692d5 d5Var, Callable callable, boolean z, String str) {
        super(callable);
        this.f73221d = d5Var;
        C40843u.m166202l("Task exception on worker thread");
        long andIncrement = C30692d5.f73287l.getAndIncrement();
        this.f73218a = andIncrement;
        this.f73220c = "Task exception on worker thread";
        this.f73219b = z;
        if (andIncrement == Long.MAX_VALUE) {
            d5Var.f74136a.mo86903d().mo87489r().mo87463a("Tasks index overflow");
        }
    }
}
