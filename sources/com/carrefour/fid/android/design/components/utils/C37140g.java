package com.carrefour.fid.android.design.components.utils;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.C0364q;
import androidx.annotation.C0375v;
import androidx.core.content.C17318d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.utils.g */
public final class C37140g {
    /* renamed from: a */
    public static final void m152216a(@C12579k TextView textView, @C0375v int i, @C0364q int i2) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (i != 0) {
            drawable = C17318d.m79726i(textView.getContext(), i);
        } else {
            drawable = null;
        }
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(i2);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        textView.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: b */
    public static /* synthetic */ void m152217b(TextView textView, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        m152216a(textView, i, i2);
    }
}
