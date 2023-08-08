package com.google.firebase.crashlytics.internal.stacktrace;

import java.util.HashMap;

/* renamed from: com.google.firebase.crashlytics.internal.stacktrace.c */
public class C32946c implements C32947d {

    /* renamed from: a */
    public final int f80065a;

    public C32946c() {
        this(1);
    }

    /* renamed from: b */
    public static boolean m133139b(StackTraceElement[] stackTraceElementArr, int i, int i2) {
        int i3 = i2 - i;
        if (i2 + i3 > stackTraceElementArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!stackTraceElementArr[i + i4].equals(stackTraceElementArr[i2 + i4])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static StackTraceElement[] m133140c(StackTraceElement[] stackTraceElementArr, int i) {
        int i2;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num == null || !m133139b(stackTraceElementArr, num.intValue(), i3)) {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i5 = 1;
                i2 = i3;
            } else {
                int intValue = i3 - num.intValue();
                if (i5 < i) {
                    System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, intValue);
                    i4 += intValue;
                    i5++;
                }
                i2 = (intValue - 1) + i3;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i3));
            i3 = i2 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i4);
        return stackTraceElementArr3;
    }

    /* renamed from: a */
    public StackTraceElement[] mo95616a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] c = m133140c(stackTraceElementArr, this.f80065a);
        if (c.length < stackTraceElementArr.length) {
            return c;
        }
        return stackTraceElementArr;
    }

    public C32946c(int i) {
        this.f80065a = i;
    }
}
