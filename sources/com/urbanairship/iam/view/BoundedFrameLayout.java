package com.urbanairship.iam.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;

public class BoundedFrameLayout extends FrameLayout {

    /* renamed from: a */
    public final C9251c f25176a;

    /* renamed from: b */
    public final C9252d f25177b;

    public BoundedFrameLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(this.f25176a.mo18607b(i), this.f25176a.mo18606a(i2));
    }

    @C0353k0
    @C0376v0(api = 19)
    public void setClipPathBorderRadius(float f) {
        this.f25177b.mo18608a(this, f);
    }

    public BoundedFrameLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoundedFrameLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25176a = new C9251c(context, attributeSet, i, 0);
        this.f25177b = new C9252d();
    }

    @C0376v0(21)
    public BoundedFrameLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f25176a = new C9251c(context, attributeSet, i, i2);
        this.f25177b = new C9252d();
    }
}
