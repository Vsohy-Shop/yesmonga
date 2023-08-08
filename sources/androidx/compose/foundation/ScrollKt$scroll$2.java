package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.gestures.C2202m;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11076d0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt$scroll$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,410:1\n474#2,4:411\n478#2,2:419\n482#2:425\n25#3:415\n1114#4,3:416\n1117#4,3:422\n474#5:421\n76#6:426\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt$scroll$2\n*L\n267#1:411,4\n267#1:419,2\n267#1:425\n267#1:415\n267#1:416,3\n267#1:422,3\n267#1:421\n299#1:426\n*E\n"})
public final class ScrollKt$scroll$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C2195g $flingBehavior;
    final /* synthetic */ boolean $isScrollable;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ boolean $reverseScrolling;
    final /* synthetic */ ScrollState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2(boolean z, boolean z2, ScrollState scrollState, boolean z3, C2195g gVar) {
        super(3);
        this.$isVertical = z;
        this.$reverseScrolling = z2;
        this.$state = scrollState;
        this.$isScrollable = z3;
        this.$flingBehavior = gVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo7243a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Orientation orientation;
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(1478351300);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1478351300, i, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:264)");
        }
        C2202m mVar2 = C2202m.f5935a;
        C2253k0 b = mVar2.mo7541b(oVar, 6);
        oVar.mo14918M(773894976);
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, oVar));
            oVar.mo14893C(wVar);
            N = wVar;
        }
        oVar.mo15002m0();
        C12074o0 a = ((C8690w) N).mo16831a();
        oVar.mo15002m0();
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m c = SemanticsModifierKt.m71868c(aVar, false, new ScrollKt$scroll$2$semantics$1(this.$reverseScrolling, this.$isVertical, this.$isScrollable, this.$state, a), 1, (Object) null);
        if (this.$isVertical) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        Orientation orientation2 = orientation;
        Orientation orientation3 = orientation2;
        C2253k0 k0Var = b;
        C8767m j = ScrollableKt.m9385j(aVar, this.$state, orientation3, k0Var, this.$isScrollable, mVar2.mo7542c((LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p()), orientation2, this.$reverseScrolling), this.$flingBehavior, this.$state.mo7256p());
        C8767m k3 = C2257l0.m9707a(C2254l.m9703a(c, orientation2), b).mo17224k3(j).mo17224k3(new ScrollingLayoutModifier(this.$state, this.$reverseScrolling, this.$isVertical));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7243a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
