package com.carrefour.fid.android.shared.extension;

import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Flow.kt\ncom/carrefour/fid/android/shared/extension/FlowKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,38:1\n76#2:39\n76#2:48\n50#3:40\n49#3:41\n1114#4,6:42\n*S KotlinDebug\n*F\n+ 1 Flow.kt\ncom/carrefour/fid/android/shared/extension/FlowKt\n*L\n16#1:39\n28#1:48\n18#1:40\n18#1:41\n18#1:42,6\n*E\n"})
public final class FlowKt {
    @C8540g
    /* renamed from: a */
    public static final <T> void m118808a(@C12579k C11907e<? extends T> eVar, @C12580l Lifecycle lifecycle, @C12580l Lifecycle.State state, @C12579k C11908f<? super T> fVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(eVar, "flow");
        Intrinsics.checkNotNullParameter(fVar, "collector");
        C8592o o = oVar.mo15009o(-1774112997);
        if ((i2 & 2) != 0) {
            lifecycle = ((C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i())).getLifecycle();
        }
        if ((i2 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1774112997, i, -1, "com.carrefour.fid.android.shared.extension.LaunchedEffectWithLifecycle (Flow.kt:25)");
        }
        EffectsKt.m29896h(eVar, new FlowKt$LaunchedEffectWithLifecycle$1(lifecycle, state, eVar, fVar, (C11045c<? super FlowKt$LaunchedEffectWithLifecycle$1>) null), o, 72);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new FlowKt$LaunchedEffectWithLifecycle$2(eVar, lifecycle, state, fVar, i, i2));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.e<? extends T>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> kotlinx.coroutines.flow.C11907e<T> m118809b(@org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11907e<? extends T> r2, @org.jetbrains.annotations.C12580l androidx.lifecycle.Lifecycle r3, @org.jetbrains.annotations.C12580l androidx.lifecycle.Lifecycle.State r4, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r5, int r6, int r7) {
        /*
            java.lang.String r0 = "flow"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = -1673438944(0xffffffff9c415920, float:-6.3973535E-22)
            r5.mo14918M(r0)
            r1 = r7 & 2
            if (r1 == 0) goto L_0x001d
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r3 = r5.mo15032w(r3)
            androidx.lifecycle.w r3 = (androidx.lifecycle.C19499w) r3
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
        L_0x001d:
            r7 = r7 & 4
            if (r7 == 0) goto L_0x0023
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
        L_0x0023:
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x002f
            r7 = -1
            java.lang.String r1 = "com.carrefour.fid.android.shared.extension.rememberFlowWithLifecycle (Flow.kt:13)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r7, r1)
        L_0x002f:
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r5.mo14918M(r6)
            boolean r6 = r5.mo15006n0(r2)
            boolean r7 = r5.mo15006n0(r3)
            r6 = r6 | r7
            java.lang.Object r7 = r5.mo14921N()
            if (r6 != 0) goto L_0x004c
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r7 != r6) goto L_0x0053
        L_0x004c:
            kotlinx.coroutines.flow.e r7 = androidx.lifecycle.FlowExtKt.m90498a(r2, r3, r4)
            r5.mo14893C(r7)
        L_0x0053:
            r5.mo15002m0()
            kotlinx.coroutines.flow.e r7 = (kotlinx.coroutines.flow.C11907e) r7
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0061
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0061:
            r5.mo15002m0()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.extension.FlowKt.m118809b(kotlinx.coroutines.flow.e, androidx.lifecycle.Lifecycle, androidx.lifecycle.Lifecycle$State, androidx.compose.runtime.o, int, int):kotlinx.coroutines.flow.e");
    }
}
