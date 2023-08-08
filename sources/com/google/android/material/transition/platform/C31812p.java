package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.google.android.material.C31076a;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.p */
public final class C31812p extends C31815r<C31782e> {

    /* renamed from: d */
    public static final float f77599d = 0.92f;
    @C0336f

    /* renamed from: e */
    public static final int f77600e = C31076a.C31079c.motionDurationLong1;
    @C0336f

    /* renamed from: f */
    public static final int f77601f = C31076a.C31079c.motionEasingStandard;

    public C31812p() {
        super(m129048s(), m129049t());
    }

    /* renamed from: s */
    public static C31782e m129048s() {
        return new C31782e();
    }

    /* renamed from: t */
    public static C31828w m129049t() {
        C31816s sVar = new C31816s();
        sVar.mo92316o(false);
        sVar.mo92313l(0.92f);
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

    @C0336f
    /* renamed from: i */
    public int mo92299i(boolean z) {
        return f77600e;
    }

    @C0336f
    /* renamed from: j */
    public int mo92300j(boolean z) {
        return f77601f;
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
