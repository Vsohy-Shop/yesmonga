package com.carrefour.fid.android.checkout.presentation.p071ui.basket.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.C20022q;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.carrefour.fid.android.checkout.C39805b;
import com.carrefour.fid.android.design.theme.C37475b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCheckoutReturnableBagsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutReturnableBagsDialog.kt\ncom/carrefour/fid/android/checkout/presentation/ui/basket/component/CheckoutReturnableBagsDialogKt$CheckoutReturnableBagsDialog$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,144:1\n74#2,6:145\n80#2:177\n84#2:185\n75#3:151\n76#3,11:153\n89#3:184\n76#4:152\n460#5,13:164\n473#5,3:181\n154#6:178\n154#6:179\n154#6:180\n*S KotlinDebug\n*F\n+ 1 CheckoutReturnableBagsDialog.kt\ncom/carrefour/fid/android/checkout/presentation/ui/basket/component/CheckoutReturnableBagsDialogKt$CheckoutReturnableBagsDialog$3\n*L\n37#1:145,6\n37#1:177\n37#1:185\n37#1:151\n37#1:153,11\n37#1:184\n37#1:152\n37#1:164,13\n37#1:181,3\n44#1:178\n54#1:179\n58#1:180\n*E\n"})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutReturnableBagsDialogKt$CheckoutReturnableBagsDialog$3 */
public final class CheckoutReturnableBagsDialogKt$CheckoutReturnableBagsDialog$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C8767m $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutReturnableBagsDialogKt$CheckoutReturnableBagsDialog$3(C8767m mVar) {
        super(2);
        this.$modifier = mVar;
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
                ComposerKt.m29845w0(-209750758, i2, -1, "com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutReturnableBagsDialog.<anonymous> (CheckoutReturnableBagsDialog.kt:35)");
            }
            C8767m f = ScrollKt.m9059f(SizeKt.m10114n(this.$modifier, 0.0f, 1, (Object) null), ScrollKt.m9056c(0, oVar2, 0, 1), false, (C2195g) null, false, 14, (Object) null);
            oVar2.mo14918M(-483455358);
            Arrangement.C2279l r = Arrangement.f6010a.mo7631r();
            C8734c.C8735a aVar = C8734c.f23406a;
            C15560f0 b = ColumnKt.m9863b(r, aVar.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(f);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b2 = Updater.m30180b(oVar);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            C8767m.C8768a aVar2 = C8767m.f23478j;
            C8767m e = columnScopeInstance.mo7714e(PaddingKt.m10028o(aVar2, 0.0f, C16483g.m74435M((float) 8), 0.0f, 0.0f, 13, (Object) null), aVar.mo17068m());
            String d = C16018i.m71858d(C39805b.C39823r.checkout_summary_returnable_bags_title, oVar2, 0);
            C16361p0 i3 = C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b).mo11096i();
            C16209i0 c = C16209i0.f40292b.mo46947c();
            C37475b bVar = C37475b.f94185a;
            TextKt.m14196c(d, e, bVar.mo114230a(), 0, (C16190e0) null, c, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, i3, oVar, C20022q.C20025c.f51280k, 0, DefaultImageHeaderParser.f57417e);
            ColumnScopeInstance columnScopeInstance2 = columnScopeInstance;
            CheckoutReturnableBagsDialogKt.m162548b(SizeKt.m10114n(BackgroundKt.m8824c(columnScopeInstance2.mo7714e(PaddingKt.m10028o(aVar2, 0.0f, C16483g.m74435M((float) 16), 0.0f, 0.0f, 13, (Object) null), aVar.mo17068m()), bVar.mo114234c(), C2694o.m12166h(C16483g.m74435M((float) 10))), 0.0f, 1, (Object) null), oVar, 0, 0);
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
