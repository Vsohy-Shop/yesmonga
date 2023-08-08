package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.g */
public class C31395g {

    /* renamed from: a */
    public static final String f75891a = "lge";

    /* renamed from: b */
    public static final String f75892b = "samsung";

    /* renamed from: c */
    public static final String f75893c = "meizu";

    /* renamed from: a */
    public static boolean m126863a() {
        return m126864b() || m126866d();
    }

    /* renamed from: b */
    public static boolean m126864b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f75891a);
    }

    /* renamed from: c */
    public static boolean m126865c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f75893c);
    }

    /* renamed from: d */
    public static boolean m126866d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f75892b);
    }
}
