package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C40843u;
import java.lang.Thread;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
public final class C30960z4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f74134a;

    /* renamed from: b */
    public final /* synthetic */ C30692d5 f74135b;

    public C30960z4(C30692d5 d5Var, String str) {
        this.f74135b = d5Var;
        C40843u.m166202l(str);
        this.f74134a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f74135b.f74136a.mo86903d().mo87489r().mo87464b(this.f74134a, th);
    }
}
