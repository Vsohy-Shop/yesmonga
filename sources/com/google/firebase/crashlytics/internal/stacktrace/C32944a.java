package com.google.firebase.crashlytics.internal.stacktrace;

/* renamed from: com.google.firebase.crashlytics.internal.stacktrace.a */
public class C32944a implements C32947d {

    /* renamed from: a */
    public final int f80061a;

    /* renamed from: b */
    public final C32947d[] f80062b;

    /* renamed from: c */
    public final C32945b f80063c;

    public C32944a(int i, C32947d... dVarArr) {
        this.f80061a = i;
        this.f80062b = dVarArr;
        this.f80063c = new C32945b(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo95616a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f80061a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C32947d dVar : this.f80062b) {
            if (stackTraceElementArr2.length <= this.f80061a) {
                break;
            }
            stackTraceElementArr2 = dVar.mo95616a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f80061a) {
            return this.f80063c.mo95616a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
