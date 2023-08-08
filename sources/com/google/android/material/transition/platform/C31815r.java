package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.google.android.material.animation.C31093a;
import com.google.android.material.animation.C31094b;
import com.google.android.material.transition.platform.C31828w;
import java.util.ArrayList;
import java.util.List;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.r */
public abstract class C31815r<P extends C31828w> extends Visibility {

    /* renamed from: a */
    public final P f77609a;
    @C0363p0

    /* renamed from: b */
    public C31828w f77610b;

    /* renamed from: c */
    public final List<C31828w> f77611c = new ArrayList();

    public C31815r(P p, @C0363p0 C31828w wVar) {
        this.f77609a = p;
        this.f77610b = wVar;
    }

    /* renamed from: c */
    public static void m129070c(List<Animator> list, @C0363p0 C31828w wVar, ViewGroup viewGroup, View view, boolean z) {
        Animator animator;
        if (wVar != null) {
            if (z) {
                animator = wVar.mo92180b(viewGroup, view);
            } else {
                animator = wVar.mo92179a(viewGroup, view);
            }
            if (animator != null) {
                list.add(animator);
            }
        }
    }

    /* renamed from: b */
    public void mo92289b(@C0359n0 C31828w wVar) {
        this.f77611c.add(wVar);
    }

    /* renamed from: e */
    public void mo92290e() {
        this.f77611c.clear();
    }

    /* renamed from: f */
    public final Animator mo92303f(@C0359n0 ViewGroup viewGroup, @C0359n0 View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m129070c(arrayList, this.f77609a, viewGroup, view, z);
        m129070c(arrayList, this.f77610b, viewGroup, view, z);
        for (C31828w c : this.f77611c) {
            m129070c(arrayList, c, viewGroup, view, z);
        }
        mo92304m(viewGroup.getContext(), z);
        C31094b.m124650a(animatorSet, arrayList);
        return animatorSet;
    }

    @C0359n0
    /* renamed from: h */
    public TimeInterpolator mo92298h(boolean z) {
        return C31093a.f74426b;
    }

    @C0336f
    /* renamed from: i */
    public int mo92299i(boolean z) {
        return 0;
    }

    @C0336f
    /* renamed from: j */
    public int mo92300j(boolean z) {
        return 0;
    }

    @C0359n0
    /* renamed from: k */
    public P mo92291k() {
        return this.f77609a;
    }

    @C0363p0
    /* renamed from: l */
    public C31828w mo92292l() {
        return this.f77610b;
    }

    /* renamed from: m */
    public final void mo92304m(@C0359n0 Context context, boolean z) {
        C31823v.m129125q(this, context, mo92299i(z));
        C31823v.m129126r(this, context, mo92300j(z), mo92298h(z));
    }

    /* renamed from: n */
    public boolean mo92293n(@C0359n0 C31828w wVar) {
        return this.f77611c.remove(wVar);
    }

    /* renamed from: o */
    public void mo92294o(@C0363p0 C31828w wVar) {
        this.f77610b = wVar;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return mo92303f(viewGroup, view, true);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return mo92303f(viewGroup, view, false);
    }
}
