package com.carrefour.fid.android.presentation.p035ui.orders.online.view;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nGreenStepProgressComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GreenStepProgressComponent.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/view/ComposableSingletons$GreenStepProgressComponentKt$lambda-4$1$1$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,189:1\n154#2:190\n75#3,6:191\n81#3:223\n85#3:228\n75#4:197\n76#4,11:199\n89#4:227\n76#5:198\n460#6,13:210\n473#6,3:224\n*S KotlinDebug\n*F\n+ 1 GreenStepProgressComponent.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/view/ComposableSingletons$GreenStepProgressComponentKt$lambda-4$1$1$1$1$1\n*L\n120#1:190\n120#1:191,6\n120#1:223\n120#1:228\n120#1:197\n120#1:199,11\n120#1:227\n120#1:198\n120#1:210,13\n120#1:224,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.ComposableSingletons$GreenStepProgressComponentKt$lambda-4$1$1$1$1$1 */
public final class C25244x88fcf97a extends Lambda implements C11305q<C2455e, C8592o, Integer, C11079d2> {
    final /* synthetic */ C8700z0<Integer> $targetStep$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25244x88fcf97a(C8700z0<Integer> z0Var) {
        super(3);
        this.$targetStep$delegate = z0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "$this$item");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(225243819, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.ComposableSingletons$GreenStepProgressComponentKt.lambda-4.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GreenStepProgressComponent.kt:118)");
            }
            C8767m o = SizeKt.m10115o(C8767m.f23478j, C16483g.m74435M((float) 100));
            C8700z0<Integer> z0Var = this.$targetStep$delegate;
            oVar.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), oVar, 0);
            oVar.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(o);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar.mo14947W(a);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
            oVar.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            GreenStepProgressComponentKt.m109297h((C8767m) null, ComposableSingletons$GreenStepProgressComponentKt$lambda4$1.m109265c(z0Var), 5, oVar, C22132b.f56831b, 1);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
