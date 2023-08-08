package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0372t0;
import androidx.core.content.C17318d;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.shape.C31525j;

public class MaterialDivider extends View {

    /* renamed from: f */
    public static final int f75509f = C31076a.C31090n.Widget_MaterialComponents_MaterialDivider;
    @C0359n0

    /* renamed from: a */
    public final C31525j f75510a;

    /* renamed from: b */
    public int f75511b;
    @C0354l

    /* renamed from: c */
    public int f75512c;

    /* renamed from: d */
    public int f75513d;

    /* renamed from: e */
    public int f75514e;

    public MaterialDivider(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    public int getDividerColor() {
        return this.f75512c;
    }

    @C0372t0
    public int getDividerInsetEnd() {
        return this.f75514e;
    }

    @C0372t0
    public int getDividerInsetStart() {
        return this.f75513d;
    }

    public int getDividerThickness() {
        return this.f75511b;
    }

    public void onDraw(@C0359n0 Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        boolean z = true;
        if (C18196h2.m82553Z(this) != 1) {
            z = false;
        }
        if (z) {
            i = this.f75514e;
        } else {
            i = this.f75513d;
        }
        if (z) {
            i3 = getWidth();
            i2 = this.f75513d;
        } else {
            i3 = getWidth();
            i2 = this.f75514e;
        }
        this.f75510a.setBounds(i, 0, i3 - i2, getBottom() - getTop());
        this.f75510a.draw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f75511b;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@C0354l int i) {
        if (this.f75512c != i) {
            this.f75512c = i;
            this.f75510a.mo90777o0(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(@C0358n int i) {
        setDividerColor(C17318d.m79723f(getContext(), i));
    }

    public void setDividerInsetEnd(@C0372t0 int i) {
        this.f75514e = i;
    }

    public void setDividerInsetEndResource(@C0364q int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@C0372t0 int i) {
        this.f75513d = i;
    }

    public void setDividerInsetStartResource(@C0364q int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@C0372t0 int i) {
        if (this.f75511b != i) {
            this.f75511b = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@C0364q int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.materialDividerStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialDivider(@androidx.annotation.C0359n0 android.content.Context r8, @androidx.annotation.C0363p0 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f75509f
            android.content.Context r8 = com.google.android.material.theme.overlay.C31683a.m128455c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            com.google.android.material.shape.j r0 = new com.google.android.material.shape.j
            r0.<init>()
            r7.f75510a = r0
            int[] r2 = com.google.android.material.C31076a.C31091o.MaterialDivider
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C31076a.C31091o.MaterialDivider_dividerThickness
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.C31076a.C31082f.material_divider_thickness
            int r0 = r0.getDimensionPixelSize(r1)
            int r10 = r9.getDimensionPixelSize(r10, r0)
            r7.f75511b = r10
            int r10 = com.google.android.material.C31076a.C31091o.MaterialDivider_dividerInsetStart
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f75513d = r10
            int r10 = com.google.android.material.C31076a.C31091o.MaterialDivider_dividerInsetEnd
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f75514e = r10
            int r10 = com.google.android.material.C31076a.C31091o.MaterialDivider_dividerColor
            android.content.res.ColorStateList r8 = com.google.android.material.resources.C31500c.m127363a(r8, r9, r10)
            int r8 = r8.getDefaultColor()
            r7.setDividerColor(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
