package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class LinearProgressIndicator extends BaseProgressIndicator<C31496n> {

    /* renamed from: Q0 */
    public static final int f76147Q0 = C31076a.C31090n.Widget_MaterialComponents_LinearProgressIndicator;

    /* renamed from: R0 */
    public static final int f76148R0 = 0;

    /* renamed from: S0 */
    public static final int f76149S0 = 1;

    /* renamed from: T0 */
    public static final int f76150T0 = 0;

    /* renamed from: U0 */
    public static final int f76151U0 = 1;

    /* renamed from: V0 */
    public static final int f76152V0 = 2;

    /* renamed from: W0 */
    public static final int f76153W0 = 3;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.progressindicator.LinearProgressIndicator$a */
    public @interface C31468a {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.progressindicator.LinearProgressIndicator$b */
    public @interface C31469b {
    }

    public LinearProgressIndicator(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    public int getIndeterminateAnimationType() {
        return ((C31496n) this.f76128a).f76253g;
    }

    public int getIndicatorDirection() {
        return ((C31496n) this.f76128a).f76254h;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.f76128a;
        C31496n nVar = (C31496n) s;
        boolean z2 = true;
        if (!(((C31496n) s).f76254h == 1 || ((C18196h2.m82553Z(this) == 1 && ((C31496n) this.f76128a).f76254h == 2) || (C18196h2.m82553Z(this) == 0 && ((C31496n) this.f76128a).f76254h == 3)))) {
            z2 = false;
        }
        nVar.f76255i = z2;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        C31487j indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        C31479f progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* renamed from: s */
    public C31496n mo90475i(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        return new C31496n(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i) {
        if (((C31496n) this.f76128a).f76253g != i) {
            if (!mo90491r() || !isIndeterminate()) {
                S s = this.f76128a;
                ((C31496n) s).f76253g = i;
                ((C31496n) s).mo90528e();
                if (i == 0) {
                    getIndeterminateDrawable().mo90610B(new C31489l((C31496n) this.f76128a));
                } else {
                    getIndeterminateDrawable().mo90610B(new C31492m(getContext(), (C31496n) this.f76128a));
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(@C0359n0 int... iArr) {
        super.setIndicatorColor(iArr);
        ((C31496n) this.f76128a).mo90528e();
    }

    public void setIndicatorDirection(int i) {
        S s = this.f76128a;
        ((C31496n) s).f76254h = i;
        C31496n nVar = (C31496n) s;
        boolean z = true;
        if (!(i == 1 || ((C18196h2.m82553Z(this) == 1 && ((C31496n) this.f76128a).f76254h == 2) || (C18196h2.m82553Z(this) == 0 && i == 3)))) {
            z = false;
        }
        nVar.f76255i = z;
        invalidate();
    }

    public void setProgressCompat(int i, boolean z) {
        S s = this.f76128a;
        if (s == null || ((C31496n) s).f76253g != 0 || !isIndeterminate()) {
            super.setProgressCompat(i, z);
        }
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((C31496n) this.f76128a).mo90528e();
        invalidate();
    }

    /* renamed from: t */
    public final void mo90522t() {
        setIndeterminateDrawable(C31487j.m127292y(getContext(), (C31496n) this.f76128a));
        setProgressDrawable(C31479f.m127229B(getContext(), (C31496n) this.f76128a));
    }

    public LinearProgressIndicator(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i) {
        super(context, attributeSet, i, f76147Q0);
        mo90522t();
    }
}
