package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* renamed from: com.google.android.material.textfield.f */
public class C31669f {
    /* renamed from: a */
    public static void m128354a(@C0359n0 TextInputLayout textInputLayout, @C0359n0 CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = C17549d.m80456r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                C17549d.m80453o(drawable, colorStateList);
            } else {
                C17549d.m80453o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(m128355b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                C17549d.m80454p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: b */
    public static int[] m128355b(@C0359n0 TextInputLayout textInputLayout, @C0359n0 CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: c */
    public static void m128356c(@C0359n0 TextInputLayout textInputLayout, @C0359n0 CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(m128355b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = C17549d.m80456r(drawable).mutate();
            C17549d.m80453o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: d */
    public static void m128357d(@C0359n0 CheckableImageButton checkableImageButton, @C0363p0 View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean K0 = C18196h2.m82509K0(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (K0 || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(K0);
        checkableImageButton.setPressable(K0);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        C18196h2.m82531R1(checkableImageButton, i);
    }

    /* renamed from: e */
    public static void m128358e(@C0359n0 CheckableImageButton checkableImageButton, @C0363p0 View.OnClickListener onClickListener, @C0363p0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m128357d(checkableImageButton, onLongClickListener);
    }

    /* renamed from: f */
    public static void m128359f(@C0359n0 CheckableImageButton checkableImageButton, @C0363p0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m128357d(checkableImageButton, onLongClickListener);
    }
}
