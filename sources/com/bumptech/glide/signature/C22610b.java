package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22108c;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.bumptech.glide.signature.b */
public final class C22610b {

    /* renamed from: a */
    public static final String f57985a = "AppVersionSignature";

    /* renamed from: b */
    public static final ConcurrentMap<String, C22108c> f57986b = new ConcurrentHashMap();

    @C0363p0
    /* renamed from: a */
    public static PackageInfo m102565a(@C0359n0 Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot resolve info for");
            sb.append(context.getPackageName());
            return null;
        }
    }

    @C0359n0
    /* renamed from: b */
    public static String m102566b(@C0363p0 PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    @C0359n0
    /* renamed from: c */
    public static C22108c m102567c(@C0359n0 Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, C22108c> concurrentMap = f57986b;
        C22108c cVar = concurrentMap.get(packageName);
        if (cVar != null) {
            return cVar;
        }
        C22108c d = m102568d(context);
        C22108c putIfAbsent = concurrentMap.putIfAbsent(packageName, d);
        if (putIfAbsent == null) {
            return d;
        }
        return putIfAbsent;
    }

    @C0359n0
    /* renamed from: d */
    public static C22108c m102568d(@C0359n0 Context context) {
        return new C22613e(m102566b(m102565a(context)));
    }

    @C0344h1
    /* renamed from: e */
    public static void m102569e() {
        f57986b.clear();
    }
}
