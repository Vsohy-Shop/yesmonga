package androidx.constraintlayout.compose;

import androidx.annotation.C0379x;
import androidx.compose.foundation.layout.C2429z;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8547h2;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import com.urbanairship.iam.banner.C9156c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C2429z
@C8547h2
public final class ConstrainScope {
    @C12579k

    /* renamed from: a */
    public final Object f41097a;
    @C12579k

    /* renamed from: b */
    public final List<C11300l<C16611l0, C11079d2>> f41098b;
    @C12579k

    /* renamed from: c */
    public final C16591e f41099c;
    @C12579k

    /* renamed from: d */
    public final C16618o0 f41100d;
    @C12579k

    /* renamed from: e */
    public final C16618o0 f41101e;
    @C12579k

    /* renamed from: f */
    public final C16635z f41102f;
    @C12579k

    /* renamed from: g */
    public final C16618o0 f41103g;
    @C12579k

    /* renamed from: h */
    public final C16618o0 f41104h;
    @C12579k

    /* renamed from: i */
    public final C16635z f41105i;
    @C12579k

    /* renamed from: j */
    public final C16581a f41106j;
    @C12579k

    /* renamed from: k */
    public Dimension f41107k;
    @C12579k

    /* renamed from: l */
    public Dimension f41108l;
    @C12579k

    /* renamed from: m */
    public C16625r0 f41109m = C16625r0.f41307b.mo48578e();
    @C0379x(from = 0.0d, mo1016to = 1.0d)

    /* renamed from: n */
    public float f41110n = 1.0f;

    /* renamed from: o */
    public float f41111o = 1.0f;

    /* renamed from: p */
    public float f41112p = 1.0f;

    /* renamed from: q */
    public float f41113q;

    /* renamed from: r */
    public float f41114r;

    /* renamed from: s */
    public float f41115s;

    /* renamed from: t */
    public float f41116t;

    /* renamed from: u */
    public float f41117u;

    /* renamed from: v */
    public float f41118v;

    /* renamed from: w */
    public float f41119w;

    /* renamed from: x */
    public float f41120x;

    /* renamed from: y */
    public float f41121y;

    /* renamed from: z */
    public float f41122z;

    public ConstrainScope(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "id");
        this.f41097a = obj;
        ArrayList arrayList = new ArrayList();
        this.f41098b = arrayList;
        Integer num = State.f42495j;
        Intrinsics.checkNotNullExpressionValue(num, "PARENT");
        this.f41099c = new C16591e(num);
        this.f41100d = new C16614n(obj, -2, arrayList);
        this.f41101e = new C16614n(obj, 0, arrayList);
        this.f41102f = new C16593f(obj, 0, arrayList);
        this.f41103g = new C16614n(obj, -1, arrayList);
        this.f41104h = new C16614n(obj, 1, arrayList);
        this.f41105i = new C16593f(obj, 1, arrayList);
        this.f41106j = new ConstraintBaselineAnchorable(obj, arrayList);
        Dimension.Companion companion = Dimension.f41160a;
        this.f41107k = companion.mo48366d();
        this.f41108l = companion.mo48366d();
        float f = (float) 0;
        this.f41116t = C16483g.m74435M(f);
        this.f41117u = C16483g.m74435M(f);
        this.f41118v = C16483g.m74435M(f);
        this.f41119w = 0.5f;
        this.f41120x = 0.5f;
        this.f41121y = Float.NaN;
        this.f41122z = Float.NaN;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m75030Q(ConstrainScope constrainScope, ConstraintLayoutBaseScope.C16567b bVar, ConstraintLayoutBaseScope.C16567b bVar2, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        if ((i & 4) != 0) {
            f6 = C16483g.m74435M((float) 0);
        } else {
            f6 = f;
        }
        if ((i & 8) != 0) {
            f7 = C16483g.m74435M((float) 0);
        } else {
            f7 = f2;
        }
        if ((i & 16) != 0) {
            f8 = C16483g.m74435M((float) 0);
        } else {
            f8 = f3;
        }
        if ((i & 32) != 0) {
            f9 = C16483g.m74435M((float) 0);
        } else {
            f9 = f4;
        }
        if ((i & 64) != 0) {
            f10 = 0.5f;
        } else {
            f10 = f5;
        }
        constrainScope.mo48176O(bVar, bVar2, f6, f7, f8, f9, f10);
    }

    /* renamed from: R */
    public static /* synthetic */ void m75031R(ConstrainScope constrainScope, ConstraintLayoutBaseScope.C16568c cVar, ConstraintLayoutBaseScope.C16568c cVar2, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        if ((i & 4) != 0) {
            f6 = C16483g.m74435M((float) 0);
        } else {
            f6 = f;
        }
        if ((i & 8) != 0) {
            f7 = C16483g.m74435M((float) 0);
        } else {
            f7 = f2;
        }
        if ((i & 16) != 0) {
            f8 = C16483g.m74435M((float) 0);
        } else {
            f8 = f3;
        }
        if ((i & 32) != 0) {
            f9 = C16483g.m74435M((float) 0);
        } else {
            f9 = f4;
        }
        if ((i & 64) != 0) {
            f10 = 0.5f;
        } else {
            f10 = f5;
        }
        constrainScope.mo48177P(cVar, cVar2, f6, f7, f8, f9, f10);
    }

    /* renamed from: T */
    public static /* synthetic */ void m75032T(ConstrainScope constrainScope, ConstraintLayoutBaseScope.C16568c cVar, ConstraintLayoutBaseScope.C16567b bVar, ConstraintLayoutBaseScope.C16568c cVar2, ConstraintLayoutBaseScope.C16567b bVar2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i, Object obj) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        int i2 = i;
        if ((i2 & 16) != 0) {
            f11 = C16483g.m74435M((float) 0);
        } else {
            f11 = f;
        }
        if ((i2 & 32) != 0) {
            f12 = C16483g.m74435M((float) 0);
        } else {
            f12 = f2;
        }
        if ((i2 & 64) != 0) {
            f13 = C16483g.m74435M((float) 0);
        } else {
            f13 = f3;
        }
        if ((i2 & 128) != 0) {
            f14 = C16483g.m74435M((float) 0);
        } else {
            f14 = f4;
        }
        if ((i2 & 256) != 0) {
            f15 = C16483g.m74435M((float) 0);
        } else {
            f15 = f5;
        }
        if ((i2 & 512) != 0) {
            f16 = C16483g.m74435M((float) 0);
        } else {
            f16 = f6;
        }
        if ((i2 & 1024) != 0) {
            f17 = C16483g.m74435M((float) 0);
        } else {
            f17 = f7;
        }
        if ((i2 & 2048) != 0) {
            f18 = C16483g.m74435M((float) 0);
        } else {
            f18 = f8;
        }
        if ((i2 & 4096) != 0) {
            f19 = 0.5f;
        } else {
            f19 = f9;
        }
        if ((i2 & 8192) != 0) {
            f20 = 0.5f;
        } else {
            f20 = f10;
        }
        constrainScope.mo48178S(cVar, bVar, cVar2, bVar2, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20);
    }

    /* renamed from: g */
    public static /* synthetic */ void m75033g(ConstrainScope constrainScope, C16591e eVar, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        constrainScope.mo48195f(eVar, f);
    }

    /* renamed from: j */
    public static /* synthetic */ void m75034j(ConstrainScope constrainScope, C16591e eVar, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        constrainScope.mo48200i(eVar, f);
    }

    /* renamed from: A */
    public final float mo48162A() {
        return this.f41113q;
    }

    /* renamed from: B */
    public final float mo48163B() {
        return this.f41114r;
    }

    /* renamed from: C */
    public final float mo48164C() {
        return this.f41115s;
    }

    /* renamed from: D */
    public final float mo48165D() {
        return this.f41111o;
    }

    /* renamed from: E */
    public final float mo48166E() {
        return this.f41112p;
    }

    @C12579k
    /* renamed from: F */
    public final C16618o0 mo48167F() {
        return this.f41100d;
    }

    @C12579k
    /* renamed from: G */
    public final List<C11300l<C16611l0, C11079d2>> mo48168G() {
        return this.f41098b;
    }

    @C12579k
    /* renamed from: H */
    public final C16635z mo48169H() {
        return this.f41102f;
    }

    /* renamed from: I */
    public final float mo48170I() {
        return this.f41116t;
    }

    /* renamed from: J */
    public final float mo48171J() {
        return this.f41117u;
    }

    /* renamed from: K */
    public final float mo48172K() {
        return this.f41118v;
    }

    /* renamed from: L */
    public final float mo48173L() {
        return this.f41122z;
    }

    @C12579k
    /* renamed from: M */
    public final C16625r0 mo48174M() {
        return this.f41109m;
    }

    @C12579k
    /* renamed from: N */
    public final Dimension mo48175N() {
        return this.f41107k;
    }

    /* renamed from: O */
    public final void mo48176O(@C12579k ConstraintLayoutBaseScope.C16567b bVar, @C12579k ConstraintLayoutBaseScope.C16567b bVar2, float f, float f2, float f3, float f4, @C0379x(from = 0.0d, mo1016to = 1.0d) float f5) {
        Intrinsics.checkNotNullParameter(bVar, C9156c.f24820X);
        Intrinsics.checkNotNullParameter(bVar2, C9156c.f24821Y);
        this.f41102f.mo48156a(bVar, f, f3);
        this.f41105i.mo48156a(bVar2, f2, f4);
        this.f41098b.add(new ConstrainScope$linkTo$2(this, f5));
    }

    /* renamed from: P */
    public final void mo48177P(@C12579k ConstraintLayoutBaseScope.C16568c cVar, @C12579k ConstraintLayoutBaseScope.C16568c cVar2, float f, float f2, float f3, float f4, @C0379x(from = 0.0d, mo1016to = 1.0d) float f5) {
        Intrinsics.checkNotNullParameter(cVar, "start");
        Intrinsics.checkNotNullParameter(cVar2, "end");
        this.f41100d.mo48159a(cVar, f, f3);
        this.f41103g.mo48159a(cVar2, f2, f4);
        this.f41098b.add(new ConstrainScope$linkTo$1(f5, this));
    }

    /* renamed from: S */
    public final void mo48178S(@C12579k ConstraintLayoutBaseScope.C16568c cVar, @C12579k ConstraintLayoutBaseScope.C16567b bVar, @C12579k ConstraintLayoutBaseScope.C16568c cVar2, @C12579k ConstraintLayoutBaseScope.C16567b bVar2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, @C0379x(from = 0.0d, mo1016to = 1.0d) float f9, @C0379x(from = 0.0d, mo1016to = 1.0d) float f10) {
        Intrinsics.checkNotNullParameter(cVar, "start");
        ConstraintLayoutBaseScope.C16567b bVar3 = bVar;
        Intrinsics.checkNotNullParameter(bVar, C9156c.f24820X);
        Intrinsics.checkNotNullParameter(cVar2, "end");
        ConstraintLayoutBaseScope.C16567b bVar4 = bVar2;
        Intrinsics.checkNotNullParameter(bVar2, C9156c.f24821Y);
        mo48177P(cVar, cVar2, f, f3, f5, f7, f9);
        mo48176O(bVar, bVar2, f2, f4, f6, f8, f10);
    }

    /* renamed from: U */
    public final void mo48179U() {
        this.f41098b.add(new ConstrainScope$resetDimensions$1(this));
    }

    /* renamed from: V */
    public final void mo48180V() {
        this.f41098b.add(new ConstrainScope$resetTransforms$1(this));
    }

    /* renamed from: W */
    public final void mo48181W(float f) {
        this.f41110n = f;
        mo48187b(new ConstrainScope$alpha$1(this, f));
    }

    /* renamed from: X */
    public final void mo48182X(@C12579k Dimension dimension) {
        Intrinsics.checkNotNullParameter(dimension, "value");
        this.f41108l = dimension;
        this.f41098b.add(new ConstrainScope$height$1(this, dimension));
    }

    /* renamed from: Y */
    public final void mo48183Y(float f) {
        this.f41121y = f;
        this.f41098b.add(new ConstrainScope$horizontalChainWeight$1(this, f));
    }

    /* renamed from: Z */
    public final void mo48184Z(float f) {
        this.f41119w = f;
        mo48187b(new ConstrainScope$pivotX$1(f));
    }

    /* renamed from: a */
    public final boolean mo48185a(float f, C11304p<? super ConstraintReference, ? super Float, C11079d2> pVar) {
        return this.f41098b.add(new ConstrainScope$addFloatTransformFromDp$1(pVar, this, f));
    }

    /* renamed from: a0 */
    public final void mo48186a0(float f) {
        this.f41120x = f;
        mo48187b(new ConstrainScope$pivotY$1(f));
    }

    /* renamed from: b */
    public final boolean mo48187b(C11300l<? super ConstraintReference, C11079d2> lVar) {
        return this.f41098b.add(new ConstrainScope$addTransform$1(lVar, this));
    }

    /* renamed from: b0 */
    public final void mo48188b0(float f) {
        this.f41113q = f;
        mo48187b(new ConstrainScope$rotationX$1(f));
    }

    /* renamed from: c */
    public final void mo48189c(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        for (C11300l invoke : this.f41098b) {
            invoke.invoke(l0Var);
        }
    }

    /* renamed from: c0 */
    public final void mo48190c0(float f) {
        this.f41114r = f;
        mo48187b(new ConstrainScope$rotationY$1(f));
    }

    /* renamed from: d */
    public final void mo48191d(@C12579k ConstraintLayoutBaseScope.C16567b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "anchor");
        m75030Q(this, bVar, bVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
    }

    /* renamed from: d0 */
    public final void mo48192d0(float f) {
        this.f41115s = f;
        mo48187b(new ConstrainScope$rotationZ$1(f));
    }

    /* renamed from: e */
    public final void mo48193e(@C12579k ConstraintLayoutBaseScope.C16568c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        m75031R(this, cVar, cVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
    }

    /* renamed from: e0 */
    public final void mo48194e0(float f) {
        this.f41111o = f;
        mo48187b(new ConstrainScope$scaleX$1(f));
    }

    /* renamed from: f */
    public final void mo48195f(@C12579k C16591e eVar, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(eVar, "other");
        m75031R(this, eVar.mo48481l(), eVar.mo48479i(), 0.0f, 0.0f, 0.0f, 0.0f, f, 60, (Object) null);
    }

    /* renamed from: f0 */
    public final void mo48196f0(float f) {
        this.f41112p = f;
        mo48187b(new ConstrainScope$scaleY$1(f));
    }

    /* renamed from: g0 */
    public final void mo48197g0(float f) {
        this.f41116t = f;
        mo48185a(f, ConstrainScope$translationX$1.f41123f);
    }

    /* renamed from: h */
    public final void mo48198h(@C12579k C16591e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "other");
        m75032T(this, eVar.mo48481l(), eVar.mo48482n(), eVar.mo48479i(), eVar.mo48478g(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16368, (Object) null);
    }

    /* renamed from: h0 */
    public final void mo48199h0(float f) {
        this.f41117u = f;
        mo48185a(f, ConstrainScope$translationY$1.f41124f);
    }

    /* renamed from: i */
    public final void mo48200i(@C12579k C16591e eVar, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(eVar, "other");
        m75030Q(this, eVar.mo48482n(), eVar.mo48478g(), 0.0f, 0.0f, 0.0f, 0.0f, f, 60, (Object) null);
    }

    /* renamed from: i0 */
    public final void mo48201i0(float f) {
        this.f41118v = f;
        mo48185a(f, ConstrainScope$translationZ$1.f41125f);
    }

    /* renamed from: j0 */
    public final void mo48202j0(float f) {
        this.f41122z = f;
        this.f41098b.add(new ConstrainScope$verticalChainWeight$1(this, f));
    }

    /* renamed from: k */
    public final void mo48203k(@C12579k C16591e eVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(eVar, "other");
        this.f41098b.add(new ConstrainScope$circular$1(this, eVar, f, f2));
    }

    /* renamed from: k0 */
    public final void mo48204k0(@C12579k C16625r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "value");
        this.f41109m = r0Var;
        this.f41098b.add(new ConstrainScope$visibility$1(this, r0Var));
    }

    /* renamed from: l */
    public final void mo48205l() {
        this.f41098b.add(new ConstrainScope$clearConstraints$1(this));
    }

    /* renamed from: l0 */
    public final void mo48206l0(@C12579k Dimension dimension) {
        Intrinsics.checkNotNullParameter(dimension, "value");
        this.f41107k = dimension;
        this.f41098b.add(new ConstrainScope$width$1(this, dimension));
    }

    /* renamed from: m */
    public final void mo48207m() {
        this.f41098b.add(new ConstrainScope$clearHorizontal$1(this));
    }

    /* renamed from: n */
    public final void mo48208n() {
        this.f41098b.add(new ConstrainScope$clearVertical$1(this));
    }

    @C12579k
    /* renamed from: o */
    public final C16618o0 mo48209o() {
        return this.f41101e;
    }

    @C12579k
    /* renamed from: p */
    public final C16618o0 mo48210p() {
        return this.f41104h;
    }

    /* renamed from: q */
    public final float mo48211q() {
        return this.f41110n;
    }

    @C12579k
    /* renamed from: r */
    public final C16581a mo48212r() {
        return this.f41106j;
    }

    @C12579k
    /* renamed from: s */
    public final C16635z mo48213s() {
        return this.f41105i;
    }

    @C12579k
    /* renamed from: t */
    public final C16618o0 mo48214t() {
        return this.f41103g;
    }

    @C12579k
    /* renamed from: u */
    public final Dimension mo48215u() {
        return this.f41108l;
    }

    /* renamed from: v */
    public final float mo48216v() {
        return this.f41121y;
    }

    @C12579k
    /* renamed from: w */
    public final Object mo48217w() {
        return this.f41097a;
    }

    @C12579k
    /* renamed from: x */
    public final C16591e mo48218x() {
        return this.f41099c;
    }

    /* renamed from: y */
    public final float mo48219y() {
        return this.f41119w;
    }

    /* renamed from: z */
    public final float mo48220z() {
        return this.f41120x;
    }
}
