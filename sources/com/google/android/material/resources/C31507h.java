package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.math.C17760a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.resources.h */
public class C31507h {
    @C0363p0
    /* renamed from: a */
    public static Typeface m127398a(@C0359n0 Context context, @C0359n0 Typeface typeface) {
        return m127399b(context.getResources().getConfiguration(), typeface);
    }

    @C0363p0
    /* renamed from: b */
    public static Typeface m127399b(@C0359n0 Configuration configuration, @C0359n0 Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0) {
            return null;
        }
        return Typeface.create(typeface, C17760a.m81102e(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
