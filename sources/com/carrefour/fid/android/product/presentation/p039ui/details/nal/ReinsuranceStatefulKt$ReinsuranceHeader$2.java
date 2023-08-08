package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.product.C27609f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nReinsuranceStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReinsuranceStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/ReinsuranceStatefulKt$ReinsuranceHeader$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,104:1\n36#2:105\n1114#3,6:106\n*S KotlinDebug\n*F\n+ 1 ReinsuranceStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/ReinsuranceStatefulKt$ReinsuranceHeader$2\n*L\n87#1:105\n87#1:106,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceStatefulKt$ReinsuranceHeader$2 */
public final class ReinsuranceStatefulKt$ReinsuranceHeader$2 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27900p, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReinsuranceStatefulKt$ReinsuranceHeader$2(C11300l<? super C27900p, C11079d2> lVar, int i) {
        super(3);
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(u0Var, "$this$ActionTitleHeader");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1308022011, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceHeader.<anonymous> (ReinsuranceStateful.kt:83)");
            }
            Painter d = C16015f.m71849d(C27609f.C27617h.ic_close_cross, oVar, 0);
            long a0 = C37475b.f94185a.mo114231a0();
            String d2 = C16018i.m71858d(C27609f.C27627r.accessibility_display_reinsurance_action, oVar, 0);
            C11300l<C27900p, C11079d2> lVar = this.$actioner;
            oVar.mo14918M(1157296644);
            boolean n0 = oVar.mo15006n0(lVar);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new ReinsuranceStatefulKt$ReinsuranceHeader$2$1$1(lVar);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            HeaderComponentKt.m151496a(d, false, a0, d2, (C11289a) N, oVar, 8, 2);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
