package com.urbanairship.android.layout.widget;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0366r;
import com.urbanairship.android.layout.property.ConstrainedSize;

public class ConstrainedFrameLayout extends FrameLayout implements C36008d {

    /* renamed from: a */
    public final C36009e f88955a = new C36009e();

    /* renamed from: b */
    public final C36013h f88956b;

    public ConstrainedFrameLayout(@C0359n0 Context context, @C0359n0 ConstrainedSize constrainedSize) {
        super(context);
        this.f88956b = new C36013h(this, constrainedSize);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m148242c(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void onMeasure(int i, int i2) {
        this.f88956b.mo107710b(i, i2, new C36011f(this), new C36012g(this));
    }

    @C0353k0
    public void setClipPathBorderRadius(@C0366r float f) {
        this.f88955a.mo107705a(this, f);
    }
}
