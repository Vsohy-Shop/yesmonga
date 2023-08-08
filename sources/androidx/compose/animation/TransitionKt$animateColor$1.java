package androidx.compose.animation;

import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2014v0;
import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.graphics.C15240j2;
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
@C11363r0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt$animateColor$1\n*L\n1#1,124:1\n*E\n"})
public final class TransitionKt$animateColor$1 extends Lambda implements C11305q<Transition.C1927b<S>, C8592o, Integer, C2014v0<C15240j2>> {

    /* renamed from: f */
    public static final TransitionKt$animateColor$1 f5266f = new TransitionKt$animateColor$1();

    public TransitionKt$animateColor$1() {
        super(3);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C2014v0<C15240j2> mo6583a(@C12579k Transition.C1927b<S> bVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(bVar, "$this$null");
        oVar.mo14918M(-1457805428);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1457805428, i, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");
        }
        C2014v0<C15240j2> o = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return o;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo6583a((Transition.C1927b) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
