package com.carrefour.fid.android.design.components.utils;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.utils.c */
public final class C37136c {
    /* renamed from: a */
    public static final void m152208a(@C12579k ImageView imageView, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ColorMatrix colorMatrix = new ColorMatrix();
        if (z) {
            colorMatrix.setSaturation(1.0f);
        } else {
            colorMatrix.setSaturation(0.0f);
        }
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }
}
