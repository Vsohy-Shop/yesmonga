package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C2563q;
import androidx.compose.foundation.lazy.layout.C2564r;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyListSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n50#2:32\n49#2:33\n1114#3,6:34\n*S KotlinDebug\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n*L\n28#1:32\n28#1:33\n28#1:34,6\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.t */
public final class C2619t {
    @C8540g
    @C12579k
    /* renamed from: a */
    public static final C2563q m11864a(@C12579k LazyListState lazyListState, boolean z, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lazyListState, "state");
        oVar.mo14918M(596174919);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(596174919, i, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:23)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        oVar.mo14918M(511388516);
        boolean n0 = oVar.mo15006n0(valueOf) | oVar.mo15006n0(lazyListState);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = C2564r.m11502a(lazyListState, z);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2563q qVar = (C2563q) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return qVar;
    }
}
