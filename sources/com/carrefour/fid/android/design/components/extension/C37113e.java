package com.carrefour.fid.android.design.components.extension;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.C0354l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.extension.e */
public final class C37113e {
    @C12579k
    /* renamed from: a */
    public static final Drawable m152154a(@C12579k Drawable drawable, int i) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        return new InsetDrawable(drawable, i, i, i, i);
    }

    @C12579k
    /* renamed from: b */
    public static final RippleDrawable m152155b(@C12580l Drawable drawable, @C0354l int i) {
        return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{i}), drawable, (Drawable) null);
    }
}
