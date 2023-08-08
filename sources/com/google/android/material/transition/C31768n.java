package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.transition.C20657p0;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;

/* renamed from: com.google.android.material.transition.n */
public final class C31768n extends C31829q<C31742d> {

    /* renamed from: u1 */
    public static final float f77427u1 = 0.8f;

    /* renamed from: v1 */
    public static final float f77428v1 = 0.3f;
    @C0336f

    /* renamed from: w1 */
    public static final int f77429w1 = C31076a.C31079c.motionDurationShort2;
    @C0336f

    /* renamed from: x1 */
    public static final int f77430x1 = C31076a.C31079c.motionDurationShort1;
    @C0336f

    /* renamed from: y1 */
    public static final int f77431y1 = C31076a.C31079c.motionEasingLinear;

    public C31768n() {
        super(m128853s1(), m128854t1());
    }

    /* renamed from: s1 */
    public static C31742d m128853s1() {
        C31742d dVar = new C31742d();
        dVar.mo92083e(0.3f);
        return dVar;
    }

    /* renamed from: t1 */
    public static C31842v m128854t1() {
        C31830r rVar = new C31830r();
        rVar.mo92342o(false);
        rVar.mo92339l(0.8f);
        return rVar;
    }

    /* renamed from: Z0 */
    public /* bridge */ /* synthetic */ Animator mo61679Z0(ViewGroup viewGroup, View view, C20657p0 p0Var, C20657p0 p0Var2) {
        return super.mo61679Z0(viewGroup, view, p0Var, p0Var2);
    }

    /* renamed from: b1 */
    public /* bridge */ /* synthetic */ Animator mo61680b1(ViewGroup viewGroup, View view, C20657p0 p0Var, C20657p0 p0Var2) {
        return super.mo61680b1(viewGroup, view, p0Var, p0Var2);
    }

    /* renamed from: e1 */
    public /* bridge */ /* synthetic */ void mo92166e1(@C0359n0 C31842v vVar) {
        super.mo92166e1(vVar);
    }

    /* renamed from: g1 */
    public /* bridge */ /* synthetic */ void mo92167g1() {
        super.mo92167g1();
    }

    @C0359n0
    /* renamed from: i1 */
    public TimeInterpolator mo92173i1(boolean z) {
        return C31093a.f74425a;
    }

    @C0336f
    /* renamed from: l1 */
    public int mo92174l1(boolean z) {
        if (z) {
            return f77429w1;
        }
        return f77430x1;
    }

    @C0336f
    /* renamed from: m1 */
    public int mo92175m1(boolean z) {
        return f77431y1;
    }

    @C0359n0
    /* renamed from: n1 */
    public /* bridge */ /* synthetic */ C31842v mo92168n1() {
        return super.mo92168n1();
    }

    @C0363p0
    /* renamed from: o1 */
    public /* bridge */ /* synthetic */ C31842v mo92169o1() {
        return super.mo92169o1();
    }

    /* renamed from: q1 */
    public /* bridge */ /* synthetic */ boolean mo92170q1(@C0359n0 C31842v vVar) {
        return super.mo92170q1(vVar);
    }

    /* renamed from: r1 */
    public /* bridge */ /* synthetic */ void mo92171r1(@C0363p0 C31842v vVar) {
        super.mo92171r1(vVar);
    }
}
