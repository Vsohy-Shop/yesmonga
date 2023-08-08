package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.C3046h;
import androidx.compose.material.C7870j;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.platform.C16007z3;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.C16717v;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.ExitDialogComponentKt$ExitDialogComponent$2 */
public final class ExitDialogComponentKt$ExitDialogComponent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onDismissRequested;
    final /* synthetic */ C16007z3 $uriHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExitDialogComponentKt$ExitDialogComponent$2(C16007z3 z3Var, C11289a<C11079d2> aVar) {
        super(2);
        this.$uriHandler = z3Var;
        this.$onDismissRequested = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(86131163, i2, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.ExitDialogComponent.<anonymous> (ExitDialogComponent.kt:43)");
            }
            final C16007z3 z3Var = this.$uriHandler;
            final C11289a<C11079d2> aVar = this.$onDismissRequested;
            ButtonKt.m13346d(new C11289a<C11079d2>() {
                public final void invoke() {
                    z3Var.mo45708a("https://www.carrefour.fr/services/livraison-domicile/gratuite-commandes");
                    aVar.invoke();
                }
            }, (C8767m) null, false, (C2243g) null, (C7870j) null, (C15218g4) null, (C2223i) null, (C3046h) null, (C2366i0) null, ComposableSingletons$ExitDialogComponentKt.INSTANCE.m172892getLambda1$service_release(), oVar, 805306368, C16717v.C16724g.f42314r);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
