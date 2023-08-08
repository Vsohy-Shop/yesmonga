package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.n */
public final class C31810n extends C31815r<C31816s> {

    /* renamed from: e */
    public static final float f77592e = 0.85f;

    /* renamed from: d */
    public final boolean f77593d;

    public C31810n(boolean z) {
        super(m129028s(z), m129029t());
        this.f77593d = z;
    }

    /* renamed from: s */
    public static C31816s m129028s(boolean z) {
        C31816s sVar = new C31816s(z);
        sVar.mo92314m(0.85f);
        sVar.mo92313l(0.85f);
        return sVar;
    }

    /* renamed from: t */
    public static C31828w m129029t() {
        return new C31779d();
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
    public boolean mo92297u() {
        return this.f77593d;
    }
}
