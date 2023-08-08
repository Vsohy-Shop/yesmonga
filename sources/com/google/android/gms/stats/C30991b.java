package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.legacy.content.C19327a;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40858y;

@C40473a
@C40858y
/* renamed from: com.google.android.gms.stats.b */
public abstract class C30991b extends C19327a {
    @C40473a
    /* renamed from: d */
    public static boolean m124408d(@C0359n0 Context context, @C0363p0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return C19327a.m90469b(intent);
    }
}
