package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* renamed from: com.google.firebase.crashlytics.internal.common.x */
public class C32732x {

    /* renamed from: b */
    public static final String f79475b = "";

    /* renamed from: a */
    public String f79476a;

    /* renamed from: b */
    public static String m132217b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* renamed from: a */
    public synchronized String mo95039a(Context context) {
        String str;
        if (this.f79476a == null) {
            this.f79476a = m132217b(context);
        }
        if ("".equals(this.f79476a)) {
            str = null;
        } else {
            str = this.f79476a;
        }
        return str;
    }
}
