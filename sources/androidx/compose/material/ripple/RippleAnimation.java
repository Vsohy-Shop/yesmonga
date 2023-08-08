package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1946b;
import androidx.compose.animation.core.C1983k;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15229i2;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.C12169x;
import kotlinx.coroutines.C12179z;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,194:1\n76#2:195\n102#2,2:196\n76#2:198\n102#2,2:199\n138#3:201\n214#4,8:202\n261#4,11:210\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n76#1:195\n76#1:196,2\n77#1:198\n77#1:199,2\n130#1:201\n158#1:202,8\n158#1:210,11\n*E\n"})
public final class RippleAnimation {
    @C12580l

    /* renamed from: a */
    public C15094f f18995a;

    /* renamed from: b */
    public final float f18996b;

    /* renamed from: c */
    public final boolean f18997c;
    @C12580l

    /* renamed from: d */
    public Float f18998d;
    @C12580l

    /* renamed from: e */
    public Float f18999e;
    @C12580l

    /* renamed from: f */
    public C15094f f19000f;
    @C12579k

    /* renamed from: g */
    public final Animatable<Float, C1983k> f19001g;
    @C12579k

    /* renamed from: h */
    public final Animatable<Float, C1983k> f19002h;
    @C12579k

    /* renamed from: i */
    public final Animatable<Float, C1983k> f19003i;
    @C12579k

    /* renamed from: j */
    public final C12169x<C11079d2> f19004j;
    @C12579k

    /* renamed from: k */
    public final C8700z0 f19005k;
    @C12579k

    /* renamed from: l */
    public final C8700z0 f19006l;

    public /* synthetic */ RippleAnimation(C15094f fVar, float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, f, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11017f(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0072
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0066
        L_0x003f:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0056
        L_0x0047:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.mo11019h(r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r2 = r6
        L_0x0056:
            r2.mo11025n(r5)
            kotlinx.coroutines.x<kotlin.d2> r7 = r2.f19004j
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.mo24780v(r0)
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.mo11020i(r0)
            if (r7 != r1) goto L_0x0072
            return r1
        L_0x0072:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.mo11017f(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: g */
    public final void mo11018g(@C12579k C15187e eVar, long j) {
        float f;
        Float f2;
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar2, "$this$draw");
        if (this.f18998d == null) {
            this.f18998d = Float.valueOf(C7918f.m25272b(eVar.mo42718b()));
        }
        if (this.f18999e == null) {
            if (Float.isNaN(this.f18996b)) {
                f2 = Float.valueOf(C7918f.m25271a(eVar2, this.f18997c, eVar.mo42718b()));
            } else {
                f2 = Float.valueOf(eVar2.mo7425g5(this.f18996b));
            }
            this.f18999e = f2;
        }
        if (this.f18995a == null) {
            this.f18995a = C15094f.m64868d(eVar.mo42717U());
        }
        if (this.f19000f == null) {
            this.f19000f = C15094f.m64868d(C15096g.m64898a(C15104m.m65023t(eVar.mo42718b()) / 2.0f, C15104m.m65016m(eVar.mo42718b()) / 2.0f));
        }
        if (!mo11022k() || mo11023l()) {
            f = this.f19001g.mo6613u().floatValue();
        } else {
            f = 1.0f;
        }
        Float f3 = this.f18998d;
        Intrinsics.checkNotNull(f3);
        float floatValue = f3.floatValue();
        Float f4 = this.f18999e;
        Intrinsics.checkNotNull(f4);
        float a = C16515d.m74781a(floatValue, f4.floatValue(), this.f19002h.mo6613u().floatValue());
        C15094f fVar = this.f18995a;
        Intrinsics.checkNotNull(fVar);
        float p = C15094f.m64880p(fVar.mo42242A());
        C15094f fVar2 = this.f19000f;
        Intrinsics.checkNotNull(fVar2);
        float a2 = C16515d.m74781a(p, C15094f.m64880p(fVar2.mo42242A()), this.f19003i.mo6613u().floatValue());
        C15094f fVar3 = this.f18995a;
        Intrinsics.checkNotNull(fVar3);
        float r = C15094f.m64882r(fVar3.mo42242A());
        C15094f fVar4 = this.f19000f;
        Intrinsics.checkNotNull(fVar4);
        long a3 = C15096g.m64898a(a2, C16515d.m74781a(r, C15094f.m64882r(fVar4.mo42242A()), this.f19003i.mo6613u().floatValue()));
        long w = C15240j2.m66080w(j, C15240j2.m66047A(j) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (this.f18997c) {
            float t = C15104m.m65023t(eVar.mo42718b());
            float m = C15104m.m65016m(eVar.mo42718b());
            int b = C15229i2.f37536b.mo42798b();
            C15186d q5 = eVar.mo42683q5();
            long b2 = q5.mo42704b();
            q5.mo42705c().mo42422E();
            q5.mo42703a().mo42710c(0.0f, 0.0f, t, m, b);
            C15187e.m65705a6(eVar, w, a, a3, 0.0f, (C15192h) null, (C15249k2) null, 0, 120, (Object) null);
            q5.mo42705c().mo42443q();
            q5.mo42706d(b2);
            return;
        }
        C15187e.m65705a6(eVar, w, a, a3, 0.0f, (C15192h) null, (C15249k2) null, 0, 120, (Object) null);
    }

    /* renamed from: h */
    public final Object mo11019h(C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new RippleAnimation$fadeIn$2(this, (C11045c<? super RippleAnimation$fadeIn$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    /* renamed from: i */
    public final Object mo11020i(C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new RippleAnimation$fadeOut$2(this, (C11045c<? super RippleAnimation$fadeOut$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    /* renamed from: j */
    public final void mo11021j() {
        mo11024m(true);
        this.f19004j.mo24789G(C11079d2.f28267a);
    }

    /* renamed from: k */
    public final boolean mo11022k() {
        return ((Boolean) this.f19006l.getValue()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo11023l() {
        return ((Boolean) this.f19005k.getValue()).booleanValue();
    }

    /* renamed from: m */
    public final void mo11024m(boolean z) {
        this.f19006l.setValue(Boolean.valueOf(z));
    }

    /* renamed from: n */
    public final void mo11025n(boolean z) {
        this.f19005k.setValue(Boolean.valueOf(z));
    }

    public RippleAnimation(C15094f fVar, float f, boolean z) {
        this.f18995a = fVar;
        this.f18996b = f;
        this.f18997c = z;
        this.f19001g = C1946b.m8288b(0.0f, 0.0f, 2, (Object) null);
        this.f19002h = C1946b.m8288b(0.0f, 0.0f, 2, (Object) null);
        this.f19003i = C1946b.m8288b(0.0f, 0.0f, 2, (Object) null);
        this.f19004j = C12179z.m48760b((C11723c2) null);
        Boolean bool = Boolean.FALSE;
        this.f19005k = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f19006l = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
    }
}
