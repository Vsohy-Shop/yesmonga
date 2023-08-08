package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.RestrictTo;
import com.google.android.material.C31076a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CircularProgressIndicator extends BaseProgressIndicator<C31478e> {

    /* renamed from: Q0 */
    public static final int f76144Q0 = C31076a.C31090n.Widget_MaterialComponents_CircularProgressIndicator;

    /* renamed from: R0 */
    public static final int f76145R0 = 0;

    /* renamed from: S0 */
    public static final int f76146S0 = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.progressindicator.CircularProgressIndicator$a */
    public @interface C31467a {
    }

    public CircularProgressIndicator(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    public int getIndicatorDirection() {
        return ((C31478e) this.f76128a).f76191i;
    }

    @C0372t0
    public int getIndicatorInset() {
        return ((C31478e) this.f76128a).f76190h;
    }

    @C0372t0
    public int getIndicatorSize() {
        return ((C31478e) this.f76128a).f76189g;
    }

    /* renamed from: s */
    public C31478e mo90475i(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        return new C31478e(context, attributeSet);
    }

    public void setIndicatorDirection(int i) {
        ((C31478e) this.f76128a).f76191i = i;
        invalidate();
    }

    public void setIndicatorInset(@C0372t0 int i) {
        S s = this.f76128a;
        if (((C31478e) s).f76190h != i) {
            ((C31478e) s).f76190h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(@C0372t0 int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.f76128a;
        if (((C31478e) s).f76189g != max) {
            ((C31478e) s).f76189g = max;
            ((C31478e) s).mo90528e();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((C31478e) this.f76128a).mo90528e();
    }

    /* renamed from: t */
    public final void mo90514t() {
        setIndeterminateDrawable(C31487j.m127291x(getContext(), (C31478e) this.f76128a));
        setProgressDrawable(C31479f.m127228A(getContext(), (C31478e) this.f76128a));
    }

    public CircularProgressIndicator(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i) {
        super(context, attributeSet, i, f76144Q0);
        mo90514t();
    }
}
