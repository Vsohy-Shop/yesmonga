package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
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
@C11363r0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntSize$1\n*L\n1#1,1155:1\n*E\n"})
public final class TransitionKt$animateIntSize$1 extends Lambda implements C11305q<Transition.C1927b<S>, C8592o, Integer, C2014v0<C16500q>> {

    /* renamed from: f */
    public static final TransitionKt$animateIntSize$1 f5380f = new TransitionKt$animateIntSize$1();

    public TransitionKt$animateIntSize$1() {
        super(3);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C2014v0<C16500q> mo6763a(@C12579k Transition.C1927b<S> bVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(bVar, "$this$null");
        oVar.mo14918M(967893300);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(967893300, i, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:1119)");
        }
        C2014v0<C16500q> o = C1972h.m8390o(0.0f, 0.0f, C16500q.m74651b(C16502r.m74668a(1, 1)), 3, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return o;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo6763a((Transition.C1927b) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
