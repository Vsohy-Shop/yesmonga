package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.widget.C18472d;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;
import com.google.android.material.internal.C31432x;

public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: v */
    public static final int f74989v = C31076a.C31090n.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: w */
    public static final int[][] f74990w = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @C0363p0

    /* renamed from: e */
    public ColorStateList f74991e;

    /* renamed from: f */
    public boolean f74992f;

    /* renamed from: g */
    public boolean f74993g;

    public MaterialCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f74991e == null) {
            int[][] iArr = f74990w;
            int[] iArr2 = new int[iArr.length];
            int d = C31266s.m125953d(this, C31076a.C31079c.colorControlActivated);
            int d2 = C31266s.m125953d(this, C31076a.C31079c.colorSurface);
            int d3 = C31266s.m125953d(this, C31076a.C31079c.colorOnSurface);
            iArr2[0] = C31266s.m125962m(d2, d, 1.0f);
            iArr2[1] = C31266s.m125962m(d2, d3, 0.54f);
            iArr2[2] = C31266s.m125962m(d2, d3, 0.38f);
            iArr2[3] = C31266s.m125962m(d2, d3, 0.38f);
            this.f74991e = new ColorStateList(iArr, iArr2);
        }
        return this.f74991e;
    }

    /* renamed from: c */
    public boolean mo88746c() {
        return this.f74993g;
    }

    /* renamed from: d */
    public boolean mo88747d() {
        return this.f74992f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f74992f && C18472d.m83646b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void onDraw(Canvas canvas) {
        Drawable a;
        int i;
        if (!this.f74993g || !TextUtils.isEmpty(getText()) || (a = C18472d.m83645a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        if (C31432x.m127016k(this)) {
            i = -1;
        } else {
            i = 1;
        }
        int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * i;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a.getBounds();
            C17549d.m80450l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f74993g = z;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f74992f = z;
        if (z) {
            C18472d.m83648d(this, getMaterialThemeColorsTintList());
        } else {
            C18472d.m83648d(this, (ColorStateList) null);
        }
    }

    public MaterialCheckBox(Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.checkboxStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r8, @androidx.annotation.C0363p0 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f74989v
            android.content.Context r8 = com.google.android.material.theme.overlay.C31683a.m128455c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.C31076a.C31091o.MaterialCheckBox
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C31076a.C31091o.MaterialCheckBox_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = com.google.android.material.resources.C31500c.m127363a(r8, r9, r10)
            androidx.core.widget.C18472d.m83648d(r7, r8)
        L_0x0028:
            int r8 = com.google.android.material.C31076a.C31091o.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f74992f = r8
            int r8 = com.google.android.material.C31076a.C31091o.MaterialCheckBox_centerIfNoTextEnabled
            r10 = 1
            boolean r8 = r9.getBoolean(r8, r10)
            r7.f74993g = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
