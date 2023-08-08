package com.google.android.gms.common.util;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;

@C40473a
/* renamed from: com.google.android.gms.common.util.i */
public final class C40983i {

    /* renamed from: a */
    public static final String[] f104228a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @C40473a
    /* renamed from: a */
    public static boolean m166633a(@C0359n0 Context context, @C0359n0 Throwable th) {
        try {
            C40843u.m166202l(context);
            C40843u.m166202l(th);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
