package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.semantics.C16033h;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyLayoutSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,151:1\n474#2,4:152\n478#2,2:160\n482#2:166\n25#3:156\n83#3,3:167\n1114#4,3:157\n1117#4,3:163\n1114#4,6:170\n474#5:162\n*S KotlinDebug\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n*L\n47#1:152,4\n47#1:160,2\n47#1:166\n47#1:156\n49#1:167,3\n47#1:157,3\n47#1:163,3\n49#1:170,6\n47#1:162\n*E\n"})
public final class LazyLayoutSemanticsKt {
    @C8540g
    @C12579k
    /* renamed from: a */
    public static final C8767m m11357a(@C12579k C8767m mVar, @C12579k C2549h hVar, @C12579k C2563q qVar, @C12579k Orientation orientation, boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        boolean z3;
        LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1;
        C2530xf9da2eb9 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1;
        C8767m mVar2 = mVar;
        C2549h hVar2 = hVar;
        C2563q qVar2 = qVar;
        Orientation orientation2 = orientation;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(mVar2, "<this>");
        Intrinsics.checkNotNullParameter(hVar2, "itemProvider");
        Intrinsics.checkNotNullParameter(qVar2, "state");
        Intrinsics.checkNotNullParameter(orientation2, "orientation");
        oVar2.mo14918M(290103779);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(290103779, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:39)");
        }
        oVar2.mo14918M(773894976);
        oVar2.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, oVar2));
            oVar2.mo14893C(wVar);
            N = wVar;
        }
        oVar.mo15002m0();
        C12074o0 a = ((C8690w) N).mo16831a();
        oVar.mo15002m0();
        Object[] objArr = {hVar2, qVar2, orientation2, Boolean.valueOf(z)};
        oVar2.mo14918M(-568225417);
        boolean z4 = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z4 |= oVar2.mo15006n0(objArr[i2]);
        }
        Object N2 = oVar.mo14921N();
        if (z4 || N2 == C8592o.f23032a.mo16277a()) {
            if (orientation2 == Orientation.Vertical) {
                z3 = true;
            } else {
                z3 = false;
            }
            LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 = new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1(hVar2);
            C16033h hVar3 = new C16033h(new C2527x1761fe57(qVar2), new C2528x1761fe58(qVar2, hVar2), z2);
            if (z) {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 = new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1(z3, a, qVar2);
            } else {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 = null;
            }
            if (z) {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 = new C2530xf9da2eb9(hVar2, a, qVar2);
            } else {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 = null;
            }
            N2 = SemanticsModifierKt.m71868c(C8767m.f23478j, false, new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1(lazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1, z3, hVar3, lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1, lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1, qVar.mo8636d()), 1, (Object) null);
            oVar2.mo14893C(N2);
        }
        oVar.mo15002m0();
        C8767m k3 = mVar2.mo17224k3((C8767m) N2);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k3;
    }
}
