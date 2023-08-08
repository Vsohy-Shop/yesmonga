package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.C0330d1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.C31076a;
import com.google.android.material.resources.C31499b;
import com.google.android.material.resources.C31500c;
import com.google.android.material.theme.overlay.C31683a;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: u */
    public static boolean m128443u(Context context) {
        return C31499b.m127356b(context, C31076a.C31079c.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: v */
    public static int m128444v(@C0359n0 Resources.Theme theme, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C31076a.C31091o.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: w */
    public static int m128445w(@C0359n0 Context context, @C0359n0 TypedArray typedArray, @C0330d1 @C0359n0 int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C31500c.m127366d(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: x */
    public static boolean m128446x(@C0359n0 Context context, @C0359n0 Resources.Theme theme, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C31076a.C31091o.MaterialTextView, i, i2);
        int w = m128445w(context, obtainStyledAttributes, C31076a.C31091o.MaterialTextView_android_lineHeight, C31076a.C31091o.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        if (w != -1) {
            return true;
        }
        return false;
    }

    public void setTextAppearance(@C0359n0 Context context, int i) {
        super.setTextAppearance(context, i);
        if (m128443u(context)) {
            mo91852t(context.getTheme(), i);
        }
    }

    /* renamed from: t */
    public final void mo91852t(@C0359n0 Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C31076a.C31091o.MaterialTextAppearance);
        int w = m128445w(getContext(), obtainStyledAttributes, C31076a.C31091o.MaterialTextAppearance_android_lineHeight, C31076a.C31091o.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (w >= 0) {
            setLineHeight(w);
        }
    }

    public MaterialTextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(C31683a.m128455c(context, attributeSet, i, i2), attributeSet, i);
        int v;
        Context context2 = getContext();
        if (m128443u(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!m128446x(context2, theme, attributeSet, i, i2) && (v = m128444v(theme, attributeSet, i, i2)) != -1) {
                mo91852t(theme, v);
            }
        }
    }
}
