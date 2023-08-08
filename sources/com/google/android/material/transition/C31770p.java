package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18306m0;
import androidx.transition.C20657p0;
import com.google.android.material.C31076a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.material.transition.p */
public final class C31770p extends C31829q<C31842v> {
    @C0336f

    /* renamed from: A1 */
    public static final int f77435A1 = C31076a.C31079c.motionEasingStandard;

    /* renamed from: w1 */
    public static final int f77436w1 = 0;

    /* renamed from: x1 */
    public static final int f77437x1 = 1;

    /* renamed from: y1 */
    public static final int f77438y1 = 2;
    @C0336f

    /* renamed from: z1 */
    public static final int f77439z1 = C31076a.C31079c.motionDurationLong1;

    /* renamed from: u1 */
    public final int f77440u1;

    /* renamed from: v1 */
    public final boolean f77441v1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.transition.p$a */
    public @interface C31771a {
    }

    public C31770p(int i, boolean z) {
        super(m128878s1(i, z), m128879t1());
        this.f77440u1 = i;
        this.f77441v1 = z;
    }

    /* renamed from: s1 */
    public static C31842v m128878s1(int i, boolean z) {
        int i2;
        int i3;
        if (i == 0) {
            if (z) {
                i2 = 8388613;
            } else {
                i2 = C18306m0.f46960b;
            }
            return new C31832s(i2);
        } else if (i == 1) {
            if (z) {
                i3 = 80;
            } else {
                i3 = 48;
            }
            return new C31832s(i3);
        } else if (i == 2) {
            return new C31830r(z);
        } else {
            throw new IllegalArgumentException("Invalid axis: " + i);
        }
    }

    /* renamed from: t1 */
    public static C31842v m128879t1() {
        return new C31745e();
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

    @C0336f
    /* renamed from: l1 */
    public int mo92174l1(boolean z) {
        return f77439z1;
    }

    @C0336f
    /* renamed from: m1 */
    public int mo92175m1(boolean z) {
        return f77435A1;
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

    /* renamed from: u1 */
    public int mo92176u1() {
        return this.f77440u1;
    }

    /* renamed from: v1 */
    public boolean mo92177v1() {
        return this.f77441v1;
    }
}
