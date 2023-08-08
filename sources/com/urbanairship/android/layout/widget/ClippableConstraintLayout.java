package com.urbanairship.android.layout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ClippableConstraintLayout extends ConstraintLayout implements C36008d {

    /* renamed from: a */
    public final C36009e f88954a;

    public ClippableConstraintLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0353k0
    public void setClipPathBorderRadius(@C0366r float f) {
        this.f88954a.mo107705a(this, f);
    }

    public ClippableConstraintLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClippableConstraintLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ClippableConstraintLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f88954a = new C36009e();
    }
}
