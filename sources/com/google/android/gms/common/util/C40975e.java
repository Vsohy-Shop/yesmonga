package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.wrappers.C41008d;

@C40473a
/* renamed from: com.google.android.gms.common.util.e */
public class C40975e {
    @C40473a
    /* renamed from: a */
    public static int m166602a(@C0359n0 Context context, @C0359n0 String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo b = m166603b(context, str);
        if (b == null || (applicationInfo = b.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @C0363p0
    @C40473a
    /* renamed from: b */
    public static PackageInfo m166603b(@C0359n0 Context context, @C0359n0 String str) {
        try {
            return C41008d.m166715a(context).mo134784f(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @C40473a
    /* renamed from: c */
    public static boolean m166604c() {
        return false;
    }
}
