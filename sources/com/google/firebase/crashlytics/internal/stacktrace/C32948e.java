package com.google.firebase.crashlytics.internal.stacktrace;

/* renamed from: com.google.firebase.crashlytics.internal.stacktrace.e */
public class C32948e {

    /* renamed from: a */
    public final String f80066a;

    /* renamed from: b */
    public final String f80067b;

    /* renamed from: c */
    public final StackTraceElement[] f80068c;

    /* renamed from: d */
    public final C32948e f80069d;

    public C32948e(Throwable th, C32947d dVar) {
        C32948e eVar;
        this.f80066a = th.getLocalizedMessage();
        this.f80067b = th.getClass().getName();
        this.f80068c = dVar.mo95616a(th.getStackTrace());
        Throwable cause = th.getCause();
        if (cause != null) {
            eVar = new C32948e(cause, dVar);
        } else {
            eVar = null;
        }
        this.f80069d = eVar;
    }
}
