package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.material.C3036d1;
import androidx.compose.material.DrawerState;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSnackbarComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarComponent.kt\ncom/carrefour/fid/android/design/components/compose/ComposableSingletons$SnackbarComponentKt$lambda-2$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,139:1\n36#2:140\n1114#3,6:141\n*S KotlinDebug\n*F\n+ 1 SnackbarComponent.kt\ncom/carrefour/fid/android/design/components/compose/ComposableSingletons$SnackbarComponentKt$lambda-2$1\n*L\n132#1:140\n132#1:141,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.design.components.compose.ComposableSingletons$SnackbarComponentKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$SnackbarComponentKt$lambda2$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$SnackbarComponentKt$lambda2$1 f92287f = new ComposableSingletons$SnackbarComponentKt$lambda2$1();

    public ComposableSingletons$SnackbarComponentKt$lambda2$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1687947553, i2, -1, "com.carrefour.fid.android.design.components.compose.ComposableSingletons$SnackbarComponentKt.lambda-2.<anonymous> (SnackbarComponent.kt:117)");
            }
            final Variant variant = Variant.Warning;
            C3036d1 f = ScaffoldKt.m13752f((DrawerState) null, (SnackbarHostState) null, oVar2, 0, 3);
            ScaffoldKt.m13747a((C8767m) null, f, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, C8553b.m31048b(oVar2, -1724676390, true, new C11305q<SnackbarHostState, C8592o, Integer, C11079d2>() {
                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                /* renamed from: a */
                public final void mo112147a(@C12579k SnackbarHostState snackbarHostState, @C12580l C8592o oVar, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(snackbarHostState, "it");
                    if ((i & 14) == 0) {
                        if (oVar.mo15006n0(snackbarHostState)) {
                            i2 = 4;
                        } else {
                            i2 = 2;
                        }
                        i |= i2;
                    }
                    if ((i & 91) != 18 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-1724676390, i, -1, "com.carrefour.fid.android.design.components.compose.ComposableSingletons$SnackbarComponentKt.lambda-2.<anonymous>.<anonymous> (SnackbarComponent.kt:123)");
                        }
                        SnackbarComponentKt.m151647a(snackbarHostState, variant, oVar, (i & 14) | 48);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    mo112147a((SnackbarHostState) obj, (C8592o) obj2, ((Number) obj3).intValue());
                    return C11079d2.f28267a;
                }
            }), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, ComposableSingletons$SnackbarComponentKt.f92283a.mo112143a(), oVar, C12888a.f31808q, 12582912, 131053);
            C11079d2 d2Var = C11079d2.f28267a;
            C8592o oVar3 = oVar;
            oVar3.mo14918M(1157296644);
            C3036d1 d1Var = f;
            boolean n0 = oVar3.mo15006n0(d1Var);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new ComposableSingletons$SnackbarComponentKt$lambda2$1$2$1(d1Var, (C11045c<? super ComposableSingletons$SnackbarComponentKt$lambda2$1$2$1>) null);
                oVar3.mo14893C(N);
            }
            oVar.mo15002m0();
            EffectsKt.m29896h(d2Var, (C11304p) N, oVar3, 70);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
