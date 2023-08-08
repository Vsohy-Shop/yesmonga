package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.platform.C15991w3;
import androidx.compose.p004ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFocusHandlerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusHandlerComponent.kt\ncom/carrefour/fid/android/design/components/compose/FocusHandlerComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,26:1\n67#2,3:27\n66#2:30\n1114#3,6:31\n*S KotlinDebug\n*F\n+ 1 FocusHandlerComponent.kt\ncom/carrefour/fid/android/design/components/compose/FocusHandlerComponentKt\n*L\n19#1:27,3\n19#1:30\n19#1:31,6\n*E\n"})
public final class FocusHandlerComponentKt {
    @C8540g
    /* renamed from: a */
    public static final void m151494a(boolean z, @C12579k FocusRequester focusRequester, @C12580l C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        C8592o o = oVar.mo15009o(-1646166913);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo14961b(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo15006n0(focusRequester)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo14927P(aVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                aVar = FocusHandlerComponentKt$FocusHandler$1.f92298f;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1646166913, i3, -1, "com.carrefour.fid.android.design.components.compose.FocusHandler (FocusHandlerComponent.kt:10)");
            }
            if (z) {
                C15991w3 b = LocalSoftwareKeyboardController.f39366a.mo45554b(o, LocalSoftwareKeyboardController.f39368c);
                C11079d2 d2Var = C11079d2.f28267a;
                o.mo14918M(1618982084);
                boolean n0 = o.mo15006n0(focusRequester) | o.mo15006n0(b) | o.mo15006n0(aVar);
                Object N = o.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new FocusHandlerComponentKt$FocusHandler$2$1(focusRequester, b, aVar, (C11045c<? super FocusHandlerComponentKt$FocusHandler$2$1>) null);
                    o.mo14893C(N);
                }
                o.mo15002m0();
                EffectsKt.m29896h(d2Var, (C11304p) N, o, 70);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C11289a<C11079d2> aVar2 = aVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new FocusHandlerComponentKt$FocusHandler$3(z, focusRequester, aVar2, i, i2));
        }
    }
}
