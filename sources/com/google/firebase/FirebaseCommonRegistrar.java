package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.C33046g;
import com.google.firebase.platforminfo.C33502c;
import com.google.firebase.platforminfo.C33504e;
import com.google.firebase.platforminfo.C33507h;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final String f78828a = "fire-android";

    /* renamed from: b */
    public static final String f78829b = "fire-core";

    /* renamed from: c */
    public static final String f78830c = "device-name";

    /* renamed from: d */
    public static final String f78831d = "device-model";

    /* renamed from: e */
    public static final String f78832e = "device-brand";

    /* renamed from: f */
    public static final String f78833f = "android-target-sdk";

    /* renamed from: g */
    public static final String f78834g = "android-min-sdk";

    /* renamed from: h */
    public static final String f78835h = "android-platform";

    /* renamed from: i */
    public static final String f78836i = "android-installer";

    /* renamed from: j */
    public static final String f78837j = "kotlin";

    /* renamed from: e */
    public static /* synthetic */ String m131471e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* renamed from: f */
    public static /* synthetic */ String m131472f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    /* renamed from: g */
    public static /* synthetic */ String m131473g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "";
        }
        return "embedded";
    }

    /* renamed from: h */
    public static /* synthetic */ String m131474h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return m131475i(installerPackageName);
        }
        return "";
    }

    /* renamed from: i */
    public static String m131475i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<C32580g<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C33502c.m135074b());
        arrayList.add(C33046g.m133379g());
        arrayList.add(C33507h.m135086b(f78828a, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C33507h.m135086b(f78829b, "20.3.1"));
        arrayList.add(C33507h.m135086b(f78830c, m131475i(Build.PRODUCT)));
        arrayList.add(C33507h.m135086b(f78831d, m131475i(Build.DEVICE)));
        arrayList.add(C33507h.m135086b(f78832e, m131475i(Build.BRAND)));
        arrayList.add(C33507h.m135087c(f78833f, new C33039h()));
        arrayList.add(C33507h.m135087c(f78834g, new C33054i()));
        arrayList.add(C33507h.m135087c(f78835h, new C33128j()));
        arrayList.add(C33507h.m135087c(f78836i, new C33129k()));
        String a = C33504e.m135080a();
        if (a != null) {
            arrayList.add(C33507h.m135086b(f78837j, a));
        }
        return arrayList;
    }
}
