package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1946b;
import androidx.compose.animation.core.C1983k;
import androidx.compose.foundation.interaction.C2230a;
import androidx.compose.foundation.interaction.C2234b;
import androidx.compose.foundation.interaction.C2237c;
import androidx.compose.foundation.interaction.C2240d;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15229i2;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.runtime.C8578k2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,355:1\n138#2:356\n214#3,8:357\n261#3,11:365\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n*L\n304#1:356\n316#1:357,8\n316#1:365,11\n*E\n"})
public final class StateLayer {

    /* renamed from: a */
    public final boolean f19027a;
    @C12579k

    /* renamed from: b */
    public final C8578k2<C7917e> f19028b;
    @C12579k

    /* renamed from: c */
    public final Animatable<Float, C1983k> f19029c = C1946b.m8288b(0.0f, 0.0f, 2, (Object) null);
    @C12579k

    /* renamed from: d */
    public final List<C2240d> f19030d = new ArrayList();
    @C12580l

    /* renamed from: e */
    public C2240d f19031e;

    public StateLayer(boolean z, @C12579k C8578k2<C7917e> k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "rippleAlpha");
        this.f19027a = z;
        this.f19028b = k2Var;
    }

    /* renamed from: b */
    public final void mo11046b(@C12579k C15187e eVar, float f, long j) {
        float f2;
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar2, "$this$drawStateLayer");
        if (Float.isNaN(f)) {
            f2 = C7918f.m25271a(eVar2, this.f19027a, eVar.mo42718b());
        } else {
            f2 = eVar.mo7425g5(f);
        }
        float f3 = f2;
        float floatValue = this.f19029c.mo6613u().floatValue();
        if (floatValue > 0.0f) {
            long w = C15240j2.m66080w(j, floatValue, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            if (this.f19027a) {
                float t = C15104m.m65023t(eVar.mo42718b());
                float m = C15104m.m65016m(eVar.mo42718b());
                int b = C15229i2.f37536b.mo42798b();
                C15186d q5 = eVar.mo42683q5();
                long b2 = q5.mo42704b();
                q5.mo42705c().mo42422E();
                q5.mo42703a().mo42710c(0.0f, 0.0f, t, m, b);
                C15187e.m65705a6(eVar, w, f3, 0, 0.0f, (C15192h) null, (C15249k2) null, 0, 124, (Object) null);
                q5.mo42705c().mo42443q();
                q5.mo42706d(b2);
                return;
            }
            C15187e.m65705a6(eVar, w, f3, 0, 0.0f, (C15192h) null, (C15249k2) null, 0, 124, (Object) null);
        }
    }

    /* renamed from: c */
    public final void mo11047c(@C12579k C2240d dVar, @C12579k C12074o0 o0Var) {
        float f;
        Intrinsics.checkNotNullParameter(dVar, "interaction");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        boolean z = dVar instanceof C2237c.C2238a;
        if (z) {
            this.f19030d.add(dVar);
        } else if (dVar instanceof C2237c.C2239b) {
            this.f19030d.remove(((C2237c.C2239b) dVar).mo7602a());
        } else if (dVar instanceof C2234b.C2235a) {
            this.f19030d.add(dVar);
        } else if (dVar instanceof C2234b.C2236b) {
            this.f19030d.remove(((C2234b.C2236b) dVar).mo7601a());
        } else if (dVar instanceof C2230a.C2232b) {
            this.f19030d.add(dVar);
        } else if (dVar instanceof C2230a.C2233c) {
            this.f19030d.remove(((C2230a.C2233c) dVar).mo7600a());
        } else if (dVar instanceof C2230a.C2231a) {
            this.f19030d.remove(((C2230a.C2231a) dVar).mo7599a());
        } else {
            return;
        }
        C2240d dVar2 = (C2240d) CollectionsKt___CollectionsKt.m40677q3(this.f19030d);
        if (!Intrinsics.areEqual((Object) this.f19031e, (Object) dVar2)) {
            if (dVar2 != null) {
                if (z) {
                    f = this.f19028b.getValue().mo11053c();
                } else if (dVar instanceof C2234b.C2235a) {
                    f = this.f19028b.getValue().mo11052b();
                } else if (dVar instanceof C2230a.C2232b) {
                    f = this.f19028b.getValue().mo11051a();
                } else {
                    f = 0.0f;
                }
                C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new StateLayer$handleInteraction$1(this, f, C7922j.m25283c(dVar2), (C11045c<? super StateLayer$handleInteraction$1>) null), 3, (Object) null);
            } else {
                C11723c2 unused2 = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new StateLayer$handleInteraction$2(this, C7922j.m25284d(this.f19031e), (C11045c<? super StateLayer$handleInteraction$2>) null), 3, (Object) null);
            }
            this.f19031e = dVar2;
        }
    }
}
