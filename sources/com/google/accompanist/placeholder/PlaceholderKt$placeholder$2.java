package com.google.accompanist.placeholder;

import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2014v0;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/animation/core/Transition$b;", "", "Landroidx/compose/animation/core/v0;", "", "a", "(Landroidx/compose/animation/core/Transition$b;Landroidx/compose/runtime/o;I)Landroidx/compose/animation/core/v0;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PlaceholderKt$placeholder$2 extends Lambda implements C11305q<Transition.C1927b<Boolean>, C8592o, Integer, C2014v0<Float>> {

    /* renamed from: f */
    public static final PlaceholderKt$placeholder$2 f37162f = new PlaceholderKt$placeholder$2();

    public PlaceholderKt$placeholder$2() {
        super(3);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C2014v0<Float> mo42036a(@C12579k Transition.C1927b<Boolean> bVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(bVar, "$this$null");
        oVar.mo14918M(-439090190);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-439090190, i, -1, "com.google.accompanist.placeholder.placeholder.<anonymous> (Placeholder.kt:110)");
        }
        C2014v0<Float> o = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return o;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo42036a((Transition.C1927b) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
