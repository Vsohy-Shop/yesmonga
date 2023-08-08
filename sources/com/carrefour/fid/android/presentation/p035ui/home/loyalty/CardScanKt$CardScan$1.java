package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.text.C16260h0;
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
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37477d;
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
@C11363r0({"SMAP\nCardScan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardScan.kt\ncom/carrefour/fid/android/presentation/ui/home/loyalty/CardScanKt$CardScan$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,192:1\n75#2,5:193\n80#2:224\n84#2:230\n75#3:198\n76#3,11:200\n89#3:229\n76#4:199\n460#5,13:211\n473#5,3:226\n154#6:225\n*S KotlinDebug\n*F\n+ 1 CardScan.kt\ncom/carrefour/fid/android/presentation/ui/home/loyalty/CardScanKt$CardScan$1\n*L\n62#1:193,5\n62#1:224\n62#1:230\n62#1:198\n62#1:200,11\n62#1:229\n62#1:199\n62#1:211,13\n62#1:226,3\n126#1:225\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardScan$1 */
public final class CardScanKt$CardScan$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $card;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onShowCard;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardScanKt$CardScan$1(C11289a<C11079d2> aVar, String str, int i, C8767m mVar) {
        super(2);
        this.$onShowCard = aVar;
        this.$card = str;
        this.$$dirty = i;
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
                ComposerKt.m29845w0(1079384396, i2, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.CardScan.<anonymous> (CardScan.kt:60)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m e = ClickableKt.m8878e(SizeKt.m10110j(aVar, 0.0f, 1, (Object) null), false, (String) null, (C16031g) null, this.$onShowCard, 7, (Object) null);
            Arrangement.C2271e j = Arrangement.f6010a.mo7627j();
            String str = this.$card;
            int i3 = this.$$dirty;
            C8767m mVar = this.$modifier;
            oVar2.mo14918M(-483455358);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 b = ColumnKt.m9863b(j, aVar2.mo17072u(), oVar2, 6);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(e);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            BoxWithConstraintsKt.m9860a(PaddingKt.m10024k(aVar, C37474a.f94133a.mo114202y()), (C8734c) null, false, C8553b.m31048b(oVar2, -114430696, true, new CardScanKt$CardScan$1$1$1(str, i3, mVar)), oVar, 3072, 6);
            String d = C16018i.m71858d(R.string.home_display_card, oVar2, 0);
            float f2 = (float) 23;
            C8767m o = PaddingKt.m10028o(columnScopeInstance.mo7714e(aVar, aVar2.mo17068m()), C16483g.m74435M(f2), 0.0f, C16483g.m74435M(f2), C16483g.m74435M((float) 17), 2, (Object) null);
            int a2 = C16432i.f40718b.mo47667a();
            TextKt.m14196c(d, o, C16009b.m71825a(R.color.ds_grey_5, oVar2, 0), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(a2), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153896h(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b)), oVar, 0, 0, 65016);
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
