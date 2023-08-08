package com.carrefour.fid.android.design.components.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.utils.b */
public final class C37135b {
    /* renamed from: a */
    public static final int m152206a(float f) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getSystem().displayMetrics");
        return C11409d.m43851L0(f * (((float) displayMetrics.densityDpi) / 160.0f));
    }

    /* renamed from: b */
    public static final int m152207b(@C12579k Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return C11409d.m43851L0(TypedValue.applyDimension(2, (float) i, context.getResources().getDisplayMetrics()));
    }
}
