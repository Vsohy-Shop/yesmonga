package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.C0363p0;
import androidx.core.graphics.drawable.C17549d;
import com.google.android.gms.base.C40426a;
import com.google.android.gms.common.util.C40986l;

public final class zaaa extends Button {
    public zaaa(Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    /* renamed from: b */
    public static final int m166221b(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        throw new IllegalStateException("Unknown color scheme: " + i);
    }

    /* renamed from: a */
    public final void mo134519a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = C40426a.C40429c.common_google_signin_btn_icon_dark;
        int i5 = C40426a.C40429c.common_google_signin_btn_icon_light;
        int b = m166221b(i2, i4, i5, i5);
        int i6 = C40426a.C40429c.common_google_signin_btn_text_dark;
        int i7 = C40426a.C40429c.common_google_signin_btn_text_light;
        int b2 = m166221b(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            b = b2;
        } else if (i != 2) {
            throw new IllegalStateException("Unknown button size: " + i);
        }
        Drawable r = C17549d.m80456r(resources.getDrawable(b));
        C17549d.m80453o(r, resources.getColorStateList(C40426a.C40428b.common_google_signin_btn_tint));
        C17549d.m80454p(r, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(r);
        int i8 = C40426a.C40428b.common_google_signin_btn_text_dark;
        int i9 = C40426a.C40428b.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) C40843u.m166202l(resources.getColorStateList(m166221b(i2, i8, i9, i9))));
        if (i == 0) {
            setText(resources.getString(C40426a.C40431e.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(C40426a.C40431e.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            throw new IllegalStateException("Unknown button size: " + i);
        }
        setTransformationMethod((TransformationMethod) null);
        if (C40986l.m166650k(getContext())) {
            setGravity(19);
        }
    }
}
