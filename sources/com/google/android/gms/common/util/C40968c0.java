package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.C40866k;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.wrappers.C41008d;

@C40473a
/* renamed from: com.google.android.gms.common.util.c0 */
public final class C40968c0 {
    @C40473a
    /* renamed from: a */
    public static boolean m166599a(@C0359n0 Context context, int i) {
        if (!m166600b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C40866k.m166252a(context).mo134533b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @C40473a
    @TargetApi(19)
    /* renamed from: b */
    public static boolean m166600b(@C0359n0 Context context, int i, @C0359n0 String str) {
        return C41008d.m166715a(context).mo134786h(i, str);
    }
}
