package androidx.compose.foundation;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8751i;
import androidx.compose.p004ui.draw.CacheDrawScope;
import androidx.compose.p004ui.draw.DrawModifierKt;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.node.C15695i1;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$border$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,459:1\n25#2:460\n1114#3,6:461\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$border$2\n*L\n98#1:460\n98#1:461,6\n*E\n"})
public final class BorderKt$border$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C15421z1 $brush;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ float $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$border$2(float f, C15218g4 g4Var, C15421z1 z1Var) {
        super(3);
        this.$width = f;
        this.$shape = g4Var;
        this.$brush = z1Var;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo7132a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(-1498088849);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1498088849, i, -1, "androidx.compose.foundation.border.<anonymous> (Border.kt:93)");
        }
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = new C15695i1();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        final C15695i1 i1Var = (C15695i1) N;
        C8767m.C8768a aVar = C8767m.f23478j;
        final float f = this.$width;
        final C15218g4 g4Var = this.$shape;
        final C15421z1 z1Var = this.$brush;
        C8767m k3 = mVar.mo17224k3(DrawModifierKt.m32437b(aVar, new C11300l<CacheDrawScope, C8751i>() {
            @C12579k
            /* renamed from: a */
            public final C8751i invoke(@C12579k CacheDrawScope cacheDrawScope) {
                boolean z;
                float f;
                boolean z2;
                Intrinsics.checkNotNullParameter(cacheDrawScope, "$this$drawWithCache");
                if (cacheDrawScope.mo7425g5(f) < 0.0f || C15104m.m65020q(cacheDrawScope.mo17089b()) <= 0.0f) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return BorderKt.m8857m(cacheDrawScope);
                }
                if (C16483g.m74440e0(f, C16483g.f40871b.mo47826a())) {
                    f = 1.0f;
                } else {
                    f = (float) Math.ceil((double) cacheDrawScope.mo7425g5(f));
                }
                float f2 = (float) 2;
                float min = Math.min(f, (float) Math.ceil((double) (C15104m.m65020q(cacheDrawScope.mo17089b()) / f2)));
                float f3 = min / f2;
                long a = C15096g.m64898a(f3, f3);
                long a2 = C15106n.m65033a(C15104m.m65023t(cacheDrawScope.mo17089b()) - min, C15104m.m65016m(cacheDrawScope.mo17089b()) - min);
                if (f2 * min > C15104m.m65020q(cacheDrawScope.mo17089b())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C15174d3 a3 = g4Var.mo7615a(cacheDrawScope.mo17089b(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (a3 instanceof C15174d3.C15175a) {
                    return BorderKt.m8858n(cacheDrawScope, i1Var, z1Var, (C15174d3.C15175a) a3, z2, min);
                } else if (a3 instanceof C15174d3.C15177c) {
                    return BorderKt.m8860p(cacheDrawScope, i1Var, z1Var, (C15174d3.C15177c) a3, a, a2, z2, min);
                } else if (a3 instanceof C15174d3.C15176b) {
                    return BorderKt.m8859o(cacheDrawScope, z1Var, a, a2, z2, min);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7132a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
