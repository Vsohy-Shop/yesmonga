package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27906t;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSnackBarComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackBarComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ComposableSingletons$SnackBarComponentKt$lambda-1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,99:1\n25#2:100\n1114#3,6:101\n*S KotlinDebug\n*F\n+ 1 SnackBarComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ComposableSingletons$SnackBarComponentKt$lambda-1$1\n*L\n94#1:100\n94#1:101,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ComposableSingletons$SnackBarComponentKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$SnackBarComponentKt$lambda1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$SnackBarComponentKt$lambda1$1 f67697f = new ComposableSingletons$SnackBarComponentKt$lambda1$1();

    public ComposableSingletons$SnackBarComponentKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1348165932, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.ComposableSingletons$SnackBarComponentKt.lambda-1.<anonymous> (SnackBarComponent.kt:92)");
            }
            oVar.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = new SnackbarHostState();
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            SnackBarComponentKt.m117278a((SnackbarHostState) N, new C27906t.C27909c("Erreur"), (C8767m) null, oVar, 6, 4);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
