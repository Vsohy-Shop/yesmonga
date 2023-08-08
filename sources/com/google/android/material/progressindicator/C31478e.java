package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31422p;
import com.google.android.material.resources.C31500c;

/* renamed from: com.google.android.material.progressindicator.e */
public final class C31478e extends C31471b {
    @C0372t0

    /* renamed from: g */
    public int f76189g;
    @C0372t0

    /* renamed from: h */
    public int f76190h;

    /* renamed from: i */
    public int f76191i;

    public C31478e(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.circularProgressIndicatorStyle);
    }

    /* renamed from: e */
    public void mo90528e() {
    }

    public C31478e(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i) {
        this(context, attributeSet, i, CircularProgressIndicator.f76144Q0);
    }

    public C31478e(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_progress_circular_inset_medium);
        TypedArray j = C31422p.m126970j(context, attributeSet, C31076a.C31091o.CircularProgressIndicator, i, i2, new int[0]);
        this.f76189g = Math.max(C31500c.m127366d(context, j, C31076a.C31091o.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f76155a * 2);
        this.f76190h = C31500c.m127366d(context, j, C31076a.C31091o.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f76191i = j.getInt(C31076a.C31091o.CircularProgressIndicator_indicatorDirectionCircular, 0);
        j.recycle();
        mo90528e();
    }
}
