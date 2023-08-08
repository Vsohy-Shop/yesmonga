package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.transition.C20657p0;
import androidx.transition.C20658p1;
import com.google.android.material.animation.C31093a;
import com.google.android.material.animation.C31094b;
import com.google.android.material.transition.C31842v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.transition.q */
public abstract class C31829q<P extends C31842v> extends C20658p1 {

    /* renamed from: r1 */
    public final P f77639r1;
    @C0363p0

    /* renamed from: s1 */
    public C31842v f77640s1;

    /* renamed from: t1 */
    public final List<C31842v> f77641t1 = new ArrayList();

    public C31829q(P p, @C0363p0 C31842v vVar) {
        this.f77639r1 = p;
        this.f77640s1 = vVar;
    }

    /* renamed from: f1 */
    public static void m129139f1(List<Animator> list, @C0363p0 C31842v vVar, ViewGroup viewGroup, View view, boolean z) {
        Animator animator;
        if (vVar != null) {
            if (z) {
                animator = vVar.mo92081b(viewGroup, view);
            } else {
                animator = vVar.mo92080a(viewGroup, view);
            }
            if (animator != null) {
                list.add(animator);
            }
        }
    }

    /* renamed from: Z0 */
    public Animator mo61679Z0(ViewGroup viewGroup, View view, C20657p0 p0Var, C20657p0 p0Var2) {
        return mo92329h1(viewGroup, view, true);
    }

    /* renamed from: b1 */
    public Animator mo61680b1(ViewGroup viewGroup, View view, C20657p0 p0Var, C20657p0 p0Var2) {
        return mo92329h1(viewGroup, view, false);
    }

    /* renamed from: e1 */
    public void mo92166e1(@C0359n0 C31842v vVar) {
        this.f77641t1.add(vVar);
    }

    /* renamed from: g1 */
    public void mo92167g1() {
        this.f77641t1.clear();
    }

    /* renamed from: h1 */
    public final Animator mo92329h1(@C0359n0 ViewGroup viewGroup, @C0359n0 View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m129139f1(arrayList, this.f77639r1, viewGroup, view, z);
        m129139f1(arrayList, this.f77640s1, viewGroup, view, z);
        for (C31842v f1 : this.f77641t1) {
            m129139f1(arrayList, f1, viewGroup, view, z);
        }
        mo92330p1(viewGroup.getContext(), z);
        C31094b.m124650a(animatorSet, arrayList);
        return animatorSet;
    }

    @C0359n0
    /* renamed from: i1 */
    public TimeInterpolator mo92173i1(boolean z) {
        return C31093a.f74426b;
    }

    @C0336f
    /* renamed from: l1 */
    public int mo92174l1(boolean z) {
        return 0;
    }

    @C0336f
    /* renamed from: m1 */
    public int mo92175m1(boolean z) {
        return 0;
    }

    @C0359n0
    /* renamed from: n1 */
    public P mo92168n1() {
        return this.f77639r1;
    }

    @C0363p0
    /* renamed from: o1 */
    public C31842v mo92169o1() {
        return this.f77640s1;
    }

    /* renamed from: p1 */
    public final void mo92330p1(@C0359n0 Context context, boolean z) {
        C31837u.m129201q(this, context, mo92174l1(z));
        C31837u.m129202r(this, context, mo92175m1(z), mo92173i1(z));
    }

    /* renamed from: q1 */
    public boolean mo92170q1(@C0359n0 C31842v vVar) {
        return this.f77641t1.remove(vVar);
    }

    /* renamed from: r1 */
    public void mo92171r1(@C0363p0 C31842v vVar) {
        this.f77640s1 = vVar;
    }
}
