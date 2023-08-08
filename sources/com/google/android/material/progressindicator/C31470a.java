package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.progressindicator.a */
public class C31470a {

    /* renamed from: a */
    public static float f76154a = 1.0f;

    @C0344h1
    /* renamed from: b */
    public static void m127189b(float f) {
        f76154a = f;
    }

    /* renamed from: a */
    public float mo90523a(@C0359n0 ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
