package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.o */
public final class C31811o extends C31815r<C31779d> {

    /* renamed from: d */
    public static final float f77594d = 0.8f;

    /* renamed from: e */
    public static final float f77595e = 0.3f;
    @C0336f

    /* renamed from: f */
    public static final int f77596f = C31076a.C31079c.motionDurationShort2;
    @C0336f

    /* renamed from: g */
    public static final int f77597g = C31076a.C31079c.motionDurationShort1;
    @C0336f

    /* renamed from: v */
    public static final int f77598v = C31076a.C31079c.motionEasingLinear;

    public C31811o() {
        super(m129037s(), m129038t());
    }

    /* renamed from: s */
    public static C31779d m129037s() {
        C31779d dVar = new C31779d();
        dVar.mo92182e(0.3f);
        return dVar;
    }

    /* renamed from: t */
    public static C31828w m129038t() {
        C31816s sVar = new C31816s();
        sVar.mo92316o(false);
        sVar.mo92313l(0.8f);
        return sVar;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo92289b(@C0359n0 C31828w wVar) {
        super.mo92289b(wVar);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo92290e() {
        super.mo92290e();
    }

    @C0359n0
    /* renamed from: h */
    public TimeInterpolator mo92298h(boolean z) {
        return C31093a.f74425a;
    }

    @C0336f
    /* renamed from: i */
    public int mo92299i(boolean z) {
        if (z) {
            return f77596f;
        }
        return f77597g;
    }

    @C0336f
    /* renamed from: j */
    public int mo92300j(boolean z) {
        return f77598v;
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
}
