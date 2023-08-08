package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.firebase.crashlytics.internal.C32738e;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.common.a */
public class C32667a {

    /* renamed from: a */
    public final String f79279a;

    /* renamed from: b */
    public final String f79280b;

    /* renamed from: c */
    public final List<C32675e> f79281c;

    /* renamed from: d */
    public final String f79282d;

    /* renamed from: e */
    public final String f79283e;

    /* renamed from: f */
    public final String f79284f;

    /* renamed from: g */
    public final String f79285g;

    /* renamed from: h */
    public final C32738e f79286h;

    public C32667a(String str, String str2, List<C32675e> list, String str3, String str4, String str5, String str6, C32738e eVar) {
        this.f79279a = str;
        this.f79280b = str2;
        this.f79281c = list;
        this.f79282d = str3;
        this.f79283e = str4;
        this.f79284f = str5;
        this.f79285g = str6;
        this.f79286h = eVar;
    }

    /* renamed from: a */
    public static C32667a m131948a(Context context, C32730v vVar, String str, String str2, List<C32675e> list, C32738e eVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g = vVar.mo95033g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C32667a(str, str2, list, g, packageName, num, str3, eVar);
    }
}
