package com.google.firebase.crashlytics.internal.stacktrace;

/* renamed from: com.google.firebase.crashlytics.internal.stacktrace.b */
public class C32945b implements C32947d {

    /* renamed from: a */
    public final int f80064a;

    public C32945b(int i) {
        this.f80064a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo95616a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f80064a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
