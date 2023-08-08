package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.saveable.C8623b;
import androidx.compose.runtime.saveable.C8624c;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,106:1\n76#2:107\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n*L\n43#1:107\n*E\n"})
public final class LazySaveableStateHolderKt {
    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: a */
    public static final void m11383a(@C12579k C11305q<? super C8623b, ? super C8592o, ? super Integer, C11079d2> qVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(qVar, "content");
        C8592o o = oVar.mo15009o(674185128);
        if ((i & 14) == 0) {
            if (o.mo14927P(qVar)) {
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
                ComposerKt.m29845w0(674185128, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            C8624c cVar = (C8624c) o.mo15032w(SaveableStateRegistryKt.m31373b());
            LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) RememberSaveableKt.m31343d(new Object[]{cVar}, LazySaveableStateHolder.f6704d.mo8717a(cVar), (String) null, new C2536xbfffdb03(cVar), o, 72, 4);
            CompositionLocalKt.m29856b(new C8572j1[]{SaveableStateRegistryKt.m31373b().mo16141f(lazySaveableStateHolder)}, C8553b.m31048b(o, 1863926504, true, new LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1(lazySaveableStateHolder, qVar, i2)), o, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2(qVar, i));
        }
    }
}
