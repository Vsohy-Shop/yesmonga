package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;
import com.google.android.material.elevation.C31333a;
import com.google.android.material.internal.C31432x;

public class SwitchMaterial extends SwitchCompat {

    /* renamed from: y1 */
    public static final int f76702y1 = C31076a.C31090n.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: z1 */
    public static final int[][] f76703z1 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @C0359n0

    /* renamed from: u1 */
    public final C31333a f76704u1;
    @C0363p0

    /* renamed from: v1 */
    public ColorStateList f76705v1;
    @C0363p0

    /* renamed from: w1 */
    public ColorStateList f76706w1;

    /* renamed from: x1 */
    public boolean f76707x1;

    public SwitchMaterial(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f76705v1 == null) {
            int d = C31266s.m125953d(this, C31076a.C31079c.colorSurface);
            int d2 = C31266s.m125953d(this, C31076a.C31079c.colorControlActivated);
            float dimension = getResources().getDimension(C31076a.C31082f.mtrl_switch_thumb_elevation);
            if (this.f76704u1.mo89556l()) {
                dimension += C31432x.m127015j(this);
            }
            int e = this.f76704u1.mo89549e(d, dimension);
            int[][] iArr = f76703z1;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C31266s.m125962m(d, d2, 1.0f);
            iArr2[1] = e;
            iArr2[2] = C31266s.m125962m(d, d2, 0.38f);
            iArr2[3] = e;
            this.f76705v1 = new ColorStateList(iArr, iArr2);
        }
        return this.f76705v1;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f76706w1 == null) {
            int[][] iArr = f76703z1;
            int[] iArr2 = new int[iArr.length];
            int d = C31266s.m125953d(this, C31076a.C31079c.colorSurface);
            int d2 = C31266s.m125953d(this, C31076a.C31079c.colorControlActivated);
            int d3 = C31266s.m125953d(this, C31076a.C31079c.colorOnSurface);
            iArr2[0] = C31266s.m125962m(d, d2, 0.54f);
            iArr2[1] = C31266s.m125962m(d, d3, 0.32f);
            iArr2[2] = C31266s.m125962m(d, d2, 0.12f);
            iArr2[3] = C31266s.m125962m(d, d3, 0.12f);
            this.f76706w1 = new ColorStateList(iArr, iArr2);
        }
        return this.f76706w1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f76707x1 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f76707x1 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    /* renamed from: q */
    public boolean mo91271q() {
        return this.f76707x1;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f76707x1 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList((ColorStateList) null);
        setTrackTintList((ColorStateList) null);
    }

    public SwitchMaterial(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.switchStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchMaterial(@androidx.annotation.C0359n0 android.content.Context r7, @androidx.annotation.C0363p0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f76702y1
            android.content.Context r7 = com.google.android.material.theme.overlay.C31683a.m128455c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            com.google.android.material.elevation.a r7 = new com.google.android.material.elevation.a
            r7.<init>(r0)
            r6.f76704u1 = r7
            int[] r2 = com.google.android.material.C31076a.C31091o.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C31076a.C31091o.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f76707x1 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
