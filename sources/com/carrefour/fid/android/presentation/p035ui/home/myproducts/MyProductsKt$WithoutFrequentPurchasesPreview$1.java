package com.carrefour.fid.android.presentation.p035ui.home.myproducts;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nMyProducts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyProducts.kt\ncom/carrefour/fid/android/presentation/ui/home/myproducts/MyProductsKt$WithoutFrequentPurchasesPreview$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,251:1\n74#2,7:252\n81#2:285\n85#2:290\n75#3:259\n76#3,11:261\n89#3:289\n76#4:260\n460#5,13:272\n473#5,3:286\n*S KotlinDebug\n*F\n+ 1 MyProducts.kt\ncom/carrefour/fid/android/presentation/ui/home/myproducts/MyProductsKt$WithoutFrequentPurchasesPreview$1\n*L\n243#1:252,7\n243#1:285\n243#1:290\n243#1:259\n243#1:261,11\n243#1:289\n243#1:260\n243#1:272,13\n243#1:286,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsKt$WithoutFrequentPurchasesPreview$1 */
public final class MyProductsKt$WithoutFrequentPurchasesPreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ LazyListState $rowState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyProductsKt$WithoutFrequentPurchasesPreview$1(LazyListState lazyListState) {
        super(2);
        this.$rowState = lazyListState;
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
                ComposerKt.m29845w0(1122163792, i, -1, "com.carrefour.fid.android.presentation.ui.home.myproducts.WithoutFrequentPurchasesPreview.<anonymous> (MyProducts.kt:241)");
            }
            LazyListState lazyListState = this.$rowState;
            oVar.mo14918M(693286680);
            C8767m.C8768a aVar = C8767m.f23478j;
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), oVar, 0);
            oVar.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
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
            MyProductsKt.m106508d(lazyListState, CollectionsKt__CollectionsKt.m40441E(), MyProductsKt$WithoutFrequentPurchasesPreview$1$1$1.f60488f, oVar, 432);
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
