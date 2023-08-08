package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.C3044g0;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C3044g0
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,233:1\n76#2:234\n76#2:235\n102#2,2:236\n76#2:238\n102#2,2:239\n76#2:241\n102#2,2:242\n76#2:244\n102#2,2:245\n76#2:247\n102#2,2:248\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n*L\n121#1:234\n123#1:235\n123#1:236,2\n124#1:238\n124#1:239,2\n125#1:241\n125#1:242,2\n126#1:244\n126#1:245,2\n127#1:247\n127#1:248,2\n*E\n"})
public final class PullRefreshState {

    /* renamed from: j */
    public static final int f18930j = 8;
    @C12579k

    /* renamed from: a */
    public final C12074o0 f18931a;
    @C12579k

    /* renamed from: b */
    public final C8578k2<C11289a<C11079d2>> f18932b;
    @C12579k

    /* renamed from: c */
    public final C8578k2 f18933c = C8415c2.m30235d(new PullRefreshState$adjustedDistancePulled$2(this));
    @C12579k

    /* renamed from: d */
    public final C8700z0 f18934d = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: e */
    public final C8700z0 f18935e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f18936f;
    @C12579k

    /* renamed from: g */
    public final C8700z0 f18937g;
    @C12579k

    /* renamed from: h */
    public final C8700z0 f18938h;
    @C12579k

    /* renamed from: i */
    public final MutatorMutex f18939i;

    public PullRefreshState(@C12579k C12074o0 o0Var, @C12579k C8578k2<? extends C11289a<C11079d2>> k2Var, float f, float f2) {
        Intrinsics.checkNotNullParameter(o0Var, "animationScope");
        Intrinsics.checkNotNullParameter(k2Var, "onRefreshState");
        this.f18931a = o0Var;
        this.f18932b = k2Var;
        Float valueOf = Float.valueOf(0.0f);
        this.f18935e = C8539f2.m30981g(valueOf, (C8410b2) null, 2, (Object) null);
        this.f18936f = C8539f2.m30981g(valueOf, (C8410b2) null, 2, (Object) null);
        this.f18937g = C8539f2.m30981g(Float.valueOf(f2), (C8410b2) null, 2, (Object) null);
        this.f18938h = C8539f2.m30981g(Float.valueOf(f), (C8410b2) null, 2, (Object) null);
        this.f18939i = new MutatorMutex();
    }

    /* renamed from: e */
    public final C11723c2 mo10929e(float f) {
        return C12038j.m48061f(this.f18931a, (CoroutineContext) null, (CoroutineStart) null, new PullRefreshState$animateIndicatorTo$1(this, f, (C11045c<? super PullRefreshState$animateIndicatorTo$1>) null), 3, (Object) null);
    }

    /* renamed from: f */
    public final float mo10930f() {
        if (mo10931g() <= mo10936l()) {
            return mo10931g();
        }
        float H = C11479u.m44331H(Math.abs(mo10934j()) - 1.0f, 0.0f, 2.0f);
        return mo10936l() + (mo10936l() * (H - (((float) Math.pow((double) H, (double) 2)) / ((float) 4))));
    }

    /* renamed from: g */
    public final float mo10931g() {
        return ((Number) this.f18933c.getValue()).floatValue();
    }

    /* renamed from: h */
    public final float mo10932h() {
        return ((Number) this.f18936f.getValue()).floatValue();
    }

    /* renamed from: i */
    public final float mo10933i() {
        return mo10937m();
    }

    /* renamed from: j */
    public final float mo10934j() {
        return mo10931g() / mo10936l();
    }

    /* renamed from: k */
    public final boolean mo10935k() {
        return mo10938n();
    }

    /* renamed from: l */
    public final float mo10936l() {
        return mo10940p();
    }

    /* renamed from: m */
    public final float mo10937m() {
        return ((Number) this.f18935e.getValue()).floatValue();
    }

    /* renamed from: n */
    public final boolean mo10938n() {
        return ((Boolean) this.f18934d.getValue()).booleanValue();
    }

    /* renamed from: o */
    public final float mo10939o() {
        return ((Number) this.f18938h.getValue()).floatValue();
    }

    /* renamed from: p */
    public final float mo10940p() {
        return ((Number) this.f18937g.getValue()).floatValue();
    }

    /* renamed from: q */
    public final float mo10941q(float f) {
        if (mo10938n()) {
            return 0.0f;
        }
        float t = C11479u.m44444t(mo10932h() + f, 0.0f);
        float h = t - mo10932h();
        mo10943s(t);
        mo10947w(mo10930f());
        return h;
    }

    /* renamed from: r */
    public final float mo10942r(float f) {
        boolean z;
        if (mo10935k()) {
            return 0.0f;
        }
        if (mo10931g() > mo10936l()) {
            this.f18932b.getValue().invoke();
        }
        mo10929e(0.0f);
        if (mo10932h() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z || f < 0.0f) {
            f = 0.0f;
        }
        mo10943s(0.0f);
        return f;
    }

    /* renamed from: s */
    public final void mo10943s(float f) {
        this.f18936f.setValue(Float.valueOf(f));
    }

    /* renamed from: t */
    public final void mo10944t(boolean z) {
        if (mo10938n() != z) {
            mo10948x(z);
            float f = 0.0f;
            mo10943s(0.0f);
            if (z) {
                f = mo10939o();
            }
            mo10929e(f);
        }
    }

    /* renamed from: u */
    public final void mo10945u(float f) {
        boolean z;
        if (mo10939o() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo10949y(f);
            if (mo10935k()) {
                mo10929e(f);
            }
        }
    }

    /* renamed from: v */
    public final void mo10946v(float f) {
        mo10950z(f);
    }

    /* renamed from: w */
    public final void mo10947w(float f) {
        this.f18935e.setValue(Float.valueOf(f));
    }

    /* renamed from: x */
    public final void mo10948x(boolean z) {
        this.f18934d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: y */
    public final void mo10949y(float f) {
        this.f18938h.setValue(Float.valueOf(f));
    }

    /* renamed from: z */
    public final void mo10950z(float f) {
        this.f18937g.setValue(Float.valueOf(f));
    }
}
