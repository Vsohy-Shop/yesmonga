package com.carrefour.fid.android.design.components.utils;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.C0358n;
import androidx.annotation.C0364q;
import androidx.core.content.res.C17465i;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.utils.e */
public final class C37138e {
    @C12579k
    /* renamed from: a */
    public static final ColorStateList m152210a(@C12579k Resources resources, @C0358n int i, @C0358n int i2, @C0358n int i3, @C12579k Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(theme, C10108c.f27794S);
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[]{-16842910}, new int[]{16842910}}, new int[]{C17465i.m80173e(resources, i, theme), C17465i.m80173e(resources, i2, theme), C17465i.m80173e(resources, i3, theme)});
    }

    @C12579k
    /* renamed from: b */
    public static final ColorStateList m152211b(@C12579k Resources resources, @C0358n int i, @C0358n int i2, @C12579k Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(theme, C10108c.f27794S);
        return new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{C17465i.m80173e(resources, i, theme), C17465i.m80173e(resources, i2, theme)});
    }

    /* renamed from: c */
    public static final float m152212c(@C12579k Resources resources, @C0364q int i) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return TypedValue.complexToFloat(typedValue.data);
    }
}
