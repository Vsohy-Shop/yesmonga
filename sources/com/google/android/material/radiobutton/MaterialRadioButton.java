package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.C18472d;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;

public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: g */
    public static final int f76256g = C31076a.C31090n.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: v */
    public static final int[][] f76257v = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @C0363p0

    /* renamed from: e */
    public ColorStateList f76258e;

    /* renamed from: f */
    public boolean f76259f;

    public MaterialRadioButton(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f76258e == null) {
            int d = C31266s.m125953d(this, C31076a.C31079c.colorControlActivated);
            int d2 = C31266s.m125953d(this, C31076a.C31079c.colorOnSurface);
            int d3 = C31266s.m125953d(this, C31076a.C31079c.colorSurface);
            int[][] iArr = f76257v;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C31266s.m125962m(d3, d, 1.0f);
            iArr2[1] = C31266s.m125962m(d3, d2, 0.54f);
            iArr2[2] = C31266s.m125962m(d3, d2, 0.38f);
            iArr2[3] = C31266s.m125962m(d3, d2, 0.38f);
            this.f76258e = new ColorStateList(iArr, iArr2);
        }
        return this.f76258e;
    }

    /* renamed from: a */
    public boolean mo90639a() {
        return this.f76259f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f76259f && C18472d.m83646b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f76259f = z;
        if (z) {
            C18472d.m83648d(this, getMaterialThemeColorsTintList());
        } else {
            C18472d.m83648d(this, (ColorStateList) null);
        }
    }

    public MaterialRadioButton(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.radioButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialRadioButton(@androidx.annotation.C0359n0 android.content.Context r8, @androidx.annotation.C0363p0 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f76256g
            android.content.Context r8 = com.google.android.material.theme.overlay.C31683a.m128455c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.C31076a.C31091o.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C31076a.C31091o.MaterialRadioButton_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = com.google.android.material.resources.C31500c.m127363a(r8, r9, r10)
            androidx.core.widget.C18472d.m83648d(r7, r8)
        L_0x0028:
            int r8 = com.google.android.material.C31076a.C31091o.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f76259f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
