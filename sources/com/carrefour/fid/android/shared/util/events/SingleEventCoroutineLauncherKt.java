package com.carrefour.fid.android.shared.util.events;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSingleEventCoroutineLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleEventCoroutineLauncher.kt\ncom/carrefour/fid/android/shared/util/events/SingleEventCoroutineLauncherKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,26:1\n474#2,4:27\n478#2,2:35\n482#2:41\n25#3:31\n1114#4,3:32\n1117#4,3:38\n474#5:37\n*S KotlinDebug\n*F\n+ 1 SingleEventCoroutineLauncher.kt\ncom/carrefour/fid/android/shared/util/events/SingleEventCoroutineLauncherKt\n*L\n14#1:27,4\n14#1:35,2\n14#1:41\n14#1:31\n14#1:32,3\n14#1:38,3\n14#1:37\n*E\n"})
public final class SingleEventCoroutineLauncherKt {
    @C8540g
    /* renamed from: a */
    public static final <T> void m119625a(T t, @C12580l C11289a<Boolean> aVar, @C12579k C11289a<Boolean> aVar2, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(aVar2, "completeAction");
        C8592o o = oVar.mo15009o(-1019080258);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(t)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14927P(aVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo14927P(aVar2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                aVar = SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$1.f70872f;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1019080258, i, -1, "com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncher (SingleEventCoroutineLauncher.kt:12)");
            }
            o.mo14918M(773894976);
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, o));
                o.mo14893C(wVar);
                N = wVar;
            }
            o.mo15002m0();
            C12074o0 a = ((C8690w) N).mo16831a();
            o.mo15002m0();
            C11723c2 unused = C12038j.m48061f(a, (CoroutineContext) null, (CoroutineStart) null, new SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$2(t, aVar, aVar2, a, (C11045c<? super SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$2>) null), 3, (Object) null);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C11289a<Boolean> aVar3 = aVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$3(t, aVar3, aVar2, i, i2));
        }
    }
}
