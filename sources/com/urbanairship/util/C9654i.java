package com.urbanairship.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.i */
public class C9654i {
    /* renamed from: a */
    public static void m36165a(boolean z, @C0359n0 String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m36166b(@C0363p0 Object obj, @C0359n0 String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
