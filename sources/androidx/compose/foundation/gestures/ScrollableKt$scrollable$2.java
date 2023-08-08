package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C2253k0;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
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
@C11363r0({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$scrollable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,579:1\n474#2,4:580\n478#2,2:588\n482#2:594\n25#3:584\n83#3,3:595\n1114#4,3:585\n1117#4,3:591\n1114#4,6:598\n474#5:590\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$scrollable$2\n*L\n157#1:580,4\n157#1:588,2\n157#1:594\n157#1:584\n159#1:595,3\n157#1:585,3\n157#1:591,3\n159#1:598,6\n157#1:590\n*E\n"})
public final class ScrollableKt$scrollable$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2195g $flingBehavior;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ C2253k0 $overscrollEffect;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ C2203n $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollable$2(Orientation orientation, C2203n nVar, boolean z, C2243g gVar, C2195g gVar2, C2253k0 k0Var, boolean z2) {
        super(3);
        this.$orientation = orientation;
        this.$state = nVar;
        this.$reverseDirection = z;
        this.$interactionSource = gVar;
        this.$flingBehavior = gVar2;
        this.$overscrollEffect = k0Var;
        this.$enabled = z2;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo7454a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(-629830927);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-629830927, i, -1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:155)");
        }
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
        Object[] objArr = {a, this.$orientation, this.$state, Boolean.valueOf(this.$reverseDirection)};
        Orientation orientation = this.$orientation;
        C2203n nVar = this.$state;
        boolean z = this.$reverseDirection;
        oVar.mo14918M(-568225417);
        boolean z2 = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z2 |= oVar.mo15006n0(objArr[i2]);
        }
        Object N2 = oVar.mo14921N();
        if (z2 || N2 == C8592o.f23032a.mo16277a()) {
            N2 = new ContentInViewModifier(a, orientation, nVar, z);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        C8767m mVar2 = C8767m.f23478j;
        C8767m c = ScrollableKt.m9384i(FocusableKt.m8918a(mVar2).mo17224k3(((ContentInViewModifier) N2).mo7330F()), this.$interactionSource, this.$orientation, this.$reverseDirection, this.$state, this.$flingBehavior, this.$overscrollEffect, this.$enabled, oVar, 0);
        if (this.$enabled) {
            mVar2 = C2196h.f5932a;
        }
        C8767m k3 = c.mo17224k3(mVar2);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7454a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
