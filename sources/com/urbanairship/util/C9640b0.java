package com.urbanairship.util;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.UAirship;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.b0 */
public class C9640b0 {
    @C0359n0

    /* renamed from: a */
    public static final String f26415a = "com.urbanairship.INSTALL_NETWORK_SECURITY_PROVIDER";
    @C0359n0

    /* renamed from: b */
    public static final String f26416b = "com.urbanairship.webview.ENABLE_LOCAL_STORAGE";
    @C0359n0

    /* renamed from: c */
    public static final String f26417c = "com.urbanairship.webview.localstorage";
    @C0359n0

    /* renamed from: d */
    public static final String f26418d = "android.webkit.WebView.EnableSafeBrowsing";

    @C0363p0
    /* renamed from: a */
    public static ActivityInfo m36123a(@C0359n0 Class cls) {
        if (cls.getCanonicalName() == null) {
            return null;
        }
        try {
            return UAirship.m146202z().getActivityInfo(new ComponentName(UAirship.m146180A(), cls.getCanonicalName()), 128);
        } catch (Exception unused) {
            return null;
        }
    }

    @C0363p0
    /* renamed from: b */
    public static ApplicationInfo m36124b() {
        try {
            return UAirship.m146202z().getApplicationInfo(UAirship.m146180A(), 128);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m36125c(@C0359n0 String str) {
        if (UAirship.m146202z().checkPermission(str, UAirship.m146180A()) == 0) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public static boolean m36126d() {
        Bundle bundle;
        ApplicationInfo b = m36124b();
        if (b == null || (bundle = b.metaData) == null || !bundle.containsKey(f26418d)) {
            return true;
        }
        return b.metaData.getBoolean(f26418d, true);
    }

    /* renamed from: e */
    public static boolean m36127e() {
        Bundle bundle;
        ApplicationInfo b = m36124b();
        if (b == null || (bundle = b.metaData) == null || !bundle.getBoolean(f26416b, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m36128f() {
        Bundle bundle;
        ApplicationInfo b = m36124b();
        if (b == null || (bundle = b.metaData) == null || !bundle.getBoolean(f26415a, false)) {
            return false;
        }
        return true;
    }
}
