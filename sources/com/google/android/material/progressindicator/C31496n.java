package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31422p;

/* renamed from: com.google.android.material.progressindicator.n */
public final class C31496n extends C31471b {

    /* renamed from: g */
    public int f76253g;

    /* renamed from: h */
    public int f76254h;

    /* renamed from: i */
    public boolean f76255i;

    public C31496n(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.linearProgressIndicatorStyle);
    }

    /* renamed from: e */
    public void mo90528e() {
        if (this.f76253g != 0) {
            return;
        }
        if (this.f76156b > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.f76157c.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }

    public C31496n(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i) {
        this(context, attributeSet, i, LinearProgressIndicator.f76147Q0);
    }

    public C31496n(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        super(context, attributeSet, i, i2);
        boolean z = false;
        TypedArray j = C31422p.m126970j(context, attributeSet, C31076a.C31091o.LinearProgressIndicator, C31076a.C31079c.linearProgressIndicatorStyle, LinearProgressIndicator.f76147Q0, new int[0]);
        this.f76253g = j.getInt(C31076a.C31091o.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f76254h = j.getInt(C31076a.C31091o.LinearProgressIndicator_indicatorDirectionLinear, 0);
        j.recycle();
        mo90528e();
        this.f76255i = this.f76254h == 1 ? true : z;
    }
}
