package com.contentsquare.android.sdk;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: com.contentsquare.android.sdk.ma */
public class C14527ma {

    /* renamed from: a */
    public final String f35937a;

    /* renamed from: b */
    public final String f35938b;

    /* renamed from: c */
    public final long f35939c;

    /* renamed from: com.contentsquare.android.sdk.ma$a */
    public static class C14528a {
    }

    public C14527ma(Application application) {
        this(application, new C14528a());
    }

    /* renamed from: b */
    public static String m62617b(Application application) {
        return String.valueOf(application.getApplicationInfo().loadLabel(application.getPackageManager()));
    }

    /* renamed from: c */
    public static String m62618c(Application application, C14453jf jfVar) {
        PackageInfo g = m62620g(application, jfVar);
        return (g == null || C14358g3.m61811e(g.versionName)) ? "unknown" : g.versionName;
    }

    /* renamed from: d */
    public static long m62619d(Application application, C14453jf jfVar) {
        PackageInfo g = m62620g(application, jfVar);
        if (g != null) {
            return Build.VERSION.SDK_INT >= 28 ? g.getLongVersionCode() : (long) g.versionCode;
        }
        return 0;
    }

    /* renamed from: g */
    public static PackageInfo m62620g(Application application, C14453jf jfVar) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            jfVar.mo35678g(e, "Failed to getPackageInfo from the application", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public String mo35913a() {
        return this.f35938b;
    }

    /* renamed from: e */
    public String mo35914e() {
        return this.f35937a;
    }

    /* renamed from: f */
    public long mo35915f() {
        return this.f35939c;
    }

    /* renamed from: h */
    public int mo35916h() {
        return 1041400;
    }

    /* renamed from: i */
    public String mo35917i() {
        return "4.14.0";
    }

    public C14527ma(Application application, C14528a aVar) {
        String b = m62617b(application);
        this.f35938b = b;
        C14453jf jfVar = new C14453jf("BuildInformation");
        jfVar.mo35674c("ApplicationName: %s", b);
        String c = m62618c(application, jfVar);
        this.f35937a = c;
        jfVar.mo35674c("ApplicationVersion: %s", c);
        long d = m62619d(application, jfVar);
        this.f35939c = d;
        jfVar.mo35674c("ApplicationBuildNumber: %s", Long.valueOf(d));
    }
}
