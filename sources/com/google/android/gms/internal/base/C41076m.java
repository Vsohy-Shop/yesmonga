package com.google.android.gms.internal.base;

import android.os.Build;
import androidx.annotation.C0352k;

/* renamed from: com.google.android.gms.internal.base.m */
public final class C41076m {
    @C0352k(api = 33, codename = "Tiramisu")
    /* renamed from: a */
    public static boolean m166944a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
