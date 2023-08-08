package com.google.android.material.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31422p;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.dialog.c */
public class C31330c {
    @C0359n0
    /* renamed from: a */
    public static Rect m126366a(@C0359n0 Context context, @C0336f int i, int i2) {
        TypedArray j = C31422p.m126970j(context, (AttributeSet) null, C31076a.C31091o.MaterialAlertDialog, i, i2, new int[0]);
        int dimensionPixelSize = j.getDimensionPixelSize(C31076a.C31091o.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = j.getDimensionPixelSize(C31076a.C31091o.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = j.getDimensionPixelSize(C31076a.C31091o.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = j.getDimensionPixelSize(C31076a.C31091o.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_alert_dialog_background_inset_bottom));
        j.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            int i3 = dimensionPixelSize3;
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = i3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    @C0359n0
    /* renamed from: b */
    public static InsetDrawable m126367b(@C0363p0 Drawable drawable, @C0359n0 Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
