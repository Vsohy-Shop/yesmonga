package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18306m0;
import com.google.android.material.C31076a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.q */
public final class C31813q extends C31815r<C31828w> {

    /* renamed from: f */
    public static final int f77602f = 0;

    /* renamed from: g */
    public static final int f77603g = 1;

    /* renamed from: v */
    public static final int f77604v = 2;
    @C0336f

    /* renamed from: w */
    public static final int f77605w = C31076a.C31079c.motionDurationLong1;
    @C0336f

    /* renamed from: x */
    public static final int f77606x = C31076a.C31079c.motionEasingStandard;

    /* renamed from: d */
    public final int f77607d;

    /* renamed from: e */
    public final boolean f77608e;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.transition.platform.q$a */
    public @interface C31814a {
    }

    public C31813q(int i, boolean z) {
        super(m129058s(i, z), m129059t());
        this.f77607d = i;
        this.f77608e = z;
    }

    /* renamed from: s */
    public static C31828w m129058s(int i, boolean z) {
        int i2;
        int i3;
        if (i == 0) {
            if (z) {
                i2 = 8388613;
            } else {
                i2 = C18306m0.f46960b;
            }
            return new C31818t(i2);
        } else if (i == 1) {
            if (z) {
                i3 = 80;
            } else {
                i3 = 48;
            }
            return new C31818t(i3);
        } else if (i == 2) {
            return new C31816s(z);
        } else {
            throw new IllegalArgumentException("Invalid axis: " + i);
        }
    }

    /* renamed from: t */
    public static C31828w m129059t() {
        return new C31782e();
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo92289b(@C0359n0 C31828w wVar) {
        super.mo92289b(wVar);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo92290e() {
        super.mo92290e();
    }

    @C0336f
    /* renamed from: i */
    public int mo92299i(boolean z) {
        return f77605w;
    }

    @C0336f
    /* renamed from: j */
    public int mo92300j(boolean z) {
        return f77606x;
    }

    @C0359n0
    /* renamed from: k */
    public /* bridge */ /* synthetic */ C31828w mo92291k() {
        return super.mo92291k();
    }

    @C0363p0
    /* renamed from: l */
    public /* bridge */ /* synthetic */ C31828w mo92292l() {
        return super.mo92292l();
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ boolean mo92293n(@C0359n0 C31828w wVar) {
        return super.mo92293n(wVar);
    }

    /* renamed from: o */
    public /* bridge */ /* synthetic */ void mo92294o(@C0363p0 C31828w wVar) {
        super.mo92294o(wVar);
    }

    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    /* renamed from: u */
    public int mo92301u() {
        return this.f77607d;
    }

    /* renamed from: v */
    public boolean mo92302v() {
        return this.f77608e;
    }
}
