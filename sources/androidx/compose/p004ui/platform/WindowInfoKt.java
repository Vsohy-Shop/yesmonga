package androidx.compose.p004ui.platform;

import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nWindowInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,81:1\n76#2:82\n50#3:83\n49#3:84\n1114#4,6:85\n*S KotlinDebug\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n*L\n55#1:82\n57#1:83\n57#1:84\n57#1:85,6\n*E\n"})
/* renamed from: androidx.compose.ui.platform.WindowInfoKt */
public final class WindowInfoKt {
    @C8540g
    /* renamed from: a */
    public static final void m71135a(@C12579k C11300l<? super Boolean, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(lVar, "onWindowFocusChanged");
        C8592o o = oVar.mo15009o(127829799);
        if ((i & 14) == 0) {
            if (o.mo14927P(lVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(127829799, i2, -1, "androidx.compose.ui.platform.WindowFocusObserver (WindowInfo.kt:53)");
            }
            C15922l4 l4Var = (C15922l4) o.mo15032w(CompositionLocalsKt.m71026x());
            C8578k2<T> t = C8415c2.m30251t(lVar, o, i2 & 14);
            o.mo14918M(511388516);
            boolean n0 = o.mo15006n0(l4Var) | o.mo15006n0(t);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new WindowInfoKt$WindowFocusObserver$1$1(l4Var, t, (C11045c<? super WindowInfoKt$WindowFocusObserver$1$1>) null);
                o.mo14893C(N);
            }
            o.mo15002m0();
            EffectsKt.m29896h(l4Var, (C11304p) N, o, 64);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new WindowInfoKt$WindowFocusObserver$2(lVar, i));
        }
    }
}
