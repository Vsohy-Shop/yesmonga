package androidx.compose.foundation.gestures;

import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nScrollableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,192:1\n25#2:193\n1114#3,6:194\n*S KotlinDebug\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n*L\n146#1:193\n146#1:194,6\n*E\n"})
public final class ScrollableStateKt {
    @C12579k
    /* renamed from: a */
    public static final C2203n m9405a(@C12579k C11300l<? super Float, Float> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "consumeScrollDelta");
        return new DefaultScrollableState(lVar);
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public static final C2203n m9406b(@C12579k C11300l<? super Float, Float> lVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lVar, "consumeScrollDelta");
        oVar.mo14918M(-180460798);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-180460798, i, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:143)");
        }
        C8578k2<T> t = C8415c2.m30251t(lVar, oVar, i & 14);
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = m9405a(new ScrollableStateKt$rememberScrollableState$1$1(t));
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2203n nVar = (C2203n) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return nVar;
    }
}
