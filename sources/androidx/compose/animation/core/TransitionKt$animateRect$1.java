package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 176)
@C11363r0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateRect$1\n*L\n1#1,1155:1\n*E\n"})
public final class TransitionKt$animateRect$1 extends Lambda implements C11305q<Transition.C1927b<S>, C8592o, Integer, C2014v0<C15098i>> {

    /* renamed from: f */
    public static final TransitionKt$animateRect$1 f5382f = new TransitionKt$animateRect$1();

    public TransitionKt$animateRect$1() {
        super(3);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C2014v0<C15098i> mo6765a(@C12579k Transition.C1927b<S> bVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(bVar, "$this$null");
        oVar.mo14918M(691336298);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(691336298, i, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:1149)");
        }
        C2014v0<C15098i> o = C1972h.m8390o(0.0f, 0.0f, C2002p1.m8579h(C15098i.f37261e), 3, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return o;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo6765a((Transition.C1927b) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
